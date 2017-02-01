/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.Delivery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class DeliveryDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(Delivery item){
        String sql="INSERT  INTO  Delivery (DeliveryID,Delivery,DeliveryAddress,Contacts,ContactsPhone, "                
                + " EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,   ?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getDeliveryID(),
            item.getDelivery(),
            item.getDeliveryAddress(),
            item.getContacts(),
            item.getContactsPhone(),
                        
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
    public boolean updateItem(Delivery item){
        String sql="UPDATE  Delivery "
                + "SET  Delivery=?, DeliveryAddress=?, Contacts=? ,ContactsPhone=?,"               
                + " EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE DeliveryID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getDelivery(),
            item.getDeliveryAddress(),
            item.getContacts(),
            item.getContactsPhone(),
                        
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getDeliveryID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(Delivery item){
        String sql="UPDATE  Delivery SET  DeleteFlag=?  WHERE DeliveryID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getDeliveryID()
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
    public List<Delivery> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM Delivery WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<Delivery> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                Delivery item=new Delivery();
                item.setDeliveryID(rs.getString("DeliveryID"));
                item.setDelivery(rs.getString("Delivery"));
                item.setDeliveryAddress(rs.getString("DeliveryAddress"));
                item.setContacts(rs.getString("Contacts"));
                item.setContactsPhone(rs.getString("ContactsPhone"));               
                                
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
    public Delivery getItem(String strID){
        String sql="SELECT * FROM Delivery WHERE DeliveryID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        Delivery item=new Delivery();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setDeliveryID(rs.getString("DeliveryID"));
                item.setDelivery(rs.getString("Delivery"));
                item.setDeliveryAddress(rs.getString("DeliveryAddress"));
                item.setContacts(rs.getString("Contacts"));
                item.setContactsPhone(rs.getString("ContactsPhone"));               
                                
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
