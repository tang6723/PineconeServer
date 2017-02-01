/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.Orders;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class OrdersDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(Orders item){
        String sql="INSERT  INTO  Orders (OrdersID,OrdersCode,MerchantID,Merchant,MembersID, "
                + " Contacts,ContactsPhone,ContactsAddress,PayType,TotalPrice, "
                + " TakeOut,PayTotal,CouponID,CouponTotal,ShippingCost,  "
                + "CashBack,OrderCoupon,OrdersState,TradeTime,BusinessTime, "               
                + "RecordTime,AuditTime,EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getOrdersID(),
            item.getOrdersCode(),
            item.getMerchantID(),
            item.getMerchant(),
            item.getMembersID(),
            
            item.getContacts(),
            item.getContactsPhone(),
            item.getContactsAddress(),
            item.getPayType(),
            DatabaseUtility.getFloat(item.getTotalPrice()), 
            
            item.getTakeOut(),
            DatabaseUtility.getFloat(item.getPayTotal()), 
            item.getCouponID(),
            DatabaseUtility.getFloat(item.getCouponTotal()), 
            DatabaseUtility.getFloat(item.getShippingCost()), 
            
            DatabaseUtility.getFloat(item.getCashBack()),
            DatabaseUtility.getFloat(item.getOrderCoupon()), 
            item.getOrdersState(),
            DatabaseUtility.getDate(item.getTradeTime()),              
            DatabaseUtility.getDate(item.getBusinessTime()),
            
            DatabaseUtility.getDate(item.getRecordTime()),
            DatabaseUtility.getDate(item.getAuditTime()),            
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
    public boolean updateItem(Orders item){
        String sql="UPDATE  Orders "
                + "SET  OrdersCode=?, MerchantID=?, Merchant=? ,MembersID=?,"
                + "Contacts=?, ContactsPhone=?, ContactsAddress=?, PayType=?, TotalPrice=?,"
                + "TakeOut=?, PayTotal=?, CouponID=?, CouponTotal=?, ShippingCost=?,"
                + "CashBack=?, OrderCoupon=?, OrdersState=?, TradeTime=?, BusinessTime=?,"                
                + "RecordTime=?, AuditTime=?,EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE OrdersID=?";
        int affectRowCount = 0;
        String[] parm={            
            item.getOrdersCode(),
            item.getMerchantID(),
            item.getMerchant(),
            item.getMembersID(),
            
            item.getContacts(),
            item.getContactsPhone(),
            item.getContactsAddress(),
            item.getPayType(),
            DatabaseUtility.getFloat(item.getTotalPrice()), 
            
            item.getTakeOut(),
            DatabaseUtility.getFloat(item.getPayTotal()), 
            item.getCouponID(),
            DatabaseUtility.getFloat(item.getCouponTotal()), 
            DatabaseUtility.getFloat(item.getShippingCost()), 
            
            DatabaseUtility.getFloat(item.getCashBack()),
            DatabaseUtility.getFloat(item.getOrderCoupon()), 
            item.getOrdersState(),
            DatabaseUtility.getDate(item.getTradeTime()),              
            DatabaseUtility.getDate(item.getBusinessTime()),
            
            DatabaseUtility.getDate(item.getRecordTime()),
            DatabaseUtility.getDate(item.getAuditTime()),            
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getOrdersID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(Orders item){
        String sql="UPDATE  Orders SET  DeleteFlag=?  WHERE OrdersID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getOrdersID()
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
    public List<Orders> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM Orders WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<Orders> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                Orders item=new Orders();
                item.setOrdersID(rs.getString("OrdersID"));
                item.setOrdersCode(rs.getString("OrdersCode"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setMembersID(rs.getString("MembersID"));
                
                item.setContacts(rs.getString("Contacts"));
                item.setContactsPhone(rs.getString("ContactsPhone"));
                item.setContactsAddress(rs.getString("ContactsAddress"));
                item.setPayType(rs.getString("PayType"));
                item.setTotalPrice(rs.getFloat("TotalPrice"));
                
                item.setTakeOut(rs.getString("TakeOut"));
                item.setPayTotal(rs.getFloat("PayTotal"));
                item.setCouponID(rs.getString("CouponID"));
                item.setCouponTotal(rs.getFloat("CouponTotal"));
                item.setShippingCost(rs.getFloat("ShippingCost"));
                
                item.setCashBack(rs.getFloat("CashBack"));
                item.setOrderCoupon(rs.getFloat("OrderCoupon"));
                item.setOrdersState(rs.getString("OrdersState"));
                item.setTradeTime(rs.getDate("TradeTime"));
                item.setBusinessTime(rs.getDate("BusinessTime"));
                
                item.setRecordTime(rs.getDate("RecordTime"));
                item.setAuditTime(rs.getDate("AuditTime"));                
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
    public Orders getItem(String strID){
        String sql="SELECT * FROM Orders WHERE OrdersID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        Orders item=new Orders();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){               
                item.setOrdersID(rs.getString("OrdersID"));
                item.setOrdersCode(rs.getString("OrdersCode"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setMembersID(rs.getString("MembersID"));
                
                item.setContacts(rs.getString("Contacts"));
                item.setContactsPhone(rs.getString("ContactsPhone"));
                item.setContactsAddress(rs.getString("ContactsAddress"));
                item.setPayType(rs.getString("PayType"));
                item.setTotalPrice(rs.getFloat("TotalPrice"));
                
                item.setTakeOut(rs.getString("TakeOut"));
                item.setPayTotal(rs.getFloat("PayTotal"));
                item.setCouponID(rs.getString("CouponID"));
                item.setCouponTotal(rs.getFloat("CouponTotal"));
                item.setShippingCost(rs.getFloat("ShippingCost"));
                
                item.setCashBack(rs.getFloat("CashBack"));
                item.setOrderCoupon(rs.getFloat("OrderCoupon"));
                item.setOrdersState(rs.getString("OrdersState"));
                item.setTradeTime(rs.getDate("TradeTime"));
                item.setBusinessTime(rs.getDate("BusinessTime"));
                
                item.setRecordTime(rs.getDate("RecordTime"));
                item.setAuditTime(rs.getDate("AuditTime"));                
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
