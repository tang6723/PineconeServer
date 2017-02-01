/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.Deliveryman;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class DeliverymanDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(Deliveryman item){
        String sql="INSERT  INTO  Deliveryman (DeliverymanID,DeliveryID,Delivery,DeliverymanCode,DeliverymanName, "
                + " DeliverymanPhone,DeliverymanImage,JobTime,Mileage,DeliverySum, "                
                + " EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,   ?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getDeliverymanID(),
            item.getDeliveryID(),
            item.getDelivery(),
            item.getDeliverymanCode(),
            item.getDeliverymanName(),
            
            item.getDeliverymanPhone(),
            item.getDeliverymanImage(),
            DatabaseUtility.getDate(item.getJobTime()),
            item.getMileage(),
            item.getDeliverySum(),
                        
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
    public boolean updateItem(Deliveryman item){
        String sql="UPDATE  Deliveryman "
                + "SET  DeliveryID=?, Delivery=?, DeliverymanCode=? ,DeliverymanName=?,"
                + "DeliverymanPhone=?, DeliverymanImage=?, JobTime=?, Mileage=?, DeliverySum=?,"                
                + "  EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE DeliverymanID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getDeliveryID(),
            item.getDelivery(),
            item.getDeliverymanCode(),
            item.getDeliverymanName(),
            
            item.getDeliverymanPhone(),
            item.getDeliverymanImage(),
            DatabaseUtility.getDate(item.getJobTime()),
            item.getMileage(),
            item.getDeliverySum(),
                        
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getDeliverymanID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(Deliveryman item){
        String sql="UPDATE  Deliveryman SET  DeleteFlag=?  WHERE AccountAlarmID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getDeliverymanID()
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
    public List<Deliveryman> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM Deliveryman WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<Deliveryman> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                Deliveryman item=new Deliveryman();
                item.setDeliverymanID(rs.getString("DeliverymanID"));
                item.setDeliveryID(rs.getString("DeliveryID"));
                item.setDelivery(rs.getString("Delivery"));
                item.setDeliverymanCode(rs.getString("DeliverymanCode"));
                item.setDeliverymanName(rs.getString("DeliverymanName"));
                                
                item.setDeliverymanPhone(rs.getString("DeliverymanPhone"));
                item.setDeliverymanImage(rs.getString("DeliverymanImage"));
                item.setJobTime(rs.getDate("JobTime"));
                item.setMileage(rs.getString("Mileage"));
                item.setDeliverySum(rs.getString("DeliverySum"));
                                
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
    public Deliveryman getItem(String strID){
        String sql="SELECT * FROM Deliveryman WHERE DeliverymanID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        Deliveryman item=new Deliveryman();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setDeliverymanID(rs.getString("DeliverymanID"));
                item.setDeliveryID(rs.getString("DeliveryID"));
                item.setDelivery(rs.getString("Delivery"));
                item.setDeliverymanCode(rs.getString("DeliverymanCode"));
                item.setDeliverymanName(rs.getString("DeliverymanName"));
                                
                item.setDeliverymanPhone(rs.getString("DeliverymanPhone"));
                item.setDeliverymanImage(rs.getString("DeliverymanImage"));
                item.setJobTime(rs.getDate("JobTime"));
                item.setMileage(rs.getString("Mileage"));
                item.setDeliverySum(rs.getString("DeliverySum"));
                                
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
