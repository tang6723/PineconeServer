 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.Advertisement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class AdvertisementDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(Advertisement item){
        String sql="INSERT  INTO  Advertisement (AdvertisementID,AdvertisingSpaceID,SerialNo,AdvertisingImage,AdvertisingTitle, "
                + " AdvertisingDesc,BeginTime,EndTime,Location,PagesURL, "
                + " MerchantID,Merchant,AdsPrice,Sector,SectorType,  "
                + "AdsSection,AdsUrl,IssueTime,Editor,AuditorID, "
                + " Auditor,AuditTime,ShowTime,IsShow,ShowState,  "
                + "FeeTime,FeeCode,FeeSum,EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?, ?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getAdvertisementID(),
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
            DatabaseUtility.getDate(item.getIssueTime()),
            item.getEditor(),
            item.getAuditorID(),
            
            item.getAuditor(),
            DatabaseUtility.getDate(item.getAuditTime()),
            DatabaseUtility.getDate(item.getShowTime()),            
            item.getIsShow(),
            item.getShowState(),
            
            DatabaseUtility.getDate(item.getFeeTime()),    
            item.getFeeCode(),
            DatabaseUtility.getFloat(item.getFeeSum()),  
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
    public boolean updateItem(Advertisement item){
        String sql="UPDATE  Advertisement "
                + "SET  AdvertisingSpaceID=?, SerialNo=?, AdvertisingImage=? ,AdvertisingTitle=?,"
                + "AdvertisingDesc=?, BeginTime=?, EndTime=?, Location=?, PagesURL=?,"
                + "MerchantID=?, Merchant=?, AdsPrice=?, Sector=?, SectorType=?,"
                + "AdsSection=?, AdsUrl=?, IssueTime=?, Editor=?, AuditorID=?,"
                + "Auditor=?, AuditTime=?, ShowTime=?, IsShow=?, ShowState=?, "
                + "FeeTime=?, FeeCode=?, FeeSum=?, EnableFlag=?,DeleteFlag=?,Remarks=? "
                + "WHERE AdvertisementID=?";
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
            DatabaseUtility.getDate(item.getIssueTime()),
            item.getEditor(),
            item.getAuditorID(),
            
            item.getAuditor(),
            DatabaseUtility.getDate(item.getAuditTime()),
            DatabaseUtility.getDate(item.getShowTime()),            
            item.getIsShow(),
            item.getShowState(),
            
            DatabaseUtility.getDate(item.getFeeTime()),    
            item.getFeeCode(),
            DatabaseUtility.getFloat(item.getFeeSum()),  
            item.getEnableFlag(),
            item.getDeleteFlag(),
            
            item.getRemarks(),
            
            item.getAdvertisementID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(Advertisement item){
        String sql="UPDATE  Advertisement SET  DeleteFlag=?  WHERE AdvertisementID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getAdvertisementID()
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
    public List<Advertisement> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM Advertisement WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<Advertisement> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                Advertisement item=new Advertisement();
                item.setAdvertisementID(rs.getString("AdvertisementID"));
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
                item.setIssueTime(rs.getDate("IssueTime"));
                item.setEditor(rs.getString("Editor"));
                item.setAuditorID(rs.getString("AuditorID"));
                
                item.setAuditor(rs.getString("Auditor"));
                item.setAuditTime(rs.getDate("AuditTime"));
                item.setShowTime(rs.getDate("ShowTime"));
                item.setIsShow(rs.getString("IsShow"));
                item.setShowState(rs.getString("ShowState"));
                
                item.setFeeTime(rs.getDate("FeeTime"));
                item.setFeeCode(rs.getString("FeeCode"));
                item.setFeeSum(rs.getFloat("FeeSum"));
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
    public Advertisement getItem(String strID){
        String sql="SELECT * FROM Advertisement WHERE AdvertisementID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        Advertisement item=new Advertisement();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setAdvertisementID(rs.getString("AdvertisementID"));
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
                item.setIssueTime(rs.getDate("IssueTime"));
                item.setEditor(rs.getString("Editor"));
                item.setAuditorID(rs.getString("AuditorID"));
                
                item.setAuditor(rs.getString("Auditor"));
                item.setAuditTime(rs.getDate("AuditTime"));
                item.setShowTime(rs.getDate("ShowTime"));
                item.setIsShow(rs.getString("IsShow"));
                item.setShowState(rs.getString("ShowState"));
                
                item.setFeeTime(rs.getDate("FeeTime"));
                item.setFeeCode(rs.getString("FeeCode"));
                item.setFeeSum(rs.getFloat("FeeSum"));
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
