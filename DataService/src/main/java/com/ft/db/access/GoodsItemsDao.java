/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.GoodsItems;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tang
 */
public class GoodsItemsDao {
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(GoodsItems item){
        String sql="INSERT  INTO  GoodsItems (GoodsItemsID,GoodsID,GoodsName,GoodsUnit,GoodsDesc, "
                + " SalesArea,GoodsType,PromotionType,GroupPrice,RetailPrice, "
                + " BenefitPrice,SoldQty,Racking,EnableFlag,DeleteFlag,  "                
                + " Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getGoodsItemsID(),
            item.getGoodsID(),
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
    public boolean updateItem(GoodsItems item){
        String sql="UPDATE  GoodsItems "
                + "SET  GoodsID=?, GoodsName=?, GoodsUnit=? ,GoodsDesc=?,"
                + "SalesArea=?, GoodsType=?, PromotionType=?, GroupPrice=?, RetailPrice=?,"
                + "BenefitPrice=?, SoldQty=?, Racking=?, EnableFlag=?, DeleteFlag=?,"                
                + "  Remarks=? "
                + "WHERE GoodsItemsID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getGoodsID(),
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
            
            item.getGoodsItemsID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(GoodsItems item){
        String sql="UPDATE  GoodsItems SET  DeleteFlag=?  WHERE GoodsItemsID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getGoodsItemsID()
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
    public List<GoodsItems> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM GoodsItems WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<GoodsItems> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                GoodsItems item=new GoodsItems();                
                item.setGoodsItemsID(rs.getString("GoodsItemsID"));
                item.setGoodsID(rs.getString("GoodsID"));
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
    public GoodsItems getItem(String strID){
        String sql="SELECT * FROM GoodsItems WHERE AccountAlarmID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        GoodsItems item=new GoodsItems();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setGoodsItemsID(rs.getString("GoodsItemsID"));
                item.setGoodsID(rs.getString("GoodsID"));
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
