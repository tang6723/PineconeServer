/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.Coupon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class CouponDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(Coupon item){
        String sql="INSERT  INTO  Coupon (CouponID,CouponType,CouponCode,CouponTotal,IssueTime, "
                + " IssueDesc,AuditTime,AuditorID,Auditor,Assessment, "                
                + " DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,   ?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getCouponID(),
            item.getCouponType(),
            item.getCouponCode(),
            DatabaseUtility.getFloat(item.getCouponTotal()),   
            DatabaseUtility.getDate(item.getIssueTime()),
            
            item.getIssueDesc(),
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
    public boolean updateItem(Coupon item){
        String sql="UPDATE  Coupon "
                + "SET  CouponType=?, CouponCode=?, CouponTotal=? ,IssueTime=?,"
                + "IssueDesc=?, AuditTime=?, AuditorID=?, Auditor=?, Assessment=?,"                
                + " DeleteFlag=?, Remarks=? "
                + "WHERE CouponID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getCouponType(),
            item.getCouponCode(),
            DatabaseUtility.getFloat(item.getCouponTotal()),   
            DatabaseUtility.getDate(item.getIssueTime()),
            
            item.getIssueDesc(),
            DatabaseUtility.getDate(item.getAuditTime()),
            item.getAuditorID(),
            item.getAuditor(),
            item.getAssessment(),
                        
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getCouponID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(Coupon item){
        String sql="UPDATE  Coupon SET  DeleteFlag=?  WHERE CouponID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getCouponID()
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
    public List<Coupon> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM Coupon WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<Coupon> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                Coupon item=new Coupon();
                item.setCouponID(rs.getString("CouponID"));
                item.setCouponType(rs.getString("CouponType"));
                item.setCouponCode(rs.getString("CouponCode"));
                item.setCouponTotal(rs.getFloat("CouponTotal"));
                item.setIssueTime(rs.getDate("IssueTime"));
                
                
                item.setIssueDesc(rs.getString("IssueDesc"));
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
    public Coupon getItem(String strID){
        String sql="SELECT * FROM Coupon WHERE CouponID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        Coupon item=new Coupon();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setCouponID(rs.getString("CouponID"));
                item.setCouponType(rs.getString("CouponType"));
                item.setCouponCode(rs.getString("CouponCode"));
                item.setCouponTotal(rs.getFloat("CouponTotal"));
                item.setIssueTime(rs.getDate("IssueTime"));
                
                
                item.setIssueDesc(rs.getString("IssueDesc"));
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
