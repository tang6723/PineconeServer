/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.MerchantRole;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class MerchantRoleDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(MerchantRole item){
        String sql="INSERT  INTO  MerchantRole (MerchantRoleID,MerchantID,SerialNo,RoleCode,RoleDesc, "                
                + "EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,   ?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getMerchantRoleID(),
            item.getMerchantID(),
            DatabaseUtility.getInt(item.getSerialNo()),            
            item.getRoleCode(),
            item.getRoleDesc(),
                                              
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
    public boolean updateItem(MerchantRole item){
        String sql="UPDATE  MerchantRole "
                + "SET  MerchantID=?, SerialNo=?, RoleCode=? ,RoleDesc=?,"               
                + " EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE MerchantRoleID=?";
        int affectRowCount = 0;
        String[] parm={            
            item.getMerchantID(),
            DatabaseUtility.getInt(item.getSerialNo()),            
            item.getRoleCode(),
            item.getRoleDesc(),
                                              
            item.getEnableFlag(),
            item.getDeleteFlag(),            
            item.getRemarks(),
            
            item.getMerchantRoleID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(MerchantRole item){
        String sql="UPDATE  MerchantRole SET  State=?  WHERE MerchantRoleID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getMerchantRoleID()
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
    public List<MerchantRole> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM MerchantRole WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<MerchantRole> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                MerchantRole item=new MerchantRole();
                item.setMerchantRoleID(rs.getString("MerchantRoleID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setRoleCode(rs.getString("RoleCode"));
                item.setRoleDesc(rs.getString("RoleDesc"));
                                
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
    public MerchantRole getItem(String strID){
        String sql="SELECT * FROM MerchantRole WHERE MerchantRoleID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        MerchantRole item=new MerchantRole();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
               
                item.setMerchantRoleID(rs.getString("MerchantRoleID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setRoleCode(rs.getString("RoleCode"));
                item.setRoleDesc(rs.getString("RoleDesc"));
                                
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
