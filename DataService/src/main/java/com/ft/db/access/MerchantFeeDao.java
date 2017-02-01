/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.MerchantFee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class MerchantFeeDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(MerchantFee item){
        String sql="INSERT  INTO  MerchantFee (MerchantFeeID,MerchantID,Merchant,FeeType,FeeTotal, "
                + " FeeDesc,BeginTime,EndTime,FeeTime,MerchantContact, "
                + " Manager,ManagerPhone,AuditTime,AuditorID,Auditor,  "                
                + "Assessment,,DeleteReason,EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,   ?,?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getMerchantFeeID(),
            item.getMerchantID(),
            item.getMerchant(),
            item.getFeeType(),
            DatabaseUtility.getFloat(item.getFeeTotal()),
            
            item.getFeeDesc(),
            DatabaseUtility.getDate(item.getBeginTime()),
            DatabaseUtility.getDate(item.getEndTime()),
            DatabaseUtility.getDate(item.getFeeTime()), 
            item.getMerchantContact(),
            
            item.getManager(),
            item.getManagerPhone(),
            DatabaseUtility.getDate(item.getAuditTime()),
            item.getAuditorID(),
            item.getAuditor(),
            
            item.getAssessment(),            
            item.getDeleteReason(),
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
    public boolean updateItem(MerchantFee item){
        String sql="UPDATE  MerchantFee "
                + "SET  MerchantID=?, Merchant=?, FeeType=? ,FeeTotal=?,"
                + "FeeDesc=?, BeginTime=?, EndTime=?, FeeTime=?, MerchantContact=?,"
                + "Manager=?, ManagerPhone=?, AuditTime=?, AuditorID=?, Auditor=?,"                
                + "Assessment=?, DeleteReason=?,EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE MerchantFeeID=?";
        int affectRowCount = 0;
        String[] parm={            
            item.getMerchantID(),
            item.getMerchant(),
            item.getFeeType(),
            DatabaseUtility.getFloat(item.getFeeTotal()),
            
            item.getFeeDesc(),
            DatabaseUtility.getDate(item.getBeginTime()),
            DatabaseUtility.getDate(item.getEndTime()),
            DatabaseUtility.getDate(item.getFeeTime()), 
            item.getMerchantContact(),
            
            item.getManager(),
            item.getManagerPhone(),
            DatabaseUtility.getDate(item.getAuditTime()),
            item.getAuditorID(),
            item.getAuditor(),
            
            item.getAssessment(),            
            item.getDeleteReason(),
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getMerchantFeeID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(MerchantFee item){
        String sql="UPDATE  MerchantFee SET  DeleteFlag=?  WHERE MerchantFeeID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getMerchantFeeID()
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
    public List<MerchantFee> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM MerchantFee WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<MerchantFee> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                MerchantFee item=new MerchantFee();
                item.setMerchantFeeID(rs.getString("MerchantFeeID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setFeeType(rs.getString("FeeType"));
                item.setFeeTotal(rs.getFloat("FeeTotal"));
                
                item.setFeeDesc(rs.getString("FeeDesc"));
                item.setBeginTime(rs.getDate("BeginTime"));
                item.setEndTime(rs.getDate("EndTime"));
                item.setFeeTime(rs.getDate("FeeTime"));
                item.setMerchantContact(rs.getString("MerchantContact"));
                
                item.setManager(rs.getString("Manager"));
                item.setManagerPhone(rs.getString("ManagerPhone"));
                item.setAuditTime(rs.getDate("AuditTime"));
                item.setAuditorID(rs.getString("AuditorID"));
                item.setAuditor(rs.getString("Auditor"));
                
                item.setAssessment(rs.getString("Assessment"));
                item.setDeleteReason(rs.getString("DeleteReason"));
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
    public MerchantFee getItem(String strID){
        String sql="SELECT * FROM MerchantFee WHERE MerchantFeeID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        MerchantFee item=new MerchantFee();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){                
                item.setMerchantFeeID(rs.getString("MerchantFeeID"));
                item.setMerchantID(rs.getString("MerchantID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setFeeType(rs.getString("FeeType"));
                item.setFeeTotal(rs.getFloat("FeeTotal"));
                
                item.setFeeDesc(rs.getString("FeeDesc"));
                item.setBeginTime(rs.getDate("BeginTime"));
                item.setEndTime(rs.getDate("EndTime"));
                item.setFeeTime(rs.getDate("FeeTime"));
                item.setMerchantContact(rs.getString("MerchantContact"));
                
                item.setManager(rs.getString("Manager"));
                item.setManagerPhone(rs.getString("ManagerPhone"));
                item.setAuditTime(rs.getDate("AuditTime"));
                item.setAuditorID(rs.getString("AuditorID"));
                item.setAuditor(rs.getString("Auditor"));
                
                item.setAssessment(rs.getString("Assessment"));
                item.setDeleteReason(rs.getString("DeleteReason"));
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
