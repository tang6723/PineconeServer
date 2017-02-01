/*
 * Session Pool 用户状态沲
 * 1. 根据业务规则，一个用户只允许登录一次，不允许多设备同时登录
 */
package com.ft.session;

import com.ft.common.DataService;
import com.ft.common.SystemLogHelper;
import com.ft.db.mapping.SystemLogData;
import java.util.HashMap;
import com.ft.db.mapping.UserStatus;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.BASE64Encoder;

/*
 * @author Ming
 */
public class SessionPool {

    /*
     * 保存用户状态
     * key:   UserName
     * Value: 用户状态
     */
    private static final HashMap<String, UserStatus> SESSION_POOL = new HashMap<>();

    /*
     * 对于多线程，使用 LOCK 对 Session Pool 进行保护，使 POOl 内资源是同步的
     */
    private static final Lock SESSION_LOCK = new ReentrantLock();

    /*
     * 保存用户状态，并返回 Token，如果返回 NULl 则认为出现异常，登陆失败
     */
    public static String saveUserStatus(UserStatus userStatus) {

        // 判断 POOL 当中是否已存在该用户，如果存在则认为该用户已经登陆过
        UserStatus existUserStatus = SESSION_POOL.get(userStatus.getUserName());

        if (existUserStatus != null) {

            // 如果设备信息，IP地址都一样，说明只是前端出现偶现异常，把正确 Token 告诉用户，让用户可以登陆，如果验证失败，返回 NULL，防止有人冒用信息——帐号被盗
            if (existUserStatus.getUserName().equals(userStatus.getUserName())
                    && existUserStatus.getDevice().equals(userStatus.getDevice())
                    && existUserStatus.getIP().equals(userStatus.getIP())) {
                return existUserStatus.getToken();
            }
        } else { // 用户状态保存成功
            String token = generateToken(userStatus);
            userStatus.setToken(token);

            try {
                SESSION_LOCK.lock();
                SESSION_POOL.put(userStatus.getUserName(), userStatus);
            } finally {
                SESSION_LOCK.unlock();
            }

            return token;
        }

        return null;
    }

    /*
     * 用户登出
     * @return True : 成功, False : 失败
     */
    public static boolean logout(String token) {
        if (token.isEmpty()) {
            return false;
        }

        String[] array = token.split("_");

        if (array.length != 2) {
            return false;
        }

        String userName = array[0];

        UserStatus userStatus = getUserStatus(userName);

        if (userStatus == null) {
            return false;
        }

        if (!userStatus.getToken().equals(token)) {
            return false;
        }

        try {
            SESSION_LOCK.lock();
            SESSION_POOL.remove(userName);
        } finally {
            SESSION_LOCK.unlock();
        }

        return true;
    }

    /*
     * 验证用户 Token 是否有效
     * Token 格式： UserName_XXXXXXXXXXXXXXXXX
     */
    public static boolean validateUserToken(String token) {
        if (token.isEmpty()) {
            return false;
        }

        String[] array = token.split("_");

        if (array.length != 2) {
            return false;
        }

        String userName = array[0];

        UserStatus userStatus = getUserStatus(userName);

        if (userStatus == null) {
            return false;
        }

        if (!userStatus.getToken().equals(token)) {
            return false;
        }

        try {
            SESSION_LOCK.lock();
            userStatus.setLastUpdateTime(new Date());
        } finally {
            SESSION_LOCK.unlock();
        }

        return true;
    }

    /*
     * 清除无效的 Session，读取所有Session，通过处理过期的Session，由外部程序触发
     * @param Timeout 根据 timeout 时间清除失效的会话状态, 0 表示永久不过时， TimeOut 单位：分钟
     */
    public static void clearInvalidSession(int timeout) {
        if (timeout == 0) {
            return;
        }

        for (String key : SESSION_POOL.keySet()) {
            UserStatus status = SESSION_POOL.get(key);

            Date d1 = new Date();
            Date d2 = status.getLastUpdateTime();

            long diff = d1.getTime() - d2.getDate(); // 计算时间差
            long diffMin = diff / (1000 * 60);       // 计算时间差 —— 中间相差多少分钟

            if (diffMin >= timeout) {                // 如果相差时间大于指定时间，则清除 Session  
                try {
                    SESSION_LOCK.lock();
                    SESSION_POOL.remove(key);
                } finally {
                    SESSION_LOCK.unlock();
                }
            }
        }
    }

    /*
     * 清空 Session Pool
     */
    public static void clearAllSession() {
        try {
            SESSION_LOCK.lock();
            SESSION_POOL.clear();
        } finally {
            SESSION_LOCK.unlock();
        }
    }

    /*
     * 根据 UserName 获取用户状态
     */
    protected static UserStatus getUserStatus(String userName) {
        return (UserStatus) SESSION_POOL.get(userName);
    }

    /*
     * 根据用户信息生成 Token, 格式： UserName_XXXXXXXXXXXXXXXXX
     */
    private static String generateToken(UserStatus userStatus) {
        String value = userStatus.getUserName() + userStatus.getDevice() + userStatus.getIP() + System.currentTimeMillis() + new Random().nextInt();
        String token = "";

        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] b = md.digest(value.getBytes()); //生成数据指纹

            BASE64Encoder be = new BASE64Encoder();
            token = be.encode(b);
        } catch (NoSuchAlgorithmException ex) {
            SystemLogData systemLog = SystemLogHelper.getSystemLogData(ex);
            DataService.writeSystemLog(systemLog);
        }

        return String.format("%s_%s", userStatus.getUserName(), token);
    }

}