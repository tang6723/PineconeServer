/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.BrowseItems;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class BrowseItemsDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(BrowseItems item){
        String sql="INSERT  INTO  BrowseItems (BrowseItemsID,MerchantID,Merchant,MembersID,MembersName, "
                + " BrowseTime,GoodsID,GoodsType,GoodsName,GoodsUnits, "
                + " GroupPrice,RetailPrice,MembersPrice,TransactionPrice,GoodsDesc,  "                
                + " EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getBrowseItemsID(),
            item.getMerchantID(),
            item.getMerchant(),
            item.getMembersID(),
            item.getMembersName(),
                       
            DatabaseUtility.getDate(item.getBrowseTime()),
            item.getGoodsID(),
            item.getGoodsType(),
            item.getGoodsName(),
            item.getGoodsUnits(),
            
            DatabaseUtility.getFloat(item.getGroupPrice()),
            DatabaseUtility.getFloat(item.getRetailPrice()),
            DatabaseUtility.getFloat(item.getMembersPrice()),
            DatabaseUtility.getFloat(item.getTransactionPrice()),
            item.getGoodsDesc(),
                        
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
    public boolean updateItem(BrowseItems item){
        String sql="UPDATE  BrowseItems "
                + "SET  MerchantID=?, Merchant=?, MembersID=? ,MembersName=?,"
                + "BrowseTime=?, GoodsID=?, GoodsType=?, GoodsName=?, GoodsUnits=?,"
                + "GroupPrice=?, RetailPrice=?, MembersPrice=?, TransactionPrice=?, GoodsDesc=?,"                
                + "  EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE BrowseItemsID=?";
        int affectRowCount = 0;
        String[] parm={            
            item.getMerchantID(),
            item.getMerchant(),
            item.getMembersID(),
            item.getMembersName(),
                       
            DatabaseUtility.getDate(item.getBrowseTime()),
            item.getGoodsID(),
            item.getGoodsType(),
            item.getGoodsName(),
            item.getGoodsUnits(),
            
            DatabaseUtility.getFloat(item.getGroupPrice()),
            DatabaseUtility.getFloat(item.getRetailPrice()),
            DatabaseUtility.getFloat(item.getMembersPrice()),
            DatabaseUtility.getFloat(item.getTransactionPrice()),
            item.getGoodsDesc(),
                        
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getBrowseItemsID(),
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(BrowseItems item){
        String sql="UPDATE  BrowseItems SET  DeleteFlag=?  WHERE BrowseItemsID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getBrowseItemsID()
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
    public List<BrowseItems> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM BrowseItems WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<BrowseItems> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                BrowseItems item=new BrowseItems();
                item.setBrowseItemsID(rs.getString("BrowseItemsID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setMembersID(rs.getString("MembersID"));
                item.setMembersName(rs.getString("MembersName"));                
                
                item.setBrowseTime(rs.getDate("BrowseTime"));
                item.setGoodsID(rs.getString("GoodsID"));
                item.setGoodsType(rs.getString("GoodsType"));
                item.setGoodsName(rs.getString("GoodsName"));
                item.setGoodsUnits(rs.getString("GoodsUnits"));
                
                item.setGroupPrice(rs.getFloat("GroupPrice"));
                item.setRetailPrice(rs.getFloat("RetailPrice"));
                item.setMembersPrice(rs.getFloat("MembersPrice"));
                item.setTransactionPrice(rs.getFloat("TransactionPrice"));
                item.setGoodsDesc(rs.getString("GoodsDesc"));
                                
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
    public BrowseItems getItem(String strID){
        String sql="SELECT * FROM BrowseItems WHERE BrowseItemsID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        BrowseItems item=new BrowseItems();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setBrowseItemsID(rs.getString("BrowseItemsID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setMembersID(rs.getString("MembersID"));
                item.setMembersName(rs.getString("MembersName"));                
                
                item.setBrowseTime(rs.getDate("BrowseTime"));
                item.setGoodsID(rs.getString("GoodsID"));
                item.setGoodsType(rs.getString("GoodsType"));
                item.setGoodsName(rs.getString("GoodsName"));
                item.setGoodsUnits(rs.getString("GoodsUnits"));
                
                item.setGroupPrice(rs.getFloat("GroupPrice"));
                item.setRetailPrice(rs.getFloat("RetailPrice"));
                item.setMembersPrice(rs.getFloat("MembersPrice"));
                item.setTransactionPrice(rs.getFloat("TransactionPrice"));
                item.setGoodsDesc(rs.getString("GoodsDesc"));
                                
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
