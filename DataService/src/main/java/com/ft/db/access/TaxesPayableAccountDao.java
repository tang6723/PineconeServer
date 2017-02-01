/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.TaxesPayableAccount;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class TaxesPayableAccountDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(TaxesPayableAccount item){
        String sql="INSERT  INTO  TaxesPayableAccount (TaxesPayableAccountID,BusinessTime,RelevantID,RelevantDesc,MembersID, "
                + " MerchantID,AgentID,AccountCode,TopSubjects,TwoSubjects, "
                + " RecordTime,DebitCreditor,Amount,Summary,AuditTime,  "               
                + "AuditorID,Auditor,Assessment,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getTaxesPayableAccountID(),
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
    public boolean updateItem(TaxesPayableAccount item){
        String sql="UPDATE  TaxesPayableAccount "
                + "SET  BusinessTime=?, RelevantID=?, RelevantDesc=? ,MembersID=?,"
                + "MerchantID=?, AgentID=?, AccountCode=?, TopSubjects=?, TwoSubjects=?,"
                + "RecordTime=?, DebitCreditor=?, Amount=?, Summary=?, AuditTime=?,"
                + "AuditorID=?, Auditor=?,  Assessment=?, DeleteFlag=?, Remarks=? "
                + "WHERE TaxesPayableAccountID=?";
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
            
           item.getTaxesPayableAccountID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(TaxesPayableAccount item){
        String sql="UPDATE  TaxesPayableAccount SET  DeleteFlag=?  WHERE TaxesPayableAccountID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getTaxesPayableAccountID()
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
    public List<TaxesPayableAccount> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM TaxesPayableAccount WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<TaxesPayableAccount> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                TaxesPayableAccount item=new TaxesPayableAccount();
                item.setTaxesPayableAccountID(rs.getString("TaxesPayableAccountID"));
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
    public TaxesPayableAccount getItem(String strID){
        String sql="SELECT * FROM TaxesPayableAccount WHERE TaxesPayableAccountID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        TaxesPayableAccount item=new TaxesPayableAccount();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setTaxesPayableAccountID(rs.getString("TaxesPayableAccountID"));
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
