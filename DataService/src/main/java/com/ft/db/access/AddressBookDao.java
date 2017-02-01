/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.db.access;

import com.ft.db.mapping.AddressBook;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tang
 */
public class AddressBookDao {
    /**
     * 增加
     * @param item
     * @return 
     */
    public boolean insertItem(AddressBook item){
        String sql="INSERT  INTO  AddressBook (AddressBookID,MembersID,Contacts,ContactsAddress,ContactsPhone, "
                + " IsDefaultAddress,EnableFlag,DeleteFlag,Remarks)VALUES(?,?,?,?,?,    ?,?,?,?);";
        int affectRowCount = 0;
        
        String[] parm={
            item.getAddressBookID(),
            item.getMembersID(),
            item.getContacts(),
            item.getContactsAddress(),
            item.getContactsPhone(),
            
            item.getIsDefaultAddress(),
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
    public boolean updateItem(AddressBook item){
        String sql="UPDATE  AddressBook "
                + "SET  MembersID=?, Contacts=?, ContactsAddress=? ,ContactsPhone=?,"               
                + "IsDefaultAddress=?, EnableFlag=?, DeleteFlag=?, Remarks=? "
                + "WHERE AddressBookID=?";
        int affectRowCount = 0;
        String[] parm={            
            item.getMembersID(),
            item.getContacts(),
            item.getContactsAddress(),
            item.getContactsPhone(),
            
            item.getIsDefaultAddress(),
            item.getEnableFlag(),
            item.getDeleteFlag(),
            item.getRemarks(),
            
            item.getAddressBookID()
        };
        affectRowCount=DatabaseUtility.executeSQL(sql, parm);
        return affectRowCount > 0;
    }
    
    /**
     * 删除
     * @param item
     * @return 
     */
    public boolean deleteItem(AddressBook item){
        String sql="UPDATE  AddressBook SET  DeleteFlag=?  WHERE AddressBookID=?";
        int affectRowCount = 0;
        
        String[] parm={ 
            "删除",            
            item.getAddressBookID()
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
    public List<AddressBook> getList(String strWhereQuery,String[] parm){
        String sql="SELECT * FROM AddressBook WHERE 1=1 "+strWhereQuery;        
        ResultSet rs ;
        
        List<AddressBook> itemList=new ArrayList();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                AddressBook item=new AddressBook();
                item.setAddressBookID(rs.getString("AddressBookID"));
                item.setMembersID(rs.getString("MembersID"));
                item.setContacts(rs.getString("Contacts"));
                item.setContactsAddress(rs.getString("ContactsAddress"));
                item.setContactsPhone(rs.getString("ContactsPhone"));                               
                
                item.setIsDefaultAddress(rs.getString("IsDefaultAddress"));
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
    public AddressBook getItem(String strID){
        String sql="SELECT * FROM AddressBook WHERE AddressBookID=?";        
        ResultSet rs ;
        String[] parm={                        
            strID
        };
        AddressBook item=new AddressBook();
        try{
            rs=DatabaseUtility.queryResultSet(sql, parm);
            while(rs.next()){
                item.setAddressBookID(rs.getString("AddressBookID"));
                item.setMembersID(rs.getString("MembersID"));
                item.setContacts(rs.getString("Contacts"));
                item.setContactsAddress(rs.getString("ContactsAddress"));
                item.setContactsPhone(rs.getString("ContactsPhone"));                               
                
                item.setIsDefaultAddress(rs.getString("IsDefaultAddress"));
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
