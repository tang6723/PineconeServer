/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.GoodsAdjustment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class GoodsAdjustmentDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(GoodsAdjustment item){
        String sql="INSERT  INTO  GoodsAdjustment (GoodsAdjustmentID,GoodsID,GroupPrice,RetailPrice,BenefitPrice, "
                + " FormerGroupPrice,FormerRetailPrice,FormerBenefitPrice,AdjustmentTime,EffectiveTime, "
                + " OperatorsID,Operators,AdjustmentType,EnableFlag,DeleteFlag,  "               
                + "Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getGoodsAdjustmentID(),
            item.getGoodsID(),
            DatabaseUtility.getFloat(item.getGroupPrice()),
            DatabaseUtility.getFloat(item.getRetailPrice()),
            DatabaseUtility.getFloat(item.getBenefitPrice()),
            
            DatabaseUtility.getFloat(item.getFormerGroupPrice()),
            DatabaseUtility.getFloat(item.getFormerRetailPrice()),
            DatabaseUtility.getFloat(item.getFormerBenefitPrice()),
            DatabaseUtility.getDate(item.getAdjustmentTime()),
            DatabaseUtility.getDate(item.getEffectiveTime()),
            
            item.getOperatorsID(),
            item.getOperators(),
            item.getAdjustmentType(),
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
    public boolean updateItem(GoodsAdjustment item){
        String sql="UPDATE  GoodsAdjustment "
                + "SET  GoodsID=?, GroupPrice=?, RetailPrice=? ,BenefitPrice=?,"
                + "FormerGroupPrice=?, FormerRetailPrice=?, FormerBenefitPrice=?, AdjustmentTime=?, EffectiveTime=?,"
                + "OperatorsID=?, Operators=?, AdjustmentType=?, EnableFlag=?, DeleteFlag=?,"                
                + "  Remarks=? "
                + "WHERE GoodsAdjustmentID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getGoodsID(),
            DatabaseUtility.getFloat(item.getGroupPrice()),
            DatabaseUtility.getFloat(item.getRetailPrice()),
            DatabaseUtility.getFloat(item.getBenefitPrice()),
            
            DatabaseUtility.getFloat(item.getFormerGroupPrice()),
            DatabaseUtility.getFloat(item.getFormerRetailPrice()),
            DatabaseUtility.getFloat(item.getFormerBenefitPrice()),
            DatabaseUtility.getDate(item.getAdjustmentTime()),
            DatabaseUtility.getDate(item.getEffectiveTime()),
            
            item.getOperatorsID(),
            item.getOperators(),
            item.getAdjustmentType(),
            item.getEnableFlag(),
            item.getDeleteFlag(),
                        
            item.getRemarks(),
            
            item.getGoodsAdjustmentID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(GoodsAdjustment item){
        String sql="UPDATE  GoodsAdjustment SET  DeleteFlag=?  WHERE GoodsAdjustmentID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getGoodsAdjustmentID()
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
    public List<GoodsAdjustment> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM GoodsAdjustment WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<GoodsAdjustment> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                GoodsAdjustment item=new GoodsAdjustment();                
                item.setGoodsAdjustmentID(rs.getString("GoodsAdjustmentID"));
                item.setGoodsID(rs.getString("GoodsID"));
                item.setGroupPrice(rs.getFloat("GroupPrice"));
                item.setRetailPrice(rs.getFloat("RetailPrice"));
                item.setBenefitPrice(rs.getFloat("BenefitPrice"));
                
                item.setFormerGroupPrice(rs.getFloat("FormerGroupPrice"));
                item.setFormerRetailPrice(rs.getFloat("FormerRetailPrice"));
                item.setFormerBenefitPrice(rs.getFloat("FormerBenefitPrice"));
                item.setAdjustmentTime(rs.getDate("AdjustmentTime"));
                item.setEffectiveTime(rs.getDate("EffectiveTime"));
                
                item.setOperatorsID(rs.getString("OperatorsID"));
                item.setOperators(rs.getString("Operators"));
                item.setAdjustmentType(rs.getString("AdjustmentType"));
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
    public GoodsAdjustment getItem(String strID){
        String sql="SELECT * FROM GoodsAdjustment WHERE GoodsAdjustmentID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        GoodsAdjustment item=new GoodsAdjustment();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setGoodsAdjustmentID(rs.getString("GoodsAdjustmentID"));
                item.setGoodsID(rs.getString("GoodsID"));
                item.setGroupPrice(rs.getFloat("GroupPrice"));
                item.setRetailPrice(rs.getFloat("RetailPrice"));
                item.setBenefitPrice(rs.getFloat("BenefitPrice"));
                
                item.setFormerGroupPrice(rs.getFloat("FormerGroupPrice"));
                item.setFormerRetailPrice(rs.getFloat("FormerRetailPrice"));
                item.setFormerBenefitPrice(rs.getFloat("FormerBenefitPrice"));
                item.setAdjustmentTime(rs.getDate("AdjustmentTime"));
                item.setEffectiveTime(rs.getDate("EffectiveTime"));
                
                item.setOperatorsID(rs.getString("OperatorsID"));
                item.setOperators(rs.getString("Operators"));
                item.setAdjustmentType(rs.getString("AdjustmentType"));
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
