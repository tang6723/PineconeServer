/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.MembersLevel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class MembersLevelDao {
    
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(MembersLevel item){
        String sql="INSERT  INTO  MembersLevel (MembersLevelID,LevelCode,MembersLevel,MembersID,MembersType, "
                + " MembersName,Contacts,ContactsPhone,TopLevelID,TopMembersID, "                
                + " EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,  ?,?,?,?,?,   ?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getMembersLevelID(),
            item.getLevelCode(),           
            DatabaseUtility.getInt(item.getMembersLevel()),
            item.getMembersID(),
            item.getMembersType(),
            
            item.getMembersName(),
            item.getContacts(),
            item.getContactsPhone(),
            item.getTopLevelID(),
            item.getTopMembersID(),
                        
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
    public boolean updateItem(MembersLevel item){
        String sql="UPDATE  MembersLevel "
                + "SET  LevelCode=?, MembersLevel=?, MembersID=? ,MembersType=?,"
                + "MembersName=?, Contacts=?, ContactsPhone=?, TopLevelID=?, TopMembersID=?,"                
                + "  EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE MembersLevelID=?";
        int affectRowCount = 0;
        String[] parm={            
            
            item.getLevelCode(),           
            DatabaseUtility.getInt(item.getMembersLevel()),
            item.getMembersID(),
            item.getMembersType(),
            
            item.getMembersName(),
            item.getContacts(),
            item.getContactsPhone(),
            item.getTopLevelID(),
            item.getTopMembersID(),
                        
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getMembersLevelID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(MembersLevel item){
        String sql="UPDATE  MembersLevel SET  DeleteFlag=?  WHERE MembersLevelID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getMembersLevelID()
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
    public List<MembersLevel> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM MembersLevel WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<MembersLevel> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                MembersLevel item=new MembersLevel();                
                item.setMembersLevelID(rs.getString("MembersLevelID"));
                item.setLevelCode(rs.getString("LevelCode"));
                item.setMembersLevel(rs.getInt("MembersLevel"));
                item.setMembersID(rs.getString("MembersID"));
                item.setMembersType(rs.getString("MembersType"));
                
                item.setMembersName(rs.getString("MembersName"));
                item.setContacts(rs.getString("Contacts"));
                item.setContactsPhone(rs.getString("ContactsPhone"));
                item.setTopLevelID(rs.getString("TopLevelID"));
                item.setTopMembersID(rs.getString("TopMembersID"));                
                
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
    public MembersLevel getItem(String strID){
        String sql="SELECT * FROM MembersLevel WHERE MembersLevelID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        MembersLevel item=new MembersLevel();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setMembersLevelID(rs.getString("MembersLevelID"));
                item.setLevelCode(rs.getString("LevelCode"));
                item.setMembersLevel(rs.getInt("MembersLevel"));
                item.setMembersID(rs.getString("MembersID"));
                item.setMembersType(rs.getString("MembersType"));
                
                item.setMembersName(rs.getString("MembersName"));
                item.setContacts(rs.getString("Contacts"));
                item.setContactsPhone(rs.getString("ContactsPhone"));
                item.setTopLevelID(rs.getString("TopLevelID"));
                item.setTopMembersID(rs.getString("TopMembersID"));                
                
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
