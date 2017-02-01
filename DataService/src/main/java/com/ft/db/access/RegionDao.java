/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.Region;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class RegionDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(Region item){
        String sql="INSERT  INTO  Region (RegionID,SerialNo,Province,City,County, "                
                + "Street,ZipCode,EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getRegionID(),
            DatabaseUtility.getInt(item.getSerialNo()),
            item.getProvince(),
            item.getCity(),
            item.getCounty(),
            
            
            item.getStreet(),            
            item.getZipCode(),
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
    public boolean updateItem(Region item){
        String sql="UPDATE  Region "
                + "SET  SerialNo=?, Province=?, City=? ,County=?,"                
                + "Street=?,ZipCode=?, EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE RegionID=?";
        int affectRowCount = 0;
        String[] parm={            
            DatabaseUtility.getInt(item.getSerialNo()),
            item.getProvince(),
            item.getCity(),
            item.getCounty(),
            
            
            item.getStreet(),            
            item.getZipCode(),
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getRegionID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(Region item){
        String sql="UPDATE  Region SET  State=?  WHERE AccountAlarmID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getRegionID()
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
    public List<Region> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM Region WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<Region> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                Region item=new Region();
                item.setRegionID(rs.getString("RegionID"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setProvince(rs.getString("Province"));
                item.setCity(rs.getString("City"));
                item.setCounty(rs.getString("County"));
                
                
                item.setStreet(rs.getString("Street"));                
                item.setZipCode(rs.getString("ZipCode"));
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
    public Region getItem(String strID){
        String sql="SELECT * FROM Region WHERE RegionID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        Region item=new Region();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){                
                item.setRegionID(rs.getString("RegionID"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setProvince(rs.getString("Province"));
                item.setCity(rs.getString("City"));
                item.setCounty(rs.getString("County"));
                
                
                item.setStreet(rs.getString("Street"));                
                item.setZipCode(rs.getString("ZipCode"));
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
