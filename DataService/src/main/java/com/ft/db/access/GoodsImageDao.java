/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.GoodsImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class GoodsImageDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(GoodsImage item){
        String sql="INSERT  INTO  GoodsImage (GoodsImageID,MerchantGoodsID,ImageType,SerialNo,GoodsUrl, "                
                + "GoodsImage,EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?);";
        int affectRowCount = 0;
        /*
        String[] parm={
            item.getGoodsImageID(),
            item.getMerchantGoodsID(),
            item.getImageType(),
            DatabaseUtility.getInt(item.getSerialNo()),           
            item.getGoodsUrl(),
            
            item.getGoodsImage(),
            item.getEnableFlag(),
            item.getDeleteFlag(),            
            item.getRemarks()
        };
        */
        affectRowCount=DatabaseUtility.insertImageSQL(sql, item);
        return affectRowCount > 0;
    }
    
    /**
     * 更新
     * @param item
     * @return 
     */
    public boolean updateItem(GoodsImage item){
        String sql="UPDATE  GoodsImage "
                + "SET  MerchantGoodsID=?, ImageType=?, SerialNo=? ,GoodsUrl=?,"                
                + "GoodsImage=?, EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE GoodsImageID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getMerchantGoodsID(),
            item.getImageType(),
            DatabaseUtility.getInt(item.getSerialNo()),           
            item.getGoodsUrl(),
            
            item.getGoodsImage(),
            item.getEnableFlag(),
            item.getDeleteFlag(),            
            item.getRemarks(),
            
            item.getGoodsImageID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(GoodsImage item){
        String sql="UPDATE  GoodsImage SET  DeleteFlag=?  WHERE GoodsImageID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getGoodsImageID()
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
    public List<GoodsImage> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM GoodsImage WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<GoodsImage> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                GoodsImage item=new GoodsImage();
                item.setGoodsImageID(rs.getString("GoodsImageID"));
                item.setMerchantGoodsID(rs.getString("MerchantGoodsID"));
                item.setImageType(rs.getString("ImageType"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setGoodsUrl(rs.getString("GoodsUrl"));
                                
                item.setGoodsImage(rs.getBytes("GoodsImage"));
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
    public GoodsImage getItem(String strID){
        String sql="SELECT * FROM GoodsImage WHERE GoodsImageID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        GoodsImage item=new GoodsImage();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setGoodsImageID(rs.getString("GoodsImageID"));
                item.setMerchantGoodsID(rs.getString("MerchantGoodsID"));
                item.setImageType(rs.getString("ImageType"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setGoodsUrl(rs.getString("GoodsUrl"));
                                
                item.setGoodsImage(rs.getBytes("GoodsImage"));
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
