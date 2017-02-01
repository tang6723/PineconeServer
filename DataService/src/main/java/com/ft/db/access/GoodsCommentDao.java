/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.GoodsComment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class GoodsCommentDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(GoodsComment item){
        String sql="INSERT  INTO  GoodsComment (GoodsCommentID,GoodsID,IsTop,GoodsScore,OrganizationName, "
                + " OperatorsID,Operators,OperatorsImage,IssueTime,AuditTime, "
                + " AuditorID,Auditor,Assessment,EnableFlag,DeleteFlag,  "
                
                + "PreparerName,HandleName,State,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?,  ?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getGoodsCommentID(),
            item.getGoodsID(),
            item.getIsTop(),
            DatabaseUtility.getFloat(item.getGoodsScore()),           
            item.getCommentsDesc(),
            
            item.getOperatorsID(),
            item.getOperators(),
            item.getOperatorsImage(),
            DatabaseUtility.getDate(item.getIssueTime()),
            DatabaseUtility.getDate(item.getAuditTime()),
            
            item.getAuditorID(),
            item.getAuditor(),
            item.getAssessment(),
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
    public boolean updateItem(GoodsComment item){
        String sql="UPDATE  GoodsComment "
                + "SET  GoodsID=?, IsTop=?, GoodsScore=? ,CommentsDesc=?,"
                + "OperatorsID=?, Operators=?, OperatorsImage=?, IssueTime=?, AuditTime=?,"
                + "AuditorID=?, Auditor=?, Assessment=?, EnableFlag=?, DeleteFlag=?,"               
                + " Remarks=? "
                + "WHERE GoodsCommentID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getGoodsID(),
            item.getIsTop(),
            DatabaseUtility.getFloat(item.getGoodsScore()),           
            item.getCommentsDesc(),
            
            item.getOperatorsID(),
            item.getOperators(),
            item.getOperatorsImage(),
            DatabaseUtility.getDate(item.getIssueTime()),
            DatabaseUtility.getDate(item.getAuditTime()),
            
            item.getAuditorID(),
            item.getAuditor(),
            item.getAssessment(),
            item.getEnableFlag(),
            item.getDeleteFlag(),
                        
            item.getRemarks(),
            
            item.getGoodsCommentID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(GoodsComment item){
        String sql="UPDATE  GoodsComment SET  DeleteFlag=?  WHERE GoodsCommentID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getGoodsCommentID()
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
    public List<GoodsComment> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM GoodsComment WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<GoodsComment> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                GoodsComment item=new GoodsComment();                
                item.setGoodsCommentID(rs.getString("GoodsCommentID"));
                item.setGoodsID(rs.getString("GoodsID"));
                item.setIsTop(rs.getString("IsTop"));
                item.setGoodsScore(rs.getFloat("GoodsScore"));
                item.setCommentsDesc(rs.getString("CommentsDesc"));
                
                item.setOperatorsID(rs.getString("OperatorsID"));
                item.setOperators(rs.getString("Operators"));
                item.setOperatorsImage(rs.getString("OperatorsImage"));
                item.setIssueTime(rs.getDate("IssueTime"));
                item.setAuditTime(rs.getDate("AuditTime"));
                
                item.setAuditorID(rs.getString("AuditorID"));
                item.setAuditor(rs.getString("Auditor"));
                item.setAssessment(rs.getString("Assessment"));
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
    public GoodsComment getItem(String strID){
        String sql="SELECT * FROM GoodsComment WHERE GoodsCommentID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        GoodsComment item=new GoodsComment();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setGoodsCommentID(rs.getString("GoodsCommentID"));
                item.setGoodsID(rs.getString("GoodsID"));
                item.setIsTop(rs.getString("IsTop"));
                item.setGoodsScore(rs.getFloat("GoodsScore"));
                item.setCommentsDesc(rs.getString("CommentsDesc"));
                
                item.setOperatorsID(rs.getString("OperatorsID"));
                item.setOperators(rs.getString("Operators"));
                item.setOperatorsImage(rs.getString("OperatorsImage"));
                item.setIssueTime(rs.getDate("IssueTime"));
                item.setAuditTime(rs.getDate("AuditTime"));
                
                item.setAuditorID(rs.getString("AuditorID"));
                item.setAuditor(rs.getString("Auditor"));
                item.setAssessment(rs.getString("Assessment"));
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
