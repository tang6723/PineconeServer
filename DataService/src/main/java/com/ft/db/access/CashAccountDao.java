/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.CashAccount;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class CashAccountDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(CashAccount item){
        String sql="INSERT  INTO  CashAccount (CashAccountID,BusinessTime,RelevantID,RelevantDesc,MembersID, "
                + " MerchantID,AgentID,AccountCode,TopSubjects,TwoSubjects, "
                + " RecordTime,DebitCreditor,Amount,Summary,AuditTime,  "               
                + "AuditorID,Auditor,Assessment,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getCashAccountID(),
            DatabaseUtility.getDate(item.getBusinessTime()),           
            item.getRelevantID(),
            item.getRelevantDesc(),
            item.getMembersID(),
            
            item.getMerchantID(),
            item.getAgentID(),
            item.getAccountCode(),
            item.getTopSubjects(),
            item.getTwoSubjects(),
            
            DatabaseUtility.getDate(item.getRecordTime()),         
            item.getDebitCreditor(),
             DatabaseUtility.getFloat(item.getAmount()),
            item.getSummary(),
            DatabaseUtility.getDate(item.getAuditTime()),         
            
            
            item.getAuditorID(),            
            item.getAuditor(),
            item.getAssessment(),
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
    public boolean updateItem(CashAccount item){
        String sql="UPDATE  CashAccount "
                + "SET  BusinessTime=?, RelevantID=?, RelevantDesc=? ,MembersID=?,"
                + "MerchantID=?, AgentID=?, AccountCode=?, TopSubjects=?, TwoSubjects=?,"
                + "RecordTime=?, DebitCreditor=?, Amount=?, Summary=?, AuditTime=?,"
                + "AuditorID=?, Auditor=?,  Assessment=?, DeleteFlag=?, Remarks=? "
                + "WHERE CashAccountID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            DatabaseUtility.getDate(item.getBusinessTime()),           
            item.getRelevantID(),
            item.getRelevantDesc(),
            item.getMembersID(),
            
            item.getMerchantID(),
            item.getAgentID(),
            item.getAccountCode(),
            item.getTopSubjects(),
            item.getTwoSubjects(),
            
            DatabaseUtility.getDate(item.getRecordTime()),         
            item.getDebitCreditor(),
             DatabaseUtility.getFloat(item.getAmount()),
            item.getSummary(),
            DatabaseUtility.getDate(item.getAuditTime()),         
            
            
            item.getAuditorID(),            
            item.getAuditor(),
            item.getAssessment(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getCashAccountID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(CashAccount item){
        String sql="UPDATE  CashAccount SET  DeleteFlag=?  WHERE CashAccountID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getCashAccountID()
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
    public List<CashAccount> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM CashAccount WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<CashAccount> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                CashAccount item=new CashAccount();
                item.setCashAccountID(rs.getString("CashAccountID"));
                item.setBusinessTime(rs.getDate("BusinessTime"));
                item.setRelevantID(rs.getString("RelevantID"));
                item.setRelevantDesc(rs.getString("RelevantDesc"));
                item.setMembersID(rs.getString("MembersID"));                
                
                item.setMerchantID(rs.getString("MerchantID"));
                item.setAgentID(rs.getString("AgentID"));
                item.setAccountCode(rs.getString("AccountCode"));
                item.setTopSubjects(rs.getString("TopSubjects"));
                item.setTwoSubjects(rs.getString("TwoSubjects"));
                
                item.setRecordTime(rs.getDate("RecordTime"));
                item.setDebitCreditor(rs.getString("DebitCreditor"));
                item.setAmount(rs.getFloat("Amount"));
                item.setSummary(rs.getString("Summary"));
                item.setAuditTime(rs.getDate("AuditTime"));
                
                item.setAuditorID(rs.getString("AuditorID"));                
                item.setAuditor(rs.getString("Auditor"));
                item.setAssessment(rs.getString("Assessment"));
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
    public CashAccount getItem(String strID){
        String sql="SELECT * FROM CashAccount WHERE CashAccountID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        CashAccount item=new CashAccount();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setCashAccountID(rs.getString("CashAccountID"));
                item.setBusinessTime(rs.getDate("BusinessTime"));
                item.setRelevantID(rs.getString("RelevantID"));
                item.setRelevantDesc(rs.getString("RelevantDesc"));
                item.setMembersID(rs.getString("MembersID"));                
                
                item.setMerchantID(rs.getString("MerchantID"));
                item.setAgentID(rs.getString("AgentID"));
                item.setAccountCode(rs.getString("AccountCode"));
                item.setTopSubjects(rs.getString("TopSubjects"));
                item.setTwoSubjects(rs.getString("TwoSubjects"));
                
                item.setRecordTime(rs.getDate("RecordTime"));
                item.setDebitCreditor(rs.getString("DebitCreditor"));
                item.setAmount(rs.getFloat("Amount"));
                item.setSummary(rs.getString("Summary"));
                item.setAuditTime(rs.getDate("AuditTime"));
                
                item.setAuditorID(rs.getString("AuditorID"));                
                item.setAuditor(rs.getString("Auditor"));
                item.setAssessment(rs.getString("Assessment"));
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