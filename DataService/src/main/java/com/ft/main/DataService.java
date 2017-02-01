/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.main;

import com.ft.db.mapping.*;
import com.ft.db.access.*;
import com.ft.model.PagingInputParam;
import com.ft.model.PagingOutputResult;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Tang
 */
public class DataService {

    public DataService() {
        DatabaseUtility.initDatabaseUtility();
    }

    /*
     * 查找用户信息
     *
     * @param userCode
     * @return
     */
    public SystemUser queryUser(String userCode) {
        SystemUser result = new SystemUser();
        result = new SystemUserDao().queryUser(userCode);
        return result;
    }

    /**
     * 查找用户属性信息
     *
     * @param userID
     * @param userCode
     * @return
     */
    public List<SystemUserProperty> getUserInf(String userID) {
        List<SystemUserProperty> resultList = new SystemUserPropertyDao().getList("AND SystemUserID=?", new String[]{"userID"});
        return resultList;

    }

    /**
     * 插入数据
     *
     * @param <T>
     * @param t
     * @return
     */
    public <T> boolean insetrItem(T t) {
        System.out.println(t.getClass().getName());
        boolean result = false;
        if (t.getClass().getName().equals(AccountAlarm.class.getName())) {
            result = new AccountAlarmDao().insertItem((AccountAlarm) t);
        } else if (t.getClass().getName().equals(AccountAsset.class.getName())) {
            result = new AccountAssetDao().insertItem((AccountAsset) t);
        } else if (t.getClass().getName().equals(AccountCost.class.getName())) {
            result = new AccountCostDao().insertItem((AccountCost) t);
        } else if (t.getClass().getName().equals(AccountDaybook.class.getName())) {
            result = new AccountDaybookDao().insertItem((AccountDaybook) t);
        } else if (t.getClass().getName().equals(AccountDictionaries.class.getName())) {
            result = new AccountDictionariesDao().insertItem((AccountDictionaries) t);

        } else if (t.getClass().getName().equals(AccountLiabilities.class.getName())) {
            result = new AccountLiabilitiesDao().insertItem((AccountLiabilities) t);
        } else if (t.getClass().getName().equals(AccountOwnerEquity.class.getName())) {
            result = new AccountOwnerEquityDao().insertItem((AccountOwnerEquity) t);
        } else if (t.getClass().getName().equals(AccountProfitLoss.class.getName())) {
            result = new AccountProfitLossDao().insertItem((AccountProfitLoss) t);
        } else if (t.getClass().getName().equals(Contracts.class.getName())) {
            result = new ContractsDao().insertItem((Contracts) t);
        } else if (t.getClass().getName().equals(ContractsExecute.class.getName())) {
            result = new ContractsExecuteDao().insertItem((ContractsExecute) t);

        } else if (t.getClass().getName().equals(ContractsExecuteList.class.getName())) {
            result = new ContractsExecuteListDao().insertItem((ContractsExecuteList) t);
        } else if (t.getClass().getName().equals(ContractsExpenses.class.getName())) {
            result = new ContractsExpensesDao().insertItem((ContractsExpenses) t);
        } else if (t.getClass().getName().equals(ContractsList.class.getName())) {
            result = new ContractsListDao().insertItem((ContractsList) t);
        } else if (t.getClass().getName().equals(ContractsState.class.getName())) {
            result = new ContractsStateDao().insertItem((ContractsState) t);
        } else if (t.getClass().getName().equals(ReaContractResourceList.class.getName())) {
            result = new ReaContractResourceListDao().insertItem((ReaContractResourceList) t);

        } else if (t.getClass().getName().equals(ReaContracts.class.getName())) {
            result = new ReaContractsDao().insertItem((ReaContracts) t);
        } else if (t.getClass().getName().equals(ReaCustomer.class.getName())) {
            result = new ReaCustomerDao().insertItem((ReaCustomer) t);
        } else if (t.getClass().getName().equals(ReaEmployee.class.getName())) {
            result = new ReaEmployeeDao().insertItem((ReaEmployee) t);
        } else if (t.getClass().getName().equals(ReaEnterpriseData.class.getName())) {
            result = new ReaEnterpriseDataDao().insertItem((ReaEnterpriseData) t);
        } else if (t.getClass().getName().equals(ReaEnterpriseDictionary.class.getName())) {
            result = new ReaEnterpriseDictionaryDao().insertItem((ReaEnterpriseDictionary) t);

        } else if (t.getClass().getName().equals(ReaEnterpriseOrganization.class.getName())) {
            result = new ReaEnterpriseOrganizationDao().insertItem((ReaEnterpriseOrganization) t);
        } else if (t.getClass().getName().equals(ReaEvent.class.getName())) {
            result = new ReaEventDao().insertItem((ReaEvent) t);
        } else if (t.getClass().getName().equals(ReaEventAgentDictionary.class.getName())) {
            result = new ReaEventAgentDictionaryDao().insertItem((ReaEventAgentDictionary) t);
        } else if (t.getClass().getName().equals(ReaEventContractDictionary.class.getName())) {
            result = new ReaEventContractDictionaryDao().insertItem((ReaEventContractDictionary) t);
        } else if (t.getClass().getName().equals(ReaExpenses.class.getName())) {
            result = new ReaExpensesDao().insertItem((ReaExpenses) t);

        } else if (t.getClass().getName().equals(ReaProject.class.getName())) {
            result = new ReaProjectDao().insertItem((ReaProject) t);
        } else if (t.getClass().getName().equals(ReaResource.class.getName())) {
            result = new ReaResourceDao().insertItem((ReaResource) t);
        } else if (t.getClass().getName().equals(ReaResourceAdjustPrice.class.getName())) {
            result = new ReaResourceAdjustPriceDao().insertItem((ReaResourceAdjustPrice) t);
        } else if (t.getClass().getName().equals(ReaResourceEventDictionary.class.getName())) {
            result = new ReaResourceEventDictionaryDao().insertItem((ReaResourceEventDictionary) t);
        } else if (t.getClass().getName().equals(ReaResourceGroup.class.getName())) {
            result = new ReaResourceGroupDao().insertItem((ReaResourceGroup) t);

        } else if (t.getClass().getName().equals(ReaResourceType.class.getName())) {
            result = new ReaResourceTypeDao().insertItem((ReaResourceType) t);
        } else if (t.getClass().getName().equals(Stock.class.getName())) {
            result = new StockDao().insertItem((Stock) t);
        } else if (t.getClass().getName().equals(StockAccount.class.getName())) {
            result = new StockAccountDao().insertItem((StockAccount) t);
        } else if (t.getClass().getName().equals(StockCheck.class.getName())) {
            result = new StockCheckDao().insertItem((StockCheck) t);
        } else if (t.getClass().getName().equals(StockCheckList.class.getName())) {
            result = new StockCheckListDao().insertItem((StockCheckList) t);

        } else if (t.getClass().getName().equals(StockData.class.getName())) {
            result = new StockDataDao().insertItem((StockData) t);
        } else if (t.getClass().getName().equals(StockInventory.class.getName())) {
            result = new StockInventoryDao().insertItem((StockInventory) t);
        } else if (t.getClass().getName().equals(StockInventoryList.class.getName())) {
            result = new StockInventoryListDao().insertItem((StockInventoryList) t);
        } else if (t.getClass().getName().equals(SysUserReceiveData.class.getName())) {
            result = new SysUserReceiveDataDao().insertItem((SysUserReceiveData) t);
        } else if (t.getClass().getName().equals(SystemAdressDictionaries.class.getName())) {
            result = new SystemAdressDictionariesDao().insertItem((SystemAdressDictionaries) t);

        } else if (t.getClass().getName().equals(SystemData.class.getName())) {
            result = new SystemDataDao().insertItem((SystemData) t);
        } else if (t.getClass().getName().equals(SystemDictionaries.class.getName())) {
            result = new SystemDictionariesDao().insertItem((SystemDictionaries) t);
        } else if (t.getClass().getName().equals(SystemEnterprise.class.getName())) {
            result = new SystemEnterpriseDao().insertItem((SystemEnterprise) t);
        } else if (t.getClass().getName().equals(SystemEnterpriseCertificate.class.getName())) {
            result = new SystemEnterpriseCertificateDao().insertItem((SystemEnterpriseCertificate) t);
        } else if (t.getClass().getName().equals(SystemImage.class.getName())) {
            result = new SystemImageDao().insertItem((SystemImage) t);

        } else if (t.getClass().getName().equals(SystemLogData.class.getName())) {
            result = new SystemLogDataDao().insertItem((SystemLogData) t);
        } else if (t.getClass().getName().equals(SystemUser.class.getName())) {
            result = new SystemUserDao().insertItem((SystemUser) t);
        } else if (t.getClass().getName().equals(SystemUserCertificate.class.getName())) {
            result = new SystemUserCertificateDao().insertItem((SystemUserCertificate) t);
        } else if (t.getClass().getName().equals(SystemUserLog.class.getName())) {
            result = new SystemUserLogDao().insertItem((SystemUserLog) t);
        } else if (t.getClass().getName().equals(SystemUserProperty.class.getName())) {
            result = new SystemUserPropertyDao().insertItem((SystemUserProperty) t);

        }

        return result;
    }

    /**
     * 更新数据
     *
     * @param <T>
     * @param t
     * @return
     */
    public <T> boolean updateItem(T t) {
        System.out.println(t.getClass().getName());
        boolean result = false;
        if (t.getClass().getName().equals(AccountAlarm.class.getName())) {
            result = new AccountAlarmDao().updateItem((AccountAlarm) t);
        } else if (t.getClass().getName().equals(AccountAsset.class.getName())) {
            result = new AccountAssetDao().updateItem((AccountAsset) t);
        } else if (t.getClass().getName().equals(AccountCost.class.getName())) {
            result = new AccountCostDao().updateItem((AccountCost) t);
        } else if (t.getClass().getName().equals(AccountDaybook.class.getName())) {
            result = new AccountDaybookDao().updateItem((AccountDaybook) t);
        } else if (t.getClass().getName().equals(AccountDictionaries.class.getName())) {
            result = new AccountDictionariesDao().updateItem((AccountDictionaries) t);

        } else if (t.getClass().getName().equals(AccountLiabilities.class.getName())) {
            result = new AccountLiabilitiesDao().updateItem((AccountLiabilities) t);
        } else if (t.getClass().getName().equals(AccountOwnerEquity.class.getName())) {
            result = new AccountOwnerEquityDao().updateItem((AccountOwnerEquity) t);
        } else if (t.getClass().getName().equals(AccountProfitLoss.class.getName())) {
            result = new AccountProfitLossDao().updateItem((AccountProfitLoss) t);
        } else if (t.getClass().getName().equals(Contracts.class.getName())) {
            result = new ContractsDao().updateItem((Contracts) t);
        } else if (t.getClass().getName().equals(ContractsExecute.class.getName())) {
            result = new ContractsExecuteDao().updateItem((ContractsExecute) t);

        } else if (t.getClass().getName().equals(ContractsExecuteList.class.getName())) {
            result = new ContractsExecuteListDao().updateItem((ContractsExecuteList) t);
        } else if (t.getClass().getName().equals(ContractsExpenses.class.getName())) {
            result = new ContractsExpensesDao().updateItem((ContractsExpenses) t);
        } else if (t.getClass().getName().equals(ContractsList.class.getName())) {
            result = new ContractsListDao().updateItem((ContractsList) t);
        } else if (t.getClass().getName().equals(ContractsState.class.getName())) {
            result = new ContractsStateDao().updateItem((ContractsState) t);
        } else if (t.getClass().getName().equals(ReaContractResourceList.class.getName())) {
            result = new ReaContractResourceListDao().updateItem((ReaContractResourceList) t);

        } else if (t.getClass().getName().equals(ReaContracts.class.getName())) {
            result = new ReaContractsDao().updateItem((ReaContracts) t);
        } else if (t.getClass().getName().equals(ReaCustomer.class.getName())) {
            result = new ReaCustomerDao().updateItem((ReaCustomer) t);
        } else if (t.getClass().getName().equals(ReaEmployee.class.getName())) {
            result = new ReaEmployeeDao().updateItem((ReaEmployee) t);
        } else if (t.getClass().getName().equals(ReaEnterpriseData.class.getName())) {
            result = new ReaEnterpriseDataDao().updateItem((ReaEnterpriseData) t);
        } else if (t.getClass().getName().equals(ReaEnterpriseDictionary.class.getName())) {
            result = new ReaEnterpriseDictionaryDao().updateItem((ReaEnterpriseDictionary) t);

        } else if (t.getClass().getName().equals(ReaEnterpriseOrganization.class.getName())) {
            result = new ReaEnterpriseOrganizationDao().updateItem((ReaEnterpriseOrganization) t);
        } else if (t.getClass().getName().equals(ReaEvent.class.getName())) {
            result = new ReaEventDao().updateItem((ReaEvent) t);
        } else if (t.getClass().getName().equals(ReaEventAgentDictionary.class.getName())) {
            result = new ReaEventAgentDictionaryDao().updateItem((ReaEventAgentDictionary) t);
        } else if (t.getClass().getName().equals(ReaEventContractDictionary.class.getName())) {
            result = new ReaEventContractDictionaryDao().updateItem((ReaEventContractDictionary) t);
        } else if (t.getClass().getName().equals(ReaExpenses.class.getName())) {
            result = new ReaExpensesDao().updateItem((ReaExpenses) t);

        } else if (t.getClass().getName().equals(ReaProject.class.getName())) {
            result = new ReaProjectDao().updateItem((ReaProject) t);
        } else if (t.getClass().getName().equals(ReaResource.class.getName())) {
            result = new ReaResourceDao().updateItem((ReaResource) t);
        } else if (t.getClass().getName().equals(ReaResourceAdjustPrice.class.getName())) {
            result = new ReaResourceAdjustPriceDao().updateItem((ReaResourceAdjustPrice) t);
        } else if (t.getClass().getName().equals(ReaResourceEventDictionary.class.getName())) {
            result = new ReaResourceEventDictionaryDao().updateItem((ReaResourceEventDictionary) t);
        } else if (t.getClass().getName().equals(ReaResourceGroup.class.getName())) {
            result = new ReaResourceGroupDao().updateItem((ReaResourceGroup) t);

        } else if (t.getClass().getName().equals(ReaResourceType.class.getName())) {
            result = new ReaResourceTypeDao().updateItem((ReaResourceType) t);
        } else if (t.getClass().getName().equals(Stock.class.getName())) {
            result = new StockDao().updateItem((Stock) t);
        } else if (t.getClass().getName().equals(StockAccount.class.getName())) {
            result = new StockAccountDao().updateItem((StockAccount) t);
        } else if (t.getClass().getName().equals(StockCheck.class.getName())) {
            result = new StockCheckDao().updateItem((StockCheck) t);
        } else if (t.getClass().getName().equals(StockCheckList.class.getName())) {
            result = new StockCheckListDao().updateItem((StockCheckList) t);

        } else if (t.getClass().getName().equals(StockData.class.getName())) {
            result = new StockDataDao().updateItem((StockData) t);
        } else if (t.getClass().getName().equals(StockInventory.class.getName())) {
            result = new StockInventoryDao().updateItem((StockInventory) t);
        } else if (t.getClass().getName().equals(StockInventoryList.class.getName())) {
            result = new StockInventoryListDao().updateItem((StockInventoryList) t);
        } else if (t.getClass().getName().equals(SysUserReceiveData.class.getName())) {
            result = new SysUserReceiveDataDao().updateItem((SysUserReceiveData) t);
        } else if (t.getClass().getName().equals(SystemAdressDictionaries.class.getName())) {
            result = new SystemAdressDictionariesDao().updateItem((SystemAdressDictionaries) t);

        } else if (t.getClass().getName().equals(SystemData.class.getName())) {
            result = new SystemDataDao().updateItem((SystemData) t);
        } else if (t.getClass().getName().equals(SystemDictionaries.class.getName())) {
            result = new SystemDictionariesDao().updateItem((SystemDictionaries) t);
        } else if (t.getClass().getName().equals(SystemEnterprise.class.getName())) {
            result = new SystemEnterpriseDao().updateItem((SystemEnterprise) t);
        } else if (t.getClass().getName().equals(SystemEnterpriseCertificate.class.getName())) {
            result = new SystemEnterpriseCertificateDao().updateItem((SystemEnterpriseCertificate) t);
        } else if (t.getClass().getName().equals(SystemImage.class.getName())) {
            result = new SystemImageDao().updateItem((SystemImage) t);

        } else if (t.getClass().getName().equals(SystemLogData.class.getName())) {
            result = new SystemLogDataDao().updateItem((SystemLogData) t);
        } else if (t.getClass().getName().equals(SystemUser.class.getName())) {
            result = new SystemUserDao().updateItem((SystemUser) t);
        } else if (t.getClass().getName().equals(SystemUserCertificate.class.getName())) {
            result = new SystemUserCertificateDao().updateItem((SystemUserCertificate) t);
        } else if (t.getClass().getName().equals(SystemUserLog.class.getName())) {
            result = new SystemUserLogDao().updateItem((SystemUserLog) t);
        } else if (t.getClass().getName().equals(SystemUserProperty.class.getName())) {
            result = new SystemUserPropertyDao().updateItem((SystemUserProperty) t);

        }

        return result;
    }

    /**
     * 删除数据
     *
     * @param <T>
     * @param t
     * @return
     */
    public <T> boolean deleteItem(T t) {
        System.out.println(t.getClass().getName());
        boolean result = false;
        if (t.getClass().getName().equals(AccountAlarm.class.getName())) {
            result = new AccountAlarmDao().deleteItem((AccountAlarm) t);
        } else if (t.getClass().getName().equals(AccountAsset.class.getName())) {
            result = new AccountAssetDao().deleteItem((AccountAsset) t);
        } else if (t.getClass().getName().equals(AccountCost.class.getName())) {
            result = new AccountCostDao().deleteItem((AccountCost) t);
        } else if (t.getClass().getName().equals(AccountDaybook.class.getName())) {
            result = new AccountDaybookDao().deleteItem((AccountDaybook) t);
        } else if (t.getClass().getName().equals(AccountDictionaries.class.getName())) {
            result = new AccountDictionariesDao().deleteItem((AccountDictionaries) t);

        } else if (t.getClass().getName().equals(AccountLiabilities.class.getName())) {
            result = new AccountLiabilitiesDao().deleteItem((AccountLiabilities) t);
        } else if (t.getClass().getName().equals(AccountOwnerEquity.class.getName())) {
            result = new AccountOwnerEquityDao().deleteItem((AccountOwnerEquity) t);
        } else if (t.getClass().getName().equals(AccountProfitLoss.class.getName())) {
            result = new AccountProfitLossDao().deleteItem((AccountProfitLoss) t);
        } else if (t.getClass().getName().equals(Contracts.class.getName())) {
            result = new ContractsDao().deleteItem((Contracts) t);
        } else if (t.getClass().getName().equals(ContractsExecute.class.getName())) {
            result = new ContractsExecuteDao().deleteItem((ContractsExecute) t);

        } else if (t.getClass().getName().equals(ContractsExecuteList.class.getName())) {
            result = new ContractsExecuteListDao().deleteItem((ContractsExecuteList) t);
        } else if (t.getClass().getName().equals(ContractsExpenses.class.getName())) {
            result = new ContractsExpensesDao().deleteItem((ContractsExpenses) t);
        } else if (t.getClass().getName().equals(ContractsList.class.getName())) {
            result = new ContractsListDao().deleteItem((ContractsList) t);
        } else if (t.getClass().getName().equals(ContractsState.class.getName())) {
            result = new ContractsStateDao().deleteItem((ContractsState) t);
        } else if (t.getClass().getName().equals(ReaContractResourceList.class.getName())) {
            result = new ReaContractResourceListDao().deleteItem((ReaContractResourceList) t);

        } else if (t.getClass().getName().equals(ReaContracts.class.getName())) {
            result = new ReaContractsDao().deleteItem((ReaContracts) t);
        } else if (t.getClass().getName().equals(ReaCustomer.class.getName())) {
            result = new ReaCustomerDao().deleteItem((ReaCustomer) t);
        } else if (t.getClass().getName().equals(ReaEmployee.class.getName())) {
            result = new ReaEmployeeDao().deleteItem((ReaEmployee) t);
        } else if (t.getClass().getName().equals(ReaEnterpriseData.class.getName())) {
            result = new ReaEnterpriseDataDao().deleteItem((ReaEnterpriseData) t);
        } else if (t.getClass().getName().equals(ReaEnterpriseDictionary.class.getName())) {
            result = new ReaEnterpriseDictionaryDao().deleteItem((ReaEnterpriseDictionary) t);

        } else if (t.getClass().getName().equals(ReaEnterpriseOrganization.class.getName())) {
            result = new ReaEnterpriseOrganizationDao().deleteItem((ReaEnterpriseOrganization) t);
        } else if (t.getClass().getName().equals(ReaEvent.class.getName())) {
            result = new ReaEventDao().deleteItem((ReaEvent) t);
        } else if (t.getClass().getName().equals(ReaEventAgentDictionary.class.getName())) {
            result = new ReaEventAgentDictionaryDao().deleteItem((ReaEventAgentDictionary) t);
        } else if (t.getClass().getName().equals(ReaEventContractDictionary.class.getName())) {
            result = new ReaEventContractDictionaryDao().deleteItem((ReaEventContractDictionary) t);
        } else if (t.getClass().getName().equals(ReaExpenses.class.getName())) {
            result = new ReaExpensesDao().deleteItem((ReaExpenses) t);

        } else if (t.getClass().getName().equals(ReaProject.class.getName())) {
            result = new ReaProjectDao().deleteItem((ReaProject) t);
        } else if (t.getClass().getName().equals(ReaResource.class.getName())) {
            result = new ReaResourceDao().deleteItem((ReaResource) t);
        } else if (t.getClass().getName().equals(ReaResourceAdjustPrice.class.getName())) {
            result = new ReaResourceAdjustPriceDao().deleteItem((ReaResourceAdjustPrice) t);
        } else if (t.getClass().getName().equals(ReaResourceEventDictionary.class.getName())) {
            result = new ReaResourceEventDictionaryDao().deleteItem((ReaResourceEventDictionary) t);
        } else if (t.getClass().getName().equals(ReaResourceGroup.class.getName())) {
            result = new ReaResourceGroupDao().deleteItem((ReaResourceGroup) t);

        } else if (t.getClass().getName().equals(ReaResourceType.class.getName())) {
            result = new ReaResourceTypeDao().deleteItem((ReaResourceType) t);
        } else if (t.getClass().getName().equals(Stock.class.getName())) {
            result = new StockDao().deleteItem((Stock) t);
        } else if (t.getClass().getName().equals(StockAccount.class.getName())) {
            result = new StockAccountDao().deleteItem((StockAccount) t);
        } else if (t.getClass().getName().equals(StockCheck.class.getName())) {
            result = new StockCheckDao().deleteItem((StockCheck) t);
        } else if (t.getClass().getName().equals(StockCheckList.class.getName())) {
            result = new StockCheckListDao().deleteItem((StockCheckList) t);

        } else if (t.getClass().getName().equals(StockData.class.getName())) {
            result = new StockDataDao().deleteItem((StockData) t);
        } else if (t.getClass().getName().equals(StockInventory.class.getName())) {
            result = new StockInventoryDao().deleteItem((StockInventory) t);
        } else if (t.getClass().getName().equals(StockInventoryList.class.getName())) {
            result = new StockInventoryListDao().deleteItem((StockInventoryList) t);
        } else if (t.getClass().getName().equals(SysUserReceiveData.class.getName())) {
            result = new SysUserReceiveDataDao().deleteItem((SysUserReceiveData) t);
        } else if (t.getClass().getName().equals(SystemAdressDictionaries.class.getName())) {
            result = new SystemAdressDictionariesDao().deleteItem((SystemAdressDictionaries) t);

        } else if (t.getClass().getName().equals(SystemData.class.getName())) {
            result = new SystemDataDao().deleteItem((SystemData) t);
        } else if (t.getClass().getName().equals(SystemDictionaries.class.getName())) {
            result = new SystemDictionariesDao().deleteItem((SystemDictionaries) t);
        } else if (t.getClass().getName().equals(SystemEnterprise.class.getName())) {
            result = new SystemEnterpriseDao().deleteItem((SystemEnterprise) t);
        } else if (t.getClass().getName().equals(SystemEnterpriseCertificate.class.getName())) {
            result = new SystemEnterpriseCertificateDao().deleteItem((SystemEnterpriseCertificate) t);
        } else if (t.getClass().getName().equals(SystemImage.class.getName())) {
            result = new SystemImageDao().deleteItem((SystemImage) t);

        } else if (t.getClass().getName().equals(SystemLogData.class.getName())) {
            result = new SystemLogDataDao().deleteItem((SystemLogData) t);
        } else if (t.getClass().getName().equals(SystemUser.class.getName())) {
            result = new SystemUserDao().deleteItem((SystemUser) t);
        } else if (t.getClass().getName().equals(SystemUserCertificate.class.getName())) {
            result = new SystemUserCertificateDao().deleteItem((SystemUserCertificate) t);
        } else if (t.getClass().getName().equals(SystemUserLog.class.getName())) {
            result = new SystemUserLogDao().deleteItem((SystemUserLog) t);
        } else if (t.getClass().getName().equals(SystemUserProperty.class.getName())) {
            result = new SystemUserPropertyDao().deleteItem((SystemUserProperty) t);

        }

        return result;
    }

    /**
     * 根据ID，查询数据
     *
     * @param <T>
     * @param itemID
     * @param t
     * @return
     */
    public <T> T getItem(String itemID, T t) {
        T result = null;
        System.out.println(t.getClass().getName());
        if (t.getClass().getName().equals(AccountAlarm.class.getName())) {
            result = (T) new AccountAlarmDao().getItem(itemID);
        } else if (t.getClass().getName().equals(AccountAsset.class.getName())) {
            result = (T) new AccountAssetDao().getItem(itemID);
        } else if (t.getClass().getName().equals(AccountCost.class.getName())) {
            result = (T) new AccountCostDao().getItem(itemID);
        } else if (t.getClass().getName().equals(AccountDaybook.class.getName())) {
            result = (T) new AccountDaybookDao().getItem(itemID);
        } else if (t.getClass().getName().equals(AccountDictionaries.class.getName())) {
            result = (T) new AccountDictionariesDao().getItem(itemID);

        } else if (t.getClass().getName().equals(AccountLiabilities.class.getName())) {
            result = (T) new AccountLiabilitiesDao().getItem(itemID);
        } else if (t.getClass().getName().equals(AccountOwnerEquity.class.getName())) {
            result = (T) new AccountOwnerEquityDao().getItem(itemID);
        } else if (t.getClass().getName().equals(AccountProfitLoss.class.getName())) {
            result = (T) new AccountProfitLossDao().getItem(itemID);
        } else if (t.getClass().getName().equals(Contracts.class.getName())) {
            result = (T) new ContractsDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ContractsExecute.class.getName())) {
            result = (T) new ContractsExecuteDao().getItem(itemID);

        } else if (t.getClass().getName().equals(ContractsExecuteList.class.getName())) {
            result = (T) new ContractsExecuteListDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ContractsExpenses.class.getName())) {
            result = (T) new ContractsExpensesDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ContractsList.class.getName())) {
            result = (T) new ContractsListDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ContractsState.class.getName())) {
            result = (T) new ContractsStateDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaContractResourceList.class.getName())) {
            result = (T) new ReaContractResourceListDao().getItem(itemID);

        } else if (t.getClass().getName().equals(ReaContracts.class.getName())) {
            result = (T) new ReaContractsDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaCustomer.class.getName())) {
            result = (T) new ReaCustomerDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaEmployee.class.getName())) {
            result = (T) new ReaEmployeeDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaEnterpriseData.class.getName())) {
            result = (T) new ReaEnterpriseDataDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaEnterpriseDictionary.class.getName())) {
            result = (T) new ReaEnterpriseDictionaryDao().getItem(itemID);

        } else if (t.getClass().getName().equals(ReaEnterpriseOrganization.class.getName())) {
            result = (T) new ReaEnterpriseOrganizationDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaEvent.class.getName())) {
            result = (T) new ReaEventDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaEventAgentDictionary.class.getName())) {
            result = (T) new ReaEventAgentDictionaryDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaEventContractDictionary.class.getName())) {
            result = (T) new ReaEventContractDictionaryDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaExpenses.class.getName())) {
            result = (T) new ReaExpensesDao().getItem(itemID);

        } else if (t.getClass().getName().equals(ReaProject.class.getName())) {
            result = (T) new ReaProjectDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaResource.class.getName())) {
            result = (T) new ReaResourceDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaResourceAdjustPrice.class.getName())) {
            result = (T) new ReaResourceAdjustPriceDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaResourceEventDictionary.class.getName())) {
            result = (T) new ReaResourceEventDictionaryDao().getItem(itemID);
        } else if (t.getClass().getName().equals(ReaResourceGroup.class.getName())) {
            result = (T) new ReaResourceGroupDao().getItem(itemID);

        } else if (t.getClass().getName().equals(ReaResourceType.class.getName())) {
            result = (T) new ReaResourceTypeDao().getItem(itemID);
        } else if (t.getClass().getName().equals(Stock.class.getName())) {
            result = (T) new StockDao().getItem(itemID);
        } else if (t.getClass().getName().equals(StockAccount.class.getName())) {
            result = (T) new StockAccountDao().getItem(itemID);
        } else if (t.getClass().getName().equals(StockCheck.class.getName())) {
            result = (T) new StockCheckDao().getItem(itemID);
        } else if (t.getClass().getName().equals(StockCheckList.class.getName())) {
            result = (T) new StockCheckListDao().getItem(itemID);

        } else if (t.getClass().getName().equals(StockData.class.getName())) {
            result = (T) new StockDataDao().getItem(itemID);
        } else if (t.getClass().getName().equals(StockInventory.class.getName())) {
            result = (T) new StockInventoryDao().getItem(itemID);
        } else if (t.getClass().getName().equals(StockInventoryList.class.getName())) {
            result = (T) new StockInventoryListDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SysUserReceiveData.class.getName())) {
            result = (T) new SysUserReceiveDataDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SystemAdressDictionaries.class.getName())) {
            result = (T) new SystemAdressDictionariesDao().getItem(itemID);

        } else if (t.getClass().getName().equals(SystemData.class.getName())) {
            result = (T) new SystemDataDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SystemDictionaries.class.getName())) {
            result = (T) new SystemDictionariesDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SystemEnterprise.class.getName())) {
            result = (T) new SystemEnterpriseDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SystemEnterpriseCertificate.class.getName())) {
            result = (T) new SystemEnterpriseCertificateDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SystemImage.class.getName())) {
            result = (T) new SystemImageDao().getItem(itemID);

        } else if (t.getClass().getName().equals(SystemLogData.class.getName())) {
            result = (T) new SystemLogDataDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SystemUser.class.getName())) {
            result = (T) new SystemUserDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SystemUserCertificate.class.getName())) {
            result = (T) new SystemUserCertificateDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SystemUserLog.class.getName())) {
            result = (T) new SystemUserLogDao().getItem(itemID);
        } else if (t.getClass().getName().equals(SystemUserProperty.class.getName())) {
            result = (T) new SystemUserPropertyDao().getItem(itemID);

        }

        return result;
    }

    
    
    /*
     * 查询数据
     */
    public PagingOutputResult getPaging(PagingInputParam inputParam, Class<?> outputType) {
        PagingOutputResult outputResult = new PagingOutputResult();
        try {
            List<?> list = null;
            System.out.println(outputType.getName());
            System.out.println(AccountAlarm.class.getName());
            if (outputType.getName().equals(AccountAlarm.class.getName())) {
                list = new AccountAlarmDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(AccountAsset.class.getName())) {
                list = new AccountAssetDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(AccountCost.class.getName())) {
                list = new AccountCostDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(AccountDaybook.class.getName())) {
                list = new AccountDaybookDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(AccountDictionaries.class.getName())) {
                list = new AccountDictionariesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.getName().equals(AccountLiabilities.class.getName())) {
                list = new AccountLiabilitiesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(AccountOwnerEquity.class.getName())) {
                list = new AccountOwnerEquityDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(AccountProfitLoss.class.getName())) {
                list = new AccountProfitLossDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(Contracts.class.getName())) {
                list = new ContractsDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ContractsExecute.class.getName())) {
                list = new ContractsExecuteDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.getName().equals(ContractsExecuteList.class.getName())) {
                list = new ContractsExecuteListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ContractsExpenses.class.getName())) {
                list = new ContractsExpensesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ContractsList.class.getName())) {
                list = new ContractsListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ContractsState.class.getName())) {
                list = new ContractsStateDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaContractResourceList.class.getName())) {
                list = new ReaContractResourceListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.getName().equals(ReaContracts.class.getName())) {
                list = new ReaContractsDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaCustomer.class.getName())) {
                list = new ReaCustomerDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaEmployee.class.getName())) {
                list = new ReaEmployeeDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaEnterpriseData.class.getName())) {
                list = new ReaEnterpriseDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaEnterpriseDictionary.class.getName())) {
                list = new ReaEnterpriseDictionaryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.getName().equals(ReaEnterpriseOrganization.class.getName())) {
                list = new ReaEnterpriseOrganizationDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaEvent.class.getName())) {
                list = new ReaEventDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaEventAgentDictionary.class.getName())) {
                list = new ReaEventAgentDictionaryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaEventContractDictionary.class.getName())) {
                list = new ReaEventContractDictionaryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaExpenses.class.getName())) {
                list = new ReaExpensesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.getName().equals(ReaProject.class.getName())) {
                list = new ReaProjectDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaResource.class.getName())) {
                list = new ReaResourceDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaResourceAdjustPrice.class.getName())) {
                list = new ReaResourceAdjustPriceDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaResourceEventDictionary.class.getName())) {
                list = new ReaResourceEventDictionaryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(ReaResourceGroup.class.getName())) {
                list = new ReaResourceGroupDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.getName().equals(ReaResourceType.class.getName())) {
                list = new ReaResourceTypeDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(Stock.class.getName())) {
                list = new StockDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(StockAccount.class.getName())) {
                list = new StockAccountDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(StockCheck.class.getName())) {
                list = new StockCheckDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(StockCheckList.class.getName())) {
                list = new StockCheckListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.getName().equals(StockData.class.getName())) {
                list = new StockDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(StockInventory.class.getName())) {
                list = new StockInventoryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(StockInventoryList.class.getName())) {
                list = new StockInventoryListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(SysUserReceiveData.class.getName())) {
                list = new SysUserReceiveDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(SystemAdressDictionaries.class.getName())) {
                list = new SystemAdressDictionariesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.getName().equals(SystemData.class.getName())) {
                list = new SystemDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(SystemDictionaries.class.getName())) {
                list = new SystemDictionariesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(SystemEnterprise.class.getName())) {
                list = new SystemEnterpriseDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(SystemImage.class.getName())) {
                list = new SystemImageDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(AccountAlarm.class.getName())) {
                list = new AccountCostDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.getName().equals(SystemLogData.class.getName())) {
                list = new SystemLogDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(SystemUser.class.getName())) {
                list = new SystemUserDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(SystemUserCertificate.class.getName())) {
                list = new SystemUserCertificateDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(SystemUserLog.class.getName())) {
                list = new SystemUserLogDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.getName().equals(SystemUserProperty.class.getName())) {
                list = new SystemUserPropertyDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            }

            outputResult.setResultList(list);
            // todo: 获取查询数据长度
            outputResult.setTotal(100);
        } catch (Exception ex) {
            Logger.getLogger(DataService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return outputResult;
    }
    
    /*
     * 查询数据
     */
    public PagingOutputResult getPaging(PagingInputParam inputParam, String outputType) {
        PagingOutputResult outputResult = new PagingOutputResult();
        try {
            List<?> list = null;
            System.out.println(AccountAlarm.class.getName());

            if (outputType.equals(AccountAlarm.class.getName())) {
                list = new AccountAlarmDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(AccountAsset.class.getName())) {
                list = new AccountAssetDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(AccountCost.class.getName())) {
                list = new AccountCostDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(AccountDaybook.class.getName())) {
                list = new AccountDaybookDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(AccountDictionaries.class.getName())) {
                list = new AccountDictionariesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.equals(AccountLiabilities.class.getName())) {
                list = new AccountLiabilitiesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(AccountOwnerEquity.class.getName())) {
                list = new AccountOwnerEquityDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(AccountProfitLoss.class.getName())) {
                list = new AccountProfitLossDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(Contracts.class.getName())) {
                list = new ContractsDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ContractsExecute.class.getName())) {
                list = new ContractsExecuteDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.equals(ContractsExecuteList.class.getName())) {
                list = new ContractsExecuteListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ContractsExpenses.class.getName())) {
                list = new ContractsExpensesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ContractsList.class.getName())) {
                list = new ContractsListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ContractsState.class.getName())) {
                list = new ContractsStateDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaContractResourceList.class.getName())) {
                list = new ReaContractResourceListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.equals(ReaContracts.class.getName())) {
                list = new ReaContractsDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaCustomer.class.getName())) {
                list = new ReaCustomerDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaEmployee.class.getName())) {
                list = new ReaEmployeeDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaEnterpriseData.class.getName())) {
                list = new ReaEnterpriseDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaEnterpriseDictionary.class.getName())) {
                list = new ReaEnterpriseDictionaryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.equals(ReaEnterpriseOrganization.class.getName())) {
                list = new ReaEnterpriseOrganizationDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaEvent.class.getName())) {
                list = new ReaEventDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaEventAgentDictionary.class.getName())) {
                list = new ReaEventAgentDictionaryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaEventContractDictionary.class.getName())) {
                list = new ReaEventContractDictionaryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaExpenses.class.getName())) {
                list = new ReaExpensesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.equals(ReaProject.class.getName())) {
                list = new ReaProjectDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaResource.class.getName())) {
                list = new ReaResourceDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaResourceAdjustPrice.class.getName())) {
                list = new ReaResourceAdjustPriceDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaResourceEventDictionary.class.getName())) {
                list = new ReaResourceEventDictionaryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(ReaResourceGroup.class.getName())) {
                list = new ReaResourceGroupDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.equals(ReaResourceType.class.getName())) {
                list = new ReaResourceTypeDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(Stock.class.getName())) {
                list = new StockDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(StockAccount.class.getName())) {
                list = new StockAccountDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(StockCheck.class.getName())) {
                list = new StockCheckDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(StockCheckList.class.getName())) {
                list = new StockCheckListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.equals(StockData.class.getName())) {
                list = new StockDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(StockInventory.class.getName())) {
                list = new StockInventoryDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(StockInventoryList.class.getName())) {
                list = new StockInventoryListDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(SysUserReceiveData.class.getName())) {
                list = new SysUserReceiveDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(SystemAdressDictionaries.class.getName())) {
                list = new SystemAdressDictionariesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.equals(SystemData.class.getName())) {
                list = new SystemDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(SystemDictionaries.class.getName())) {
                list = new SystemDictionariesDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(SystemEnterprise.class.getName())) {
                list = new SystemEnterpriseDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(SystemImage.class.getName())) {
                list = new SystemImageDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(AccountAlarm.class.getName())) {
                list = new AccountCostDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());

            } else if (outputType.equals(SystemLogData.class.getName())) {
                list = new SystemLogDataDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(SystemUser.class.getName())) {
                list = new SystemUserDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(SystemUserCertificate.class.getName())) {
                list = new SystemUserCertificateDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(SystemUserLog.class.getName())) {
                list = new SystemUserLogDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            } else if (outputType.equals(SystemUserProperty.class.getName())) {
                list = new SystemUserPropertyDao().getList(inputParam.getQuerySql(), inputParam.getQueryParam());
            }

            outputResult.setResultList(list);
            // todo: 获取查询数据长度
            outputResult.setTotal(100);
        } catch (Exception ex) {
            Logger.getLogger(DataService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return outputResult;
    }

}