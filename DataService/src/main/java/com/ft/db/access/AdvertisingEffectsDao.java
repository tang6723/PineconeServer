/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.AdvertisingEffects;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class AdvertisingEffectsDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(AdvertisingEffects item){
        String sql="INSERT  INTO  AdvertisingEffects (AdvertisingEffectsID,AdvertisementID,AdvertisingSpaceID,ShowTimes,ClickTimes, "
                + " BrowseTimes,AdsPrice,BeginTime,EndTime,AdsDuration, "
                + " Sector,SectorType,AdsSection,AdsUrl,EnableFlag,  "               
                + " DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,   ?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getAdvertisingEffectsID(),
            item.getAdvertisementID(),
            item.getAdvertisingSpaceID(),
            DatabaseUtility.getInt(item.getShowTimes()), 
            DatabaseUtility.getInt(item.getClickTimes()), 
                        
            DatabaseUtility.getInt(item.getBrowseTimes()), 
            DatabaseUtility.getFloat(item.getAdsPrice()),
            DatabaseUtility.getDate(item.getBeginTime()),
            DatabaseUtility.getDate(item.getEndTime()),
            DatabaseUtility.getFloat(item.getAdsDuration()),
            
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
    public boolean updateItem(AdvertisingEffects item){
        String sql="UPDATE  AdvertisingEffects "
                + "SET  AdvertisementID=?, AdvertisingSpaceID=?, ShowTimes=? ,ClickTimes=?,"
                + "BrowseTimes=?, AdsPrice=?, BeginTime=?, EndTime=?, AdsDuration=?,"   
                + "Sector=?, SectorType=?, AdsSection=?, AdsUrl=?, EnableFlag=?,"  
                + " State=?, Remarks=? "
                + "WHERE AdvertisingEffectsID=?";
        int affectRowCount = 0;
        String[] parm={            
            item.getAdvertisementID(),
            item.getAdvertisingSpaceID(),
            DatabaseUtility.getInt(item.getShowTimes()), 
            DatabaseUtility.getInt(item.getClickTimes()), 
                        
            DatabaseUtility.getInt(item.getBrowseTimes()), 
            DatabaseUtility.getFloat(item.getAdsPrice()),
            DatabaseUtility.getDate(item.getBeginTime()),
            DatabaseUtility.getDate(item.getEndTime()),
            DatabaseUtility.getFloat(item.getAdsDuration()),
            
            item.getSector(),
            item.getSectorType(),
            item.getAdsSection(),
            item.getAdsUrl(),
            item.getEnableFlag(),
                        
            
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getAdvertisingEffectsID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(AdvertisingEffects item){
        String sql="UPDATE  AdvertisingEffects SET  DeleteFlag=?  WHERE AdvertisingEffectsID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getAdvertisingEffectsID()
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
    public List<AdvertisingEffects> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM AdvertisingEffects WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<AdvertisingEffects> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                AdvertisingEffects item=new AdvertisingEffects();
                item.setAdvertisingEffectsID(rs.getString("AdvertisingEffectsID"));
                item.setAdvertisementID(rs.getString("AdvertisementID"));
                item.setAdvertisingSpaceID(rs.getString("AdvertisingSpaceID"));
                item.setShowTimes(rs.getInt("ShowTimes"));
                item.setClickTimes(rs.getInt("ClickTimes"));
                                
                item.setBrowseTimes(rs.getInt("BrowseTimes"));
                item.setAdsPrice(rs.getFloat("AdsPrice"));
                item.setBeginTime(rs.getDate("BeginTime"));
                item.setEndTime(rs.getDate("EndTime"));
                item.setAdsDuration(rs.getFloat("AdsDuration"));
                
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
    public AdvertisingEffects getItem(String strID){
        String sql="SELECT * FROM AdvertisingEffects WHERE AdvertisingEffectsID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        AdvertisingEffects item=new AdvertisingEffects();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setAdvertisingEffectsID(rs.getString("AdvertisingEffectsID"));
                item.setAdvertisementID(rs.getString("AdvertisementID"));
                item.setAdvertisingSpaceID(rs.getString("AdvertisingSpaceID"));
                item.setShowTimes(rs.getInt("ShowTimes"));
                item.setClickTimes(rs.getInt("ClickTimes"));
                                
                item.setBrowseTimes(rs.getInt("BrowseTimes"));
                item.setAdsPrice(rs.getFloat("AdsPrice"));
                item.setBeginTime(rs.getDate("BeginTime"));
                item.setEndTime(rs.getDate("EndTime"));
                item.setAdsDuration(rs.getFloat("AdsDuration"));
                
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
