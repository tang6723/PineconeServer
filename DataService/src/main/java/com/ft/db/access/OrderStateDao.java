/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.OrderState;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class OrderStateDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(OrderState item){
        String sql="INSERT  INTO  OrderState (OrderStateID,OrdersID,ExecuteTim,ExecutiveID,Executive, "
                + " ExecuteType,ExecuteDesc,ExecuteResult,AuditTime,AuditorID, "                
                + "Auditor,Assessment,EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getOrderStateID(),
            item.getOrdersID(),
            DatabaseUtility.getDate(item.getExecuteTim()),
            item.getExecutiveID(),
            item.getExecutive(),
            
            item.getExecuteType(),
            item.getExecuteDesc(),
            item.getExecuteResult(),
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
    public boolean updateItem(OrderState item){
        String sql="UPDATE  OrderState "
                + "SET  OrdersID=?, ExecuteTim=?, ExecutiveID=? ,Executive=?,"
                + "ExecuteType=?, ExecuteDesc=?, ExecuteResult=?, AuditTime=?, AuditorID=?,"                
                + "Auditor=?,Assessment=?, EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE OrderStateID=?";
        int affectRowCount = 0;
        String[] parm={            
            item.getOrdersID(),
            DatabaseUtility.getDate(item.getExecuteTim()),
            item.getExecutiveID(),
            item.getExecutive(),
            
            item.getExecuteType(),
            item.getExecuteDesc(),
            item.getExecuteResult(),
            DatabaseUtility.getDate(item.getAuditTime()),
            item.getAuditorID(),
                        
            item.getAuditor(),            
            item.getAssessment(),
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getOrderStateID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(OrderState item){
        String sql="UPDATE  OrderState SET  DeleteFlag=?  WHERE OrderStateID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getOrderStateID()
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
    public List<OrderState> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM OrderState WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<OrderState> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                OrderState item=new OrderState();
                item.setOrderStateID(rs.getString("OrderStateID"));
                item.setOrdersID(rs.getString("OrdersID"));
                item.setExecuteTim(rs.getDate("ExecuteTim"));
                item.setExecutiveID(rs.getString("ExecutiveID"));
                item.setExecutive(rs.getString("Executive"));
                
                item.setExecuteType(rs.getString("ExecuteType"));
                item.setExecuteDesc(rs.getString("ExecuteDesc"));
                item.setExecuteResult(rs.getString("ExecuteResult"));
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
    public OrderState getItem(String strID){
        String sql="SELECT * FROM OrderState WHERE OrderStateID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        OrderState item=new OrderState();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){               
                item.setOrderStateID(rs.getString("OrderStateID"));
                item.setOrdersID(rs.getString("OrdersID"));
                item.setExecuteTim(rs.getDate("ExecuteTim"));
                item.setExecutiveID(rs.getString("ExecutiveID"));
                item.setExecutive(rs.getString("Executive"));
                
                item.setExecuteType(rs.getString("ExecuteType"));
                item.setExecuteDesc(rs.getString("ExecuteDesc"));
                item.setExecuteResult(rs.getString("ExecuteResult"));
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
