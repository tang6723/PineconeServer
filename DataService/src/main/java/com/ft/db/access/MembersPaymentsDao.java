/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.MembersPayments;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class MembersPaymentsDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(MembersPayments item){
        String sql="INSERT  INTO  MembersPayments (MembersPaymentsID,MembersID,PayTime,PayTotal,GoldCoin, "
                + " BankCard,BankName,BankAccount,TradeCode,TradeTime, "                
                + " EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,  ?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getMembersPaymentsID(),
            item.getMembersID(),
            DatabaseUtility.getDate(item.getPayTime()),
            DatabaseUtility.getFloat(item.getPayTotal()),
            DatabaseUtility.getFloat(item.getGoldCoin()),
            
            item.getBankCard(),
            item.getBankName(),
            item.getBankAccount(),
            item.getTradeCode(),
            DatabaseUtility.getDate(item.getTradeTime()),
                        
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
    public boolean updateItem(MembersPayments item){
        String sql="UPDATE  MembersPayments "
                + "SET  MembersID=?, PayTime=?, PayTotal=? ,GoldCoin=?,"
                + "BankCard=?, BankName=?, BankAccount=?, TradeCode=?, TradeTime=?,"               
                + " EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE MembersPaymentsID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getMembersID(),
            DatabaseUtility.getDate(item.getPayTime()),
            DatabaseUtility.getFloat(item.getPayTotal()),
            DatabaseUtility.getFloat(item.getGoldCoin()),
            
            item.getBankCard(),
            item.getBankName(),
            item.getBankAccount(),
            item.getTradeCode(),
            DatabaseUtility.getDate(item.getTradeTime()),
                        
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getMembersPaymentsID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(MembersPayments item){
        String sql="UPDATE  MembersPayments SET  DeleteFlag=?  WHERE MembersPaymentsID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getMembersPaymentsID()
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
    public List<MembersPayments> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM MembersPayments WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<MembersPayments> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                MembersPayments item=new MembersPayments();                
                item.setMembersPaymentsID(rs.getString("MembersPaymentsID"));
                item.setMembersID(rs.getString("MembersID"));
                item.setPayTime(rs.getDate("PayTime"));
                item.setPayTotal(rs.getFloat("PayTotal"));
                item.setGoldCoin(rs.getFloat("GoldCoin"));
                
                item.setBankCard(rs.getString("BankCard"));
                item.setBankName(rs.getString("BankName"));
                item.setBankAccount(rs.getString("BankAccount"));
                item.setTradeCode(rs.getString("TradeCode"));
                item.setTradeTime(rs.getDate("TradeTime"));
                                
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
    public MembersPayments getItem(String strID){
        String sql="SELECT * FROM MembersPayments WHERE MembersPaymentsID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        MembersPayments item=new MembersPayments();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setMembersPaymentsID(rs.getString("MembersPaymentsID"));
                item.setMembersID(rs.getString("MembersID"));
                item.setPayTime(rs.getDate("PayTime"));
                item.setPayTotal(rs.getFloat("PayTotal"));
                item.setGoldCoin(rs.getFloat("GoldCoin"));
                
                item.setBankCard(rs.getString("BankCard"));
                item.setBankName(rs.getString("BankName"));
                item.setBankAccount(rs.getString("BankAccount"));
                item.setTradeCode(rs.getString("TradeCode"));
                item.setTradeTime(rs.getDate("TradeTime"));
                                
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
