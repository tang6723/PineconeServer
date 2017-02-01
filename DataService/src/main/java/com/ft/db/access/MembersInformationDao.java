/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.MembersInformation;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class MembersInformationDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(MembersInformation item){
        String sql="INSERT  INTO  MembersInformation (MembersID,MembersCode,MembersName,IDCard,Phone, "
                + " Password,MembersImage,Nickname,Birthdays,MembersAddress, "
                + " CreateTime,AuthenticationTime,LogTime,PasswordTime,EnableFlag,  "                 
                + " DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,   ?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getMembersID(),
            item.getMembersCode(),
            item.getMembersName(),
            item.getIDCard(),
            item.getPhone(),
            
            item.getPassword(),
            item.getMembersImage(),
            item.getNickname(),
            DatabaseUtility.getDate(item.getBirthdays()),
            item.getMembersAddress(),
            
            DatabaseUtility.getDate(item.getCreateTime()),
            DatabaseUtility.getDate(item.getAuthenticationTime()),
            DatabaseUtility.getDate(item.getLogTime()),
            DatabaseUtility.getDate(item.getPasswordTime()),
            item.getEnableFlag(),
                        
            item.getDeleteFlag(),
            item.getRemarks()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 更新
     * @param item
     * @return 
     */
    public boolean updateItem(MembersInformation item){
        String sql="UPDATE  MembersInformation "
                + "SET  MembersCode=?, MembersName=?, IDCard=? ,Phone=?,"
                + "Password=?, MembersImage=?, Nickname=?, Birthdays=?, MembersAddress=?,"
                + "CreateTime=?, AuthenticationTime=?, LogTime=?, PasswordTime=?, EnableFlag=?,"                
                + " DeleteFlag=?, Remarks=? "
                + "WHERE MembersID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getMembersCode(),
            item.getMembersName(),
            item.getIDCard(),
            item.getPhone(),
            
            item.getPassword(),
            item.getMembersImage(),
            item.getNickname(),
            DatabaseUtility.getDate(item.getBirthdays()),
            item.getMembersAddress(),
            
            DatabaseUtility.getDate(item.getCreateTime()),
            DatabaseUtility.getDate(item.getAuthenticationTime()),
            DatabaseUtility.getDate(item.getLogTime()),
            DatabaseUtility.getDate(item.getPasswordTime()),
            item.getEnableFlag(),
                        
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getMembersID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(MembersInformation item){
        String sql="UPDATE  MembersInformation SET  DeleteFlag=?  WHERE MembersID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getMembersID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 根据查询条件返回列表
     * @param strWhereQuery
     * @param parm
     * @return 
     */
    public List<MembersInformation> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM MembersInformation WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<MembersInformation> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                MembersInformation item=new MembersInformation();
                item.setMembersID(rs.getString("MembersID"));
                item.setMembersCode(rs.getString("MembersCode"));
                item.setMembersName(rs.getString("MembersName"));
                item.setIDCard(rs.getString("IDCard"));
                item.setPhone(rs.getString("Phone"));                
                
                item.setPassword(rs.getString("Password"));
                item.setMembersImage(rs.getString("MembersImage"));
                item.setNickname(rs.getString("Nickname"));
                item.setBirthdays(rs.getDate("Birthdays"));
                item.setMembersAddress(rs.getString("MembersAddress"));
                
                item.setCreateTime(rs.getDate("CreateTime"));
                item.setAuthenticationTime(rs.getDate("AuthenticationTime"));
                item.setLogTime(rs.getDate("LogTime"));
                item.setPasswordTime(rs.getDate("PasswordTime"));
                item.setEnableFlag(rs.getString("EnableFlag"));            
                
                item.setDeleteFlag(rs.getString("DeleteFlag"));
                item.setRemarks(rs.getString("Remarks"));
                
                itemList.add(item);

            }  
            rs.close();
        }catch (SQLException ex) {  
            itemList=null;
            System.out.println("MySQL 执行SQL语句失败，SQL = " + sql + ";  错误信息：" + ex.getMessage());
        }finally{
            DatabaseUtility.close();
        }
        return itemList;
    }
    
    /**
     * 根据主ID返回单条记录：Item
     * @param strID
     * @return 
     */
    public MembersInformation getItem(String strID){
        String sql="SELECT * FROM MembersInformation WHERE MembersID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        MembersInformation item=new MembersInformation();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setMembersID(rs.getString("MembersID"));
                item.setMembersCode(rs.getString("MembersCode"));
                item.setMembersName(rs.getString("MembersName"));
                item.setIDCard(rs.getString("IDCard"));
                item.setPhone(rs.getString("Phone"));                
                
                item.setPassword(rs.getString("Password"));
                item.setMembersImage(rs.getString("MembersImage"));
                item.setNickname(rs.getString("Nickname"));
                item.setBirthdays(rs.getDate("Birthdays"));
                item.setMembersAddress(rs.getString("MembersAddress"));
                
                item.setCreateTime(rs.getDate("CreateTime"));
                item.setAuthenticationTime(rs.getDate("AuthenticationTime"));
                item.setLogTime(rs.getDate("LogTime"));
                item.setPasswordTime(rs.getDate("PasswordTime"));
                item.setEnableFlag(rs.getString("EnableFlag"));            
                
                item.setDeleteFlag(rs.getString("DeleteFlag"));
                item.setRemarks(rs.getString("Remarks"));

            }
            rs.close();
            
        }catch (SQLException ex) {  
            item=null;
            System.out.println("MySQL 执行SQL语句失败，SQL = " + sql + ";  错误信息：" + ex.getMessage());
        }finally{
            DatabaseUtility.close();
        }
        return item;
    }
    
    
}
