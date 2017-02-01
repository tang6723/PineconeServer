/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.Merchant;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class MerchantDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(Merchant item){
        String sql="INSERT  INTO  Merchant (MerchantID,SerialNo,Province,City,County, "
                + " Street,Merchant,MerchantAddress,MerchantPhone,GIS, "
                + " ExpirationDate,UsingTime,UsingRole,AgentID,AgentName,  "
                + "RunningID,RunningName,DeliveryID,DeliveryName,EnableFlag, "               
                + "DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,   ?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getMerchantID(),
            DatabaseUtility.getInt(item.getSerialNo()),   
            item.getUsingRole(),
            item.getAgentID(),
            item.getAgentName(),
            
            item.getRunningID(),
            item.getRunningName(),
            item.getDeliveryID(),
            item.getDeliveryName(),  
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
    public boolean updateItem(Merchant item){
        String sql="UPDATE  Merchant "
                + "SET  SerialNo=?, Province=?, City=? ,County=?,"
                + "Street=?, Merchant=?, MerchantAddress=?, MerchantPhone=?, GIS=?,"
                + "ExpirationDate=?, UsingTime=?, UsingRole=?, AgentID=?, AgentName=?,"
                + "RunningID=?, RunningName=?, DeliveryID=?, DeliveryName=?, EnableFlag=?,"                
                + "  DeleteFlag=?, Remarks=? "
                + "WHERE MerchantID=?";
        int affectRowCount = 0;
        String[] parm={     
            DatabaseUtility.getInt(item.getSerialNo()),            
            item.getProvince(),
            item.getCity(),
            item.getCounty(),
            
            item.getStreet(),
            item.getMerchant(),
            item.getMerchantAddress(),
            item.getMerchantPhone(),
            item.getGIS(),
            
            DatabaseUtility.getDate(item.getExpirationDate()),
            DatabaseUtility.getDate(item.getUsingTime()),
            item.getUsingRole(),
            item.getAgentID(),
            item.getAgentName(),
            
            item.getRunningID(),
            item.getRunningName(),
            item.getDeliveryID(),
            item.getDeliveryName(),  
            item.getEnableFlag(),
                                 
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getMerchantID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(Merchant item){
        String sql="UPDATE  Merchant SET  DeleteFlag=?  WHERE MerchantID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getMerchantID()
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
    public List<Merchant> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM Merchant WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<Merchant> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                Merchant item=new Merchant();
                item.setMerchantID(rs.getString("MerchantID"));                
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setProvince(rs.getString("Province"));
                item.setCity(rs.getString("City"));
                item.setCounty(rs.getString("County"));
                
                item.setStreet(rs.getString("Street"));
                item.setMerchant(rs.getString("Merchant"));
                item.setMerchantAddress(rs.getString("MerchantAddress"));
                item.setMerchantPhone(rs.getString("MerchantPhone"));
                item.setGIS(rs.getString("GIS"));
                
                item.setExpirationDate(rs.getDate("ExpirationDate"));
                item.setUsingTime(rs.getDate("UsingTime"));
                item.setUsingRole(rs.getString("UsingRole"));
                item.setAgentID(rs.getString("AgentID"));
                item.setAgentName(rs.getString("AgentName"));
                
                item.setRunningID(rs.getString("RunningID"));
                item.setRunningName(rs.getString("RunningName"));
                item.setDeliveryID(rs.getString("DeliveryID"));
                item.setDeliveryName(rs.getString("DeliveryName"));
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
    public Merchant getItem(String strID){
        String sql="SELECT * FROM Merchant WHERE MerchantID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        Merchant item=new Merchant();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setMerchantID(rs.getString("MerchantID"));                
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setProvince(rs.getString("Province"));
                item.setCity(rs.getString("City"));
                item.setCounty(rs.getString("County"));
                
                item.setStreet(rs.getString("Street"));
                item.setMerchant(rs.getString("Merchant"));
                item.setMerchantAddress(rs.getString("MerchantAddress"));
                item.setMerchantPhone(rs.getString("MerchantPhone"));
                item.setGIS(rs.getString("GIS"));
                
                item.setExpirationDate(rs.getDate("ExpirationDate"));
                item.setUsingTime(rs.getDate("UsingTime"));
                item.setUsingRole(rs.getString("UsingRole"));
                item.setAgentID(rs.getString("AgentID"));
                item.setAgentName(rs.getString("AgentName"));
                
                item.setRunningID(rs.getString("RunningID"));
                item.setRunningName(rs.getString("RunningName"));
                item.setDeliveryID(rs.getString("DeliveryID"));
                item.setDeliveryName(rs.getString("DeliveryName"));
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
