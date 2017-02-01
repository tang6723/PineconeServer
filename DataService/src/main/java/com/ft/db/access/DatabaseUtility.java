/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.GoodsImage;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.DriverManager;


/**
 *
 * @author Tang
 */
public class DatabaseUtility {

    private static final String CLASSNAME = "com.mysql.jdbc.Driver";
    private static String _host = "123.206.45.251"; //127.0.0.1
    private static String _url;
    private static String _db = "rea";    //readata
    private static String _user = "rea";     //root
    private static String _password = "rea"; //1111

    private static Connection conn = null;
    private static PreparedStatement pstmt = null;
    private static CallableStatement callStatement = null;
    private static ResultSet resultSet = null;
    private static Statement statement = null;
    
    /* 
     *  实例化一个 MYSQL 对象，使用内置的数据库参数
     */
    public static void initDatabaseUtility() {
        try {
            //_host = DatabaseParam.getInstance().getMySqlDbHost();
            //_db = DatabaseParam.getInstance().getMySqlDb();
            //_user = DatabaseParam.getInstance().getMySqlDbUser();
            //_password = DatabaseParam.getInstance().getMySqlDbPwd();
            _url = String.format("jdbc:mysql://%s:3306/%s?characterEncoding=utf8", _host, _db);
            Class.forName(CLASSNAME).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("MySQL 创建数据驱动失败，错误信息：" + ex.getMessage());
        }
    }

    /*
     * 创建数据库连接
     *
     * @return
     */
    public static Connection getConnection() {
        createConnection();
        return conn;
    }
    
    /*
     * 创建一个数据库连接对象
     */
    public static void createConnection() {
        if (conn != null) {
            return;
        }else{
            initDatabaseUtility();
        }
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(_url, _user, _password);
            conn.setAutoCommit(true);
            statement = conn.createStatement();        
        } catch (SQLException  ex) {
            System.out.println("MySQL 创建数据连接失败，错误信息：" + ex.getMessage());
        }
    }

    /*
     * 执行sql语句的增 改
     *
     * @param sql
     * @param param
     * @return
     */
    public static Integer executeSQL(String sql, String[] param) {
        Integer result = 0;
        conn = null;
        pstmt = null;
        try {
            conn = getConnection();
            conn.setAutoCommit(true);
            pstmt = conn.prepareStatement(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    if (param[i] == null) {
                        pstmt.setNull(i + 1, java.sql.Types.VARCHAR);
                        //pstmt.setNull(i + 1, java.sql.Types.INTEGER);
                        //pstmt.setNull(i + 1, java.sql.Types.DATE);

                    } else {
                        pstmt.setString(i + 1, param[i]);
                    }
                }
            }
            result = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("MySQL 执行SQL语句失败，SQL = " + sql + ";  错误信息：" + ex.getMessage());
        } finally {
            close();
        }
        return result;
    }

    /*
     * 执行sql语句图形的增加
     *
     * @param sql
     * @param param
     * @return
     */
    
    public static Integer insertImageSQL(String sql, GoodsImage param) {
        Integer result = 0;
        conn = null;
        pstmt = null;
        /*
        item.getGoodsImageID(),
            item.getMerchantGoodsID(),
            item.getImageType(),
            DatabaseUtility.getInt(item.getSerialNo()),           
            item.getGoodsUrl(),
            
            item.getGoodsImage(),
            item.getEnableFlag(),
            item.getDeleteFlag(),            
            item.getRemarks()
        */
        try {
            conn = getConnection();
            conn.setAutoCommit(true);
            pstmt = conn.prepareStatement(sql);

            if (param.getGoodsImageID() == null) {
                pstmt.setNull(1, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(1, param.getGoodsImageID());
            }

            if (param.getMerchantGoodsID() == null) {
                pstmt.setNull(2, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(2, param.getMerchantGoodsID());
            }
            if (param.getImageType() == null) {
                pstmt.setNull(3, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(3, param.getImageType());
            }
            if (param.getSerialNo() == null) {
                pstmt.setNull(4, java.sql.Types.BLOB);
            } else {
                pstmt.setBytes(4, param.getSerialNo());
            }
            if (param.getGoodsUrl() == null) {
                pstmt.setNull(5, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(5, param.getGoodsUrl());
            }
            if (param.getGoodsImage() == null) {
                pstmt.setNull(6, java.sql.Types.BLOB);
            } else {
                pstmt.setBytes(6, param.getGoodsImage());
            }
            if (param.getEnableFlag() == null) {
                pstmt.setNull(7, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(7, param.getEnableFlag());
            }
            if (param.getDeleteFlag() == null) {
                pstmt.setNull(8, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(8, param.getDeleteFlag());
            }
            if (param.getRemarks() == null) {
                pstmt.setNull(9, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(9, param.getRemarks());
            }
            result = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("MySQL 执行SQL语句失败，SQL = " + sql + ";  错误信息：" + ex.getMessage());
        } finally {
            close();
        }
        return result;
    }

    /*
     * 执行sql语句图形的修改
     *
     * @param sql
     * @param param
     * @return
     */
    /*
    public static Integer updateItemSQL(String sql, SystemImage param) {
        Integer result = 0;
        conn = null;
        pstmt = null;
        try {
            conn = getConnection();
            conn.setAutoCommit(true);
            pstmt = conn.prepareStatement(sql);

            if (param.getRowGUID() == null) {
                pstmt.setNull(1, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(1, param.getRowGUID());
            }

            if (param.getImageType() == null) {
                pstmt.setNull(2, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(2, param.getImageType());
            }
            if (param.getImageName() == null) {
                pstmt.setNull(3, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(3, param.getImageName());
            }
            if (param.getGraph() == null) {
                pstmt.setNull(4, java.sql.Types.BLOB);
            } else {
                pstmt.setBytes(4, param.getGraph());
            }

            if (param.getThumbnail() == null) {
                pstmt.setNull(5, java.sql.Types.BLOB);
            } else {
                pstmt.setBytes(5, param.getThumbnail());
            }

            if (param.getGraphURL() == null) {
                pstmt.setNull(6, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(6, param.getGraphURL());
            }

            if (param.getThumbnailURL() == null) {
                pstmt.setNull(7, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(7, param.getThumbnailURL());
            }

            if (param.getState() == null) {
                pstmt.setNull(8, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(8, param.getState());
            }

            if (param.getRemarks() == null) {
                pstmt.setNull(9, java.sql.Types.VARCHAR);
            } else {
                pstmt.setString(9, param.getRemarks());
            }

            pstmt.setLong(10, param.getSystemImageID());
            result = pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("MySQL 执行SQL语句失败，SQL = " + sql + ";  错误信息：" + ex.getMessage());
        } finally {
            close();
        }
        return result;
    }
*/
    /*
     * 批处理的增删改
     *
     * @param sql
     * @return
     */
    public static Integer executeSQLBatch(String sql) {
        Integer result = 1;
        try {
            conn = null;
            statement = null;
            conn = getConnection();
            //手动提交事务
            conn.setAutoCommit(false);

            statement = conn.createStatement();
            statement.addBatch(sql);
            int[] resultArray = statement.executeBatch();
            for (int i = 0; resultArray.length > 0 && i < resultArray.length; i++) {
                if (resultArray[i] <= 0) {
                    result = 0;
                }
            }
            if (result > 0) {
                conn.commit();
            }
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();//回滚事务
                } catch (Exception ex) {
                    System.out.println("MySQL 事务回滚失败，错误信息：" + ex.getMessage());
                }
            }
            System.out.println("MySQL 提交事务失败，SQL = " + sql + ";  错误信息：" + e.getMessage());
        } finally {
            close();
        }
        return result;
    }

    /*
     * 执行存储过程的增删改
     *
     * @param sql
     * @param param
     * @return
     */
    public static Integer executeSQLProc(String sql, String[] param) throws SQLException {
        Integer result = 0;
        conn = null;
        callStatement = null;
        try {
            conn = getConnection();
            callStatement = conn.prepareCall(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    callStatement.setString(i + 1, param[i]);
                }
            }
            result = callStatement.executeUpdate();
            conn.commit();//提交事务
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();//回滚事务
                } catch (Exception ex) {
                    System.out.println("MySQL 事务回滚失败，错误信息：" + ex.getMessage());
                }
            }
            System.out.println("MySQL 提交事务失败，SQL = " + sql + ";  错误信息：" + e.getMessage());
        } finally {
            close();
        }
        return result;
    }

    /*
     * 普通sql查询
     *
     * @param sql
     * @param param
     * @return
     */
    public static ResultSet queryResultSet(String sql, String[] param) {
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(sql);
            
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    pstmt.setString(i + 1, param[i]);
                }
            }
            
            resultSet = pstmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("MySQL 执行SQL语句失败，SQL = " + sql + ";  错误信息：" + e.getMessage());
        }
        return resultSet;
    }

    public static Integer getTotalCount(String tableString, String queryString) {
        Integer rowcount = 0;
        String strSQL = "SELECT COUNT(0) AS totalcount FROM " + tableString + "WHERE " + queryString;
        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(strSQL);
            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                rowcount = resultSet.getInt("totalcount");
            }
        } catch (SQLException e) {
            System.out.println("MySQL 执行SQL语句失败，SQL = " + strSQL + ";  错误信息：" + e.getMessage());
        }
        return rowcount;
    }

    /*
     * 执行存储过程的查询
     *
     * @param sql
     * @param param
     * @return
     */
    public static ResultSet executeProc(String sql, String[] param) {
        conn = null;
        callStatement = null;
        resultSet = null;
        try {
            conn = getConnection();
            callStatement = conn.prepareCall(sql);
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    callStatement.setString(i + 1, param[i]);
                }
            }
            resultSet = callStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println("MySQL 执行SQL语句失败，SQL = " + sql + ";  错误信息：" + e.getMessage());
        }
        return resultSet;
    }

    /*
     * 关闭数据库连接
     */
    public static void close() {
        try {
            closeStatement();
            
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
            
            if (conn != null) {
                conn = null;
            }
        } catch (SQLException ex) {
            System.out.println("MySQL 断开数据连接失败，错误信息：" + ex.getMessage());
        }
    }

    /*
     * 关闭 Statement
     */
    public static void closeStatement() {
        try {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
            if (statement != null) {
                statement = null;
            }
            if (callStatement != null && !callStatement.isClosed()) {
                callStatement.close();
            }
            if (callStatement != null) {
                callStatement = null;
            }
            if (pstmt != null && !pstmt.isClosed()) {
                pstmt.close();
            }
            if (pstmt != null) {
                pstmt = null;
            }
        } catch (SQLException ex) {
            System.out.println("MySQL 关闭Statement失败，错误信息：" + ex.getMessage());
        }
    }

    /*
     * 将一个 Integer 转成String
     * @param src
     * @return
     */
    public static String getInt(Integer src) {
        if (src == null) {
            return null;
        } else {
            return String.valueOf(src);
        }
    }

    /*
     * 将一个 Long 转成String
     * @param src
     * @return
     */
    public static String getLong(Long src) {
        if (src == null) {
            return null;
        } else {
            return String.valueOf(src);
        }
    }

    /*
     * 将一个 Float 转成String
     * @param src
     * @return
     */
    public static String getFloat(Float src) {
        if (src == null) {
            return null;
        } else {
            return String.valueOf(src);
        }
    }

    /*
     * 将一个 Date 转成String
     * @param src
     * @return
     */
    public static String getDate(Date src) {
        if (src == null) {
            return null;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sdf.format(src);
        }

    }
}