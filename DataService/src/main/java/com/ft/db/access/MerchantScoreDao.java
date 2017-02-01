 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.MerchantScore;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class MerchantScoreDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(MerchantScore item){
        String sql="INSERT  INTO  MerchantScore (MerchantScoreID,MembersID,Merchant,TradeTotal,TradeDesc, "
                + " TradeType,TradeTime,ResourceID,EventID,ContractID, "
                + " BusinessTime,RecordTime,AuditTime,AuditorID,Auditor,  "                
                + "Assessment,AuditorRemarks,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,    ?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getMerchantScoreID(),
            item.getMembersID(),
            item.getMerchant(),
            DatabaseUtility.getFloat(item.getTradeTotal()),
            item.getTradeDesc(),
            
            item.getTradeType(),
            DatabaseUtility.getDate(item.getTradeTime()),
            item.getResourceID(),
            item.getEventID(),
            item.getContractID(),
            
            DatabaseUtility.getDate(item.getBusinessTime()),
            DatabaseUtility.getDate(item.getRecordTime()),
            DatabaseUtility.getDate(item.getAuditTime()),
            item.getAuditorID(),
            item.getAuditor(),                       
            
            item.getAssessment(),
            item.getAuditorRemarks(),
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
    public boolean updateItem(MerchantScore item){
        String sql="UPDATE  MerchantScore "
                + "SET  MembersID=?, Merchant=?, TradeTotal=? ,TradeDesc=?,"
                + "TradeType=?, TradeTime=?, ResourceID=?, EventID=?, ContractID=?,"
                + "BusinessTime=?, RecordTime=?, AuditTime=?, AuditorID=?, Auditor=?,"               
                + "Assessment=?, AuditorRemarks=?, DeleteFlag=?, Remarks=? "
                + "WHERE MerchantScoreID=?";
        int affectRowCount = 0;
        String[] parm={            
            item.getMembersID(),
            item.getMerchant(),
            DatabaseUtility.getFloat(item.getTradeTotal()),
            item.getTradeDesc(),
            
            item.getTradeType(),
            DatabaseUtility.getDate(item.getTradeTime()),
            item.getResourceID(),
            item.getEventID(),
            item.getContractID(),
            
            DatabaseUtility.getDate(item.getBusinessTime()),
            DatabaseUtility.getDate(item.getRecordTime()),
            DatabaseUtility.getDate(item.getAuditTime()),
            item.getAuditorID(),
            item.getAuditor(),                       
            
            item.getAssessment(),
            item.getAuditorRemarks(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getMerchantScoreID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(MerchantScore item){
        String sql="UPDATE  MerchantScore SET  State=?  WHERE MerchantScoreID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getMerchantScoreID()
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
    public List<MerchantScore> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM MerchantScore WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<MerchantScore> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                MerchantScore item=new MerchantScore();
                item.setMerchantScoreID(rs.getString("MerchantScoreID"));
                item.setMembersID(rs.getString("MembersID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setTradeTotal(rs.getFloat("TradeTotal"));
                item.setTradeDesc(rs.getString("TradeDesc"));
                
                item.setTradeType(rs.getString("TradeType"));
                item.setTradeTime(rs.getDate("TradeTime"));
                item.setResourceID(rs.getString("ResourceID"));
                item.setEventID(rs.getString("EventID"));
                item.setContractID(rs.getString("ContractID"));
                
                item.setBusinessTime(rs.getDate("BusinessTime"));
                item.setRecordTime(rs.getDate("RecordTime"));
                item.setAuditTime(rs.getDate("AuditTime"));
                item.setAuditorID(rs.getString("AuditorID"));
                item.setAuditor(rs.getString("Auditor"));
                                
                item.setAssessment(rs.getString("Assessment"));
                item.setAuditorRemarks(rs.getString("AuditorRemarks"));
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
    public MerchantScore getItem(String strID){
        String sql="SELECT * FROM MerchantScore WHERE MerchantScoreID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        MerchantScore item=new MerchantScore();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){                
                item.setMerchantScoreID(rs.getString("MerchantScoreID"));
                item.setMembersID(rs.getString("MembersID"));
                item.setMerchant(rs.getString("Merchant"));
                item.setTradeTotal(rs.getFloat("TradeTotal"));
                item.setTradeDesc(rs.getString("TradeDesc"));
                
                item.setTradeType(rs.getString("TradeType"));
                item.setTradeTime(rs.getDate("TradeTime"));
                item.setResourceID(rs.getString("ResourceID"));
                item.setEventID(rs.getString("EventID"));
                item.setContractID(rs.getString("ContractID"));
                
                item.setBusinessTime(rs.getDate("BusinessTime"));
                item.setRecordTime(rs.getDate("RecordTime"));
                item.setAuditTime(rs.getDate("AuditTime"));
                item.setAuditorID(rs.getString("AuditorID"));
                item.setAuditor(rs.getString("Auditor"));
                                
                item.setAssessment(rs.getString("Assessment"));
                item.setAuditorRemarks(rs.getString("AuditorRemarks"));
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
