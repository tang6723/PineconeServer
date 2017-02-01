/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.main;

import com.ft.db.access.AccountAlarmDao;
import com.ft.db.access.SystemUserDao;
import com.ft.db.mapping.AccountAlarm;
import com.ft.db.mapping.SystemUser;
import com.ft.model.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Tang
 */
public class TestDatabes {
    
    public static void main(String[] args){
         System.out.println("测试开始") ;
        //testAccountAlarmDao();
         testUser();
         //testDataService();
         System.out.println("测试结果。。。。") ;
    }
    
    
    private static void testAccountAlarmDao(){
        testDataService();
        /*
        AccountAlarm item=new AccountAlarm();
        item.setRowGUID("RowGUID");
        item.setEnterpriseCode("EnterpriseCode");
        item.setEnterpriseName("EnterpriseName");
        item.setOrganizationCode("OrganizationCode");
        item.setOrganizationName("OrganizationName");
        
        item.setReaEventID("ReaEventID");
        item.setEventName("EventName");
        item.setDSUBID1("DSUBID1");
        item.setDSUBID2("DSUBID2");
        item.setDSUBID3("DSUBID3");
        
        item.setDSUBID4("DSUBID4");
        item.setDSUBID5("DSUBID5");
        item.setCSUBID1("CSUBID1");
        item.setCSUBID2("CSUBID2");
        item.setCSUBID3("CSUBID3");
        
        item.setCSUBID4("CSUBID4");
        item.setCSUBID5("CSUBID5");
        item.setDebitAmount(66.04f);
        //item.setCreditAmount(40.60f);
        //item.setBusinessTime(new Date());
        
        item.setIssueTime(new Date());
        item.setAlertTime(new Date());
        item.setHandleTime(new Date());
        item.setHandleState("HandleState");
        item.setAlertState("AlertState");
        
        item.setPreparerName("PreparerName");
        item.setHandleName("HandleName");
        item.setState("State");
        item.setRemarks("Remarks");
        //Null  数字与日期，不传就为空，字符串可以设置为空
        item.setRowGUID("RowGUID2");
        item.setCSUBID5(null);
        //item.setCreditAmount(null);
        //item.setAlertTime(null));
        //AccountAlarmDao dao=new AccountAlarmDao();
        //List<AccountAlarm> itemList=dao.getList("");
        //AccountAlarm item1=dao.getItem("id2");
        //DataService ds=new DataService();
        //List<AccountAlarm> itemList=ds.getAccountAlarmList(2, 0);
        //boolean result=dao.insertItem(item);
        //System.out.println("测试结果，result = " + result+"  item1="+item1.getCSUBID1() );
       
        
        int a=9;
        int c=a+9;
        */
    }
    private static void testUser(){
        
        SystemUser user=new SystemUser();
        user.setRowGUID("RowGUID");
        user.setUserCode("1");
        user.setUserType("员工");
        user.setUserName("王宝强");
        user.setUserNickName("userNickName");
        user.setUserPassWord("1");
        user.setUserPermission("是");
        user.setLogTime(new Date());
        user.setOnlineState("是");
        user.setState("是");
        user.setRemarks("remarks");
        
        SystemUserDao dao=new SystemUserDao();
        user.setUserCode("3");
        user.setUserType("财务");
        user.setUserName("郭得刚");
        
        boolean result=new DataService().insetrItem(user);
        /**/
       // SystemUser result=new SystemUserDao().queryUser("2");
        System.out.println("测试结果，result = " + result );
    }
    
    private static void testDataService(){
        PagingInputParam  pageInput=new PagingInputParam();
         
        pageInput.setPageIndex(0);
        pageInput.setPageSize(2);        
        pageInput.setQuerySql("AND EnterpriseCode='EnterpriseCode'AND OrganizationCode='OrganizationCode'AND EventName LIKE ?");        
        pageInput.setQueryParam(new String[]{"%e%"});
        //DataService ds=new DataService();
        List<AccountAlarm> itemList=  new AccountAlarmDao().getList(pageInput.getQuerySql(),pageInput.getQueryParam());
        PagingOutputResult<AccountAlarm>  result=new DataService().getPaging(pageInput, AccountAlarm.class);        
        List<AccountAlarm>  res=result.getResultList();
        //
        SystemUser userItem=new DataService().getItem("2", new SystemUser());
        int a=10;
        
        //AccountAlarm item=new AccountAlarm();
       /*
       
        item.setRowGUID("RowGUID");
        item.setEnterpriseCode("EnterpriseCode");
        item.setEnterpriseName("EnterpriseName");
        item.setOrganizationCode("OrganizationCode");
        item.setOrganizationName("OrganizationName");
        
        item.setReaEventID("ReaEventID");
        item.setEventName("EventName");
        item.setDSUBID1("DSUBID1");
        item.setDSUBID2("DSUBID2");
        item.setDSUBID3("DSUBID3");
        
        item.setDSUBID4("DSUBID4");
        item.setDSUBID5("DSUBID5");
        item.setCSUBID1("CSUBID1");
        item.setCSUBID2("CSUBID2");
        item.setCSUBID3("CSUBID3");
        
        item.setCSUBID4("CSUBID4");
        item.setCSUBID5("CSUBID5");
        item.setDebitAmount(66.04f);
        //item.setCreditAmount(40.60f);
        //item.setBusinessTime(new Date());
        
        item.setIssueTime(new Date());
        item.setAlertTime(new Date());
        item.setHandleTime(new Date());
        item.setHandleState("HandleState");
        item.setAlertState("AlertState");
        
        item.setPreparerName("PreparerName");
        item.setHandleName("HandleName");
        item.setState("State");
        item.setRemarks("Remarks");
        
       */
        
        
        
        
    }
    
}
