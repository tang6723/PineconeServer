/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.AdvertisingSpace;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class AdvertisingSpaceDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(AdvertisingSpace item){
        String sql="INSERT  INTO  AdvertisingSpace (AdvertisingSpaceID,SerialNo,AdvertisingImage,AdvertisingTitle,AdvertisingDesc, "
                + " BeginTime,EndTime,Location,PagesURL,MerchantID, "
                + " Merchant,AdsPrice,Sector,SectorType,AdsSection,  "                
                + "AdsUrl,EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,   ?,?,?,?,?,  ?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getAdvertisingSpaceID(),           
            DatabaseUtility.getInt(item.getSerialNo()),
            item.getAdvertisingImage(),
            item.getAdvertisingTitle(),
            item.getAdvertisingDesc(),
                       
            DatabaseUtility.getDate(item.getBeginTime()),
            DatabaseUtility.getDate(item.getEndTime()),
            item.getLocation(),
            item.getPagesURL(),
            item.getMerchantID(),
            
            item.getMerchant(),           
            DatabaseUtility.getFloat(item.getAdsPrice()),
            item.getSector(),
            item.getSectorType(),
            item.getAdsSection(),                      
            
            item.getAdsUrl(),
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
    public boolean updateItem(AdvertisingSpace item){
        String sql="UPDATE  AdvertisingSpace "
                + "SET  SerialNo=?, AdvertisingImage=?, AdvertisingTitle=? ,AdvertisingDesc=?,"
                + "BeginTime=?, EndTime=?, Location=?, PagesURL=?, MerchantID=?,"
                + "Merchant=?, AdsPrice=?, Sector=?, SectorType=?, AdsSection=?,"                
                + "AdsUrl=?, EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE AdvertisingSpaceID=?";
        int affectRowCount = 0;
        String[] parm={      
            DatabaseUtility.getInt(item.getSerialNo()),
            item.getAdvertisingImage(),
            item.getAdvertisingTitle(),
            item.getAdvertisingDesc(),
                       
            DatabaseUtility.getDate(item.getBeginTime()),
            DatabaseUtility.getDate(item.getEndTime()),
            item.getLocation(),
            item.getPagesURL(),
            item.getMerchantID(),
            
            item.getMerchant(),           
            DatabaseUtility.getFloat(item.getAdsPrice()),
            item.getSector(),
            item.getSectorType(),
            item.getAdsSection(),                      
            
            item.getAdsUrl(),
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getAdvertisingSpaceID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(AdvertisingSpace item){
        String sql="UPDATE  AdvertisingSpace SET  DeleteFlag=?  WHERE AdvertisingSpaceID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getAdvertisingSpaceID()
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
    public List<AdvertisingSpace> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM AdvertisingSpace WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<AdvertisingSpace> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                AdvertisingSpace item=new AdvertisingSpace();
                item.setAdvertisingSpaceID(rs.getString("AdvertisingSpaceID"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setAdvertisingImage(rs.getString("AdvertisingImage"));
                item.setAdvertisingTitle(rs.getString("AdvertisingTitle"));
                item.setAdvertisingDesc(rs.getString("AdvertisingDesc"));                
                
                item.setBeginTime(rs.getDate("BeginTime"));
                item.setEndTime(rs.getDate("EndTime"));
                item.setLocation(rs.getString("Location"));
                item.setPagesURL(rs.getString("PagesURL"));
                item.setMerchantID(rs.getString("MerchantID"));
                
                item.setMerchant(rs.getString("Merchant"));
                item.setAdsPrice(rs.getFloat("AdsPrice"));
                item.setSector(rs.getString("Sector"));
                item.setSectorType(rs.getString("SectorType"));
                item.setAdsSection(rs.getString("AdsSection"));                
                
                item.setAdsUrl(rs.getString("AdsUrl"));
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
    public AdvertisingSpace getItem(String strID){
        String sql="SELECT * FROM AdvertisingSpace WHERE AdvertisingSpaceID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        AdvertisingSpace item=new AdvertisingSpace();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setAdvertisingSpaceID(rs.getString("AdvertisingSpaceID"));
                item.setSerialNo(rs.getInt("SerialNo"));
                item.setAdvertisingImage(rs.getString("AdvertisingImage"));
                item.setAdvertisingTitle(rs.getString("AdvertisingTitle"));
                item.setAdvertisingDesc(rs.getString("AdvertisingDesc"));                
                
                item.setBeginTime(rs.getDate("BeginTime"));
                item.setEndTime(rs.getDate("EndTime"));
                item.setLocation(rs.getString("Location"));
                item.setPagesURL(rs.getString("PagesURL"));
                item.setMerchantID(rs.getString("MerchantID"));
                
                item.setMerchant(rs.getString("Merchant"));
                item.setAdsPrice(rs.getFloat("AdsPrice"));
                item.setSector(rs.getString("Sector"));
                item.setSectorType(rs.getString("SectorType"));
                item.setAdsSection(rs.getString("AdsSection"));                
                
                item.setAdsUrl(rs.getString("AdsUrl"));
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
