/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.Car;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class CarDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(Car item){
        String sql="INSERT  INTO  Car (CarID,MerchantID,Merchant,MembersID,Members, "
                + " GoodsID,GoodsType,GoodsName,GoodsUnit,GroupPrice, "
                + " RetailPrice,BenefitPrice,GoodsDesc,OrderQty,PayPrice,  "                
                + "ItemsTotal,EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,   ?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getCarID(),
            item.getMerchantID(),
            item.getMerchant(),
            item.getMembersID(),
            item.getMembers(),
            
            item.getGoodsID(),
            item.getGoodsType(),
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
    public boolean updateItem(Car item){
        String sql="UPDATE  Car "
                + "SET  MerchantID=?, Merchant=?, MembersID=? ,Members=?,"
                + "GoodsID=?, GoodsType=?, GoodsName=?, GoodsUnit=?, GroupPrice=?,"
                + "RetailPrice=?, BenefitPrice=?, GoodsDesc=?, OrderQty=?, PayPrice=?,"                
                + "ItemsTotal=?, EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE CarID=?";
        int affectRowCount = 0;
        String[] parm={   
            item.getMerchantID(),
            item.getMerchant(),
            item.getMembersID(),
            item.getMembers(),
            
            item.getGoodsID(),
            item.getGoodsType(),
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
            
            item.getCarID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(Car item){
        String sql="UPDATE  Car SET  DeleteFlag=?  WHERE CarID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getCarID()
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
    public List<Car> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM Car WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<Car> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                Car item=new Car();
                item.setCarID(rs.getString("CarID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setMembersID(rs.getString("MembersID"));
                item.setMembers(rs.getString("Members"));                
                
                item.setGoodsID(rs.getString("GoodsID"));
                item.setGoodsType(rs.getString("GoodsType"));
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
    public Car getItem(String strID){
        String sql="SELECT * FROM Car WHERE CarID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        Car item=new Car();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setCarID(rs.getString("CarID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setMembersID(rs.getString("MembersID"));
                item.setMembers(rs.getString("Members"));                
                
                item.setGoodsID(rs.getString("GoodsID"));
                item.setGoodsType(rs.getString("GoodsType"));
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
