/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.OrdersItems;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class OrdersItemsDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(OrdersItems item){
        String sql="INSERT  INTO  OrdersItems (OrdersItemsID,OrdersID,OrdersCode,MerchantID,Merchant, "
                + " MembersID,Members,GoodsID,OrdersType,GoodsName, "
                + " GoodsUnit,GroupPrice,RetailPrice,BenefitPrice,GoodsDesc,  "
                + "OrderQty,PayPrice,ItemsTotal,EnableFlag,DeleteFlag, "                
                + "Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getOrdersItemsID(),
            item.getOrdersID(),
            item.getOrdersCode(),
            item.getMerchantID(),
            item.getMerchant(),
            
            item.getMembersID(),
            item.getMembers(),
            item.getGoodsID(),
            item.getOrdersType(),
            item.getGoodsName(),
            
            item.getGoodsUnit(),
            DatabaseUtility.getFloat(item.getGroupPrice()),
            DatabaseUtility.getFloat(item.getRetailPrice()),
            DatabaseUtility.getFloat(item.getBenefitPrice()),            
            item.getGoodsDesc(),
                       
            DatabaseUtility.getFloat(item.getOrderQty()),
            DatabaseUtility.getFloat(item.getPayPrice()),   
            DatabaseUtility.getFloat(item.getItemsTotal()),
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
    public boolean updateItem(OrdersItems item){
        String sql="UPDATE  OrdersItems "
                + "SET  OrdersID=?, OrdersCode=?, MerchantID=? ,Merchant=?,"
                + "MembersID=?, Members=?, GoodsID=?, OrdersType=?, GoodsName=?,"
                + "GoodsUnit=?, GroupPrice=?, RetailPrice=?, BenefitPrice=?, GoodsDesc=?,"
                + "OrderQty=?, PayPrice=?, ItemsTotal=?, EnableFlag=?, DeleteFlag=?,"                
                + " Remarks=? "
                + "WHERE OrdersItemsID=?";
        int affectRowCount = 0;
        String[] parm={            
            item.getOrdersID(),
            item.getOrdersCode(),
            item.getMerchantID(),
            item.getMerchant(),
            
            item.getMembersID(),
            item.getMembers(),
            item.getGoodsID(),
            item.getOrdersType(),
            item.getGoodsName(),
            
            item.getGoodsUnit(),
            DatabaseUtility.getFloat(item.getGroupPrice()),
            DatabaseUtility.getFloat(item.getRetailPrice()),
            DatabaseUtility.getFloat(item.getBenefitPrice()),            
            item.getGoodsDesc(),
                       
            DatabaseUtility.getFloat(item.getOrderQty()),
            DatabaseUtility.getFloat(item.getPayPrice()),   
            DatabaseUtility.getFloat(item.getItemsTotal()),
            item.getEnableFlag(),
            item.getDeleteFlag(),
                        
            item.getRemarks(),
            
            item.getOrdersItemsID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(OrdersItems item){
        String sql="UPDATE  OrdersItems SET  DeleteFlag=?  WHERE OrdersItemsID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getOrdersItemsID()
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
    public List<OrdersItems> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM OrdersItems WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<OrdersItems> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                OrdersItems item=new OrdersItems();
                item.setOrdersItemsID(rs.getString("OrdersItemsID"));
                item.setOrdersID(rs.getString("OrdersID"));
                item.setOrdersCode(rs.getString("OrdersCode"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                
                item.setMembersID(rs.getString("MembersID"));
                item.setMembers(rs.getString("Members"));
                item.setGoodsID(rs.getString("GoodsID"));
                item.setOrdersType(rs.getString("OrdersType"));
                item.setGoodsName(rs.getString("GoodsName"));
                
                item.setGoodsUnit(rs.getString("GoodsUnit"));
                item.setGroupPrice(rs.getFloat("GroupPrice"));
                item.setRetailPrice(rs.getFloat("RetailPrice"));
                item.setBenefitPrice(rs.getFloat("BenefitPrice"));
                item.setGoodsDesc(rs.getString("GoodsDesc"));
                                
                item.setOrderQty(rs.getFloat("OrderQty"));
                item.setPayPrice(rs.getFloat("PayPrice"));
                item.setItemsTotal(rs.getFloat("ItemsTotal"));
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
    public OrdersItems getItem(String strID){
        String sql="SELECT * FROM OrdersItems WHERE OrdersItemsID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        OrdersItems item=new OrdersItems();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){                
                item.setOrdersItemsID(rs.getString("OrdersItemsID"));
                item.setOrdersID(rs.getString("OrdersID"));
                item.setOrdersCode(rs.getString("OrdersCode"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                
                item.setMembersID(rs.getString("MembersID"));
                item.setMembers(rs.getString("Members"));
                item.setGoodsID(rs.getString("GoodsID"));
                item.setOrdersType(rs.getString("OrdersType"));
                item.setGoodsName(rs.getString("GoodsName"));
                
                item.setGoodsUnit(rs.getString("GoodsUnit"));
                item.setGroupPrice(rs.getFloat("GroupPrice"));
                item.setRetailPrice(rs.getFloat("RetailPrice"));
                item.setBenefitPrice(rs.getFloat("BenefitPrice"));
                item.setGoodsDesc(rs.getString("GoodsDesc"));
                                
                item.setOrderQty(rs.getFloat("OrderQty"));
                item.setPayPrice(rs.getFloat("PayPrice"));
                item.setItemsTotal(rs.getFloat("ItemsTotal"));
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
