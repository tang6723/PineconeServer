/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.GoodsRole;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class GoodsRoleDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(GoodsRole item){
        String sql="INSERT  INTO  GoodsRole (GoodsRoleID,GoodsID,SerialNo,RoleCode,RoleDesc, "                          
                + " EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getGoodsRoleID(),
            item.getGoodsID(),
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
    public boolean updateItem(GoodsRole item){
        String sql="UPDATE  GoodsRole "
                + "SET  GoodsID=?, SerialNo=?, RoleCode=? ,RoleDesc=?,"                
                + "  EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE GoodsRoleID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getGoodsID(),
            DatabaseUtility.getInt(item.getSerialNo()), 
            item.getRoleCode(),
            item.getRoleDesc(),
            
            item.getEnableFlag(),
            item.getDeleteFlag(),            
            item.getRemarks(),
            
            item.getGoodsRoleID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(GoodsRole item){
        String sql="UPDATE  GoodsRole SET  DeleteFlag=?  WHERE GoodsRoleID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getGoodsRoleID()
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
    public List<GoodsRole> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM GoodsRole WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<GoodsRole> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                GoodsRole item=new GoodsRole();
                
                item.setGoodsRoleID(rs.getString("GoodsRoleID"));
                item.setGoodsID(rs.getString("GoodsID"));
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
    public GoodsRole getItem(String strID){
        String sql="SELECT * FROM AccountAlarm WHERE AccountAlarmID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        GoodsRole item=new GoodsRole();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                 item.setGoodsRoleID(rs.getString("GoodsRoleID"));
                item.setGoodsID(rs.getString("GoodsID"));
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
