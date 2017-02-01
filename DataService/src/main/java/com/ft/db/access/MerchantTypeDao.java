/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.MerchantType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class MerchantTypeDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(MerchantType item){
        String sql="INSERT  INTO  MerchantType (MerchantTypeID,SerialNo,Sector,SectorType,EnableFlag, "                
                + " DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getMerchantTypeID(),
             DatabaseUtility.getInt(item.getSerialNo()),
            item.getSector(),
            item.getSectorType(),
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
    public boolean updateItem(MerchantType item){
        String sql="UPDATE  MerchantType "
                + "SET  SerialNo=?, Sector=?, SectorType=? ,EnableFlag=?,"                
                + "  DeleteFlag=?, Remarks=? "
                + "WHERE MerchantTypeID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            DatabaseUtility.getInt(item.getSerialNo()),
            item.getSector(),
            item.getSectorType(),
            item.getEnableFlag(),
                        
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getMerchantTypeID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(MerchantType item){
        String sql="UPDATE  MerchantType SET  DeleteFlag=?  WHERE MerchantTypeID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getMerchantTypeID()
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
    public List<MerchantType> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM MerchantType WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<MerchantType> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                MerchantType item=new MerchantType();
                item.setMerchantTypeID(rs.getString("MerchantTypeID"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setSector(rs.getString("Sector"));
                item.setSectorType(rs.getString("SectorType"));
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
    public MerchantType getItem(String strID){
        String sql="SELECT * FROM MerchantType WHERE MerchantTypeID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        MerchantType item=new MerchantType();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
               
                item.setMerchantTypeID(rs.getString("MerchantTypeID"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setSector(rs.getString("Sector"));
                item.setSectorType(rs.getString("SectorType"));
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
