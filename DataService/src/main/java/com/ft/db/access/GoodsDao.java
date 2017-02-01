/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.Goods;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class GoodsDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(Goods item){
        String sql="INSERT  INTO  Goods (GoodsID,MerchantID,GoodsName,GoodsUnit,GoodsDesc, "
                + " SalesArea,GoodsType,PromotionType,GroupPrice,RetailPrice, "
                + " BenefitPrice,SoldQty,Racking,EnableFlag,DeleteFlag,  "                
                + " Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,   ?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getGoodsID(),
            item.getMerchantID(),
            item.getGoodsName(),
            item.getGoodsUnit(),
            item.getGoodsDesc(),
            
            item.getSalesArea(),
            item.getGoodsType(),
            item.getPromotionType(),
            DatabaseUtility.getFloat(item.getGroupPrice()),
            DatabaseUtility.getFloat(item.getRetailPrice()),
            
            DatabaseUtility.getFloat(item.getBenefitPrice()),
            DatabaseUtility.getInt(item.getSoldQty()),
            item.getRacking(),
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
    public boolean updateItem(Goods item){
        String sql="UPDATE  Goods "
                + "SET  MerchantID=?, GoodsName=?, GoodsUnit=? ,GoodsDesc=?,"
                + "SalesArea=?, GoodsType=?, PromotionType=?, GroupPrice=?, RetailPrice=?,"
                + "BenefitPrice=?, SoldQty=?, Racking=?, EnableFlag=?, DeleteFlag=?,"               
                + "  Remarks=?  WHERE GoodsID=?"   ;
        int affectRowCount = 0;
        String[] parm={            
            
            item.getMerchantID(),
            item.getGoodsName(),
            item.getGoodsUnit(),
            item.getGoodsDesc(),
            
            item.getSalesArea(),
            item.getGoodsType(),
            item.getPromotionType(),
            DatabaseUtility.getFloat(item.getGroupPrice()),
            DatabaseUtility.getFloat(item.getRetailPrice()),
            
            DatabaseUtility.getFloat(item.getBenefitPrice()),
            DatabaseUtility.getInt(item.getSoldQty()),
            item.getRacking(),
            item.getEnableFlag(),
            item.getDeleteFlag(),            
            
            item.getRemarks(),
            
            item.getGoodsID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(Goods item){
        String sql="UPDATE  Goods SET  DeleteFlag=?  WHERE GoodsID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getGoodsID()
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
    public List<Goods> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM Goods WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<Goods> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                Goods item=new Goods();
                item.setGoodsID(rs.getString("GoodsID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setGoodsName(rs.getString("GoodsName"));
                item.setGoodsUnit(rs.getString("GoodsUnit"));
                item.setGoodsDesc(rs.getString("GoodsDesc"));                
                
                item.setSalesArea(rs.getString("SalesArea"));
                item.setGoodsType(rs.getString("GoodsType"));
                item.setPromotionType(rs.getString("PromotionType"));
                item.setGroupPrice(rs.getFloat("GroupPrice"));
                item.setRetailPrice(rs.getFloat("RetailPrice"));
                
                item.setBenefitPrice(rs.getFloat("BenefitPrice"));
                item.setSoldQty(rs.getInt("SoldQty"));
                item.setRacking(rs.getString("Racking"));
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
    public Goods getItem(String strID){
        String sql="SELECT * FROM Goods WHERE GoodsID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        Goods item=new Goods();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setGoodsID(rs.getString("GoodsID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setGoodsName(rs.getString("GoodsName"));
                item.setGoodsUnit(rs.getString("GoodsUnit"));
                item.setGoodsDesc(rs.getString("GoodsDesc"));                
                
                item.setSalesArea(rs.getString("SalesArea"));
                item.setGoodsType(rs.getString("GoodsType"));
                item.setPromotionType(rs.getString("PromotionType"));
                item.setGroupPrice(rs.getFloat("GroupPrice"));
                item.setRetailPrice(rs.getFloat("RetailPrice"));
                
                item.setBenefitPrice(rs.getFloat("BenefitPrice"));
                item.setSoldQty(rs.getInt("SoldQty"));
                item.setRacking(rs.getString("Racking"));
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
