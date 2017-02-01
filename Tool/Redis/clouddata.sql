/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/1/11 22:44:18                           */
/*==============================================================*/


drop table if exists AddressBook;

drop table if exists Advertisement;

drop table if exists AdvertisingEffects;

drop table if exists AdvertisingSpace;

drop table if exists BrowseItems;

drop table if exists Car;

drop table if exists CashAccount;

drop table if exists Coupon;

drop table if exists DeferredProfitsAccount;

drop table if exists Delivery;

drop table if exists Deliveryman;

drop table if exists Goods;

drop table if exists GoodsAdjustment;

drop table if exists GoodsComment;

drop table if exists GoodsImage;

drop table if exists GoodsItems;

drop table if exists GoodsRole;

drop table if exists MembersInformation;

drop table if exists MembersLevel;

drop table if exists MembersPayments;

drop table if exists Merchant;

drop table if exists MerchantFee;

drop table if exists MerchantRole;

drop table if exists MerchantScore;

drop table if exists MerchantType;

drop table if exists OperatingRevenueAccount;

drop table if exists OrderState;

drop table if exists Orders;

drop table if exists OrdersItems;

drop table if exists PayableAccount;

drop table if exists Region;

drop table if exists RunningAccount;

drop table if exists RunningRecord;

drop table if exists TaxesPayableAccount;

/*==============================================================*/
/* Table: AddressBook                                           */
/*==============================================================*/
create table AddressBook
(
   AddressBookID        national varchar(100) not null,
   MembersID            national varchar(100),
   Contacts             national varchar(100),
   ContactsAddress      national varchar(100),
   ContactsPhone        national varchar(100),

   IsDefaultAddress     national varchar(100),
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (AddressBookID)
);

/*==============================================================*/
/* Table: Advertisement                                         */
/*==============================================================*/
create table Advertisement
(
   AdvertisementID      national varchar(100) not null,
   AdvertisingSpaceID   national varchar(100),
   SerialNo             int,
   AdvertisingImage     national varchar(200),
   AdvertisingTitle     national varchar(100),

   AdvertisingDesc      national varchar(500),
   BeginTime            datetime,
   EndTime              datetime,
   Location             national varchar(100),
   PagesURL             national varchar(100),

   MerchantID           national varchar(100),
   Merchant             national varchar(100),
   AdsPrice             decimal,
   Sector               national varchar(100),
   SectorType           national varchar(100),

   AdsSection           national varchar(100),
   AdsUrl               national varchar(100),
   IssueTime            datetime,
   Editor               national varchar(100),
   AuditorID            national varchar(100),

   Auditor              national varchar(100),
   AuditTime            datetime,
   ShowTime             datetime,
   IsShow               national varchar(100),
   ShowState            national varchar(100),

   FeeTime              datetime,
   FeeCode              national varchar(100),
   FeeSum               decimal,
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),

   Remarks              national varchar(500),
   primary key (AdvertisementID)
);

/*==============================================================*/
/* Table: AdvertisingEffects                                    */
/*==============================================================*/
create table AdvertisingEffects
(
   AdvertisingEffectsID national varchar(100) not null,
   AdvertisementID      national varchar(100),
   AdvertisingSpaceID   national varchar(100),
   ShowTimes            int,
   ClickTimes           int,

   BrowseTimes          int,
   AdsPrice             decimal,
   BeginTime            date,
   EndTime              date,
   AdsDuration          float,

   Sector               national varchar(100),
   SectorType           national varchar(100),
   AdsSection           national varchar(100),
   AdsUrl               national varchar(200),
   EnableFlag           national varchar(100),

   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (AdvertisingEffectsID)
);

/*==============================================================*/
/* Table: AdvertisingSpace                                      */
/*==============================================================*/
create table AdvertisingSpace
(
   AdvertisingSpaceID   national varchar(100) not null,
   SerialNo             int,
   AdvertisingImage     national varchar(200),
   AdvertisingTitle     national varchar(100),
   AdvertisingDesc      national varchar(500),

   BeginTime            datetime,
   EndTime              datetime,
   Location             national varchar(100),
   PagesURL             national varchar(100),
   MerchantID           national varchar(100),

   Merchant             national varchar(100),
   AdsPrice             decimal,
   Sector               national varchar(100),
   SectorType           national varchar(100),
   AdsSection           national varchar(100),

   AdsUrl               national varchar(100),
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (AdvertisingSpaceID)
);

/*==============================================================*/
/* Table: BrowseItems                                           */
/*==============================================================*/
create table BrowseItems
(
   BrowseItemsID        national varchar(100) not null,
   MerchantID           national varchar(100),
   Merchant             national varchar(200),
   MembersID            national varchar(100),
   MembersName          national varchar(100),

   BrowseTime           datetime,
   GoodsID              national varchar(100),
   GoodsType            national varchar(200),
   GoodsName            national varchar(200),
   GoodsUnits           national varchar(100),

   GroupPrice           decimal,
   RetailPrice          decimal,
   MembersPrice         decimal,
   TransactionPrice     decimal,
   GoodsDesc            national varchar(500),

   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (BrowseItemsID)
);

/*==============================================================*/
/* Table: Car                                                   */
/*==============================================================*/
create table Car
(
   CarID                national varchar(100) not null,
   MerchantID           national varchar(100),
   Merchant             national varchar(100),
   MembersID            national varchar(100),
   Members              national varchar(100),

   GoodsID              national varchar(100),
   GoodsType            national varchar(100),
   GoodsName            national varchar(100),
   GoodsUnit            national varchar(100),
   GroupPrice           decimal,

   RetailPrice          decimal,
   BenefitPrice         decimal,
   GoodsDesc            national varchar(500),
   OrderQty             decimal,
   PayPrice             decimal,

   ItemsTotal           decimal,
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (CarID)
);

/*==============================================================*/
/* Table: CashAccount                                           */
/*==============================================================*/
create table CashAccount
(
   CashAccountID        national varchar(100) not null,
   BusinessTime         datetime,
   RelevantID           national varchar(100),
   RelevantDesc         national varchar(500),
   MembersID            national varchar(100),

   MerchantID           national varchar(100),
   AgentID              national varchar(100),
   AccountCode          national varchar(100),
   TopSubjects          national varchar(100),
   TwoSubjects          national varchar(100),

   RecordTime           datetime,
   DebitCreditor        national varchar(100),
   Amount               decimal,
   Summary              national varchar(500),
   AuditTime            datetime,

   AuditorID            national varchar(100),
   Auditor              national varchar(100),
   Assessment           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (CashAccountID)
);

/*==============================================================*/
/* Table: Coupon                                                */
/*==============================================================*/
create table Coupon
(
   CouponID             national varchar(100) not null,
   CouponType           national varchar(100),
   CouponCode           national varchar(100),
   CouponTotal          decimal,
   IssueTime            datetime,

   IssueDesc            national varchar(100),
   AuditTime            datetime,
   AuditorID            national varchar(100),
   Auditor              national varchar(100),
   Assessment           national varchar(100),

   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (CouponID)
);

/*==============================================================*/
/* Table: DeferredProfitsAccount                                */
/*==============================================================*/
create table DeferredProfitsAccount
(
   DeferredProfitsAccountID national varchar(100) not null,
   BusinessTime         datetime,
   RelevantID           national varchar(100),
   RelevantDesc         national varchar(500),
   MembersID            national varchar(100),

   MerchantID           national varchar(100),
   AgentID              national varchar(100),
   AccountCode          national varchar(100),
   TopSubjects          national varchar(100),
   TwoSubjects          national varchar(100),

   RecordTime           datetime,
   DebitCreditor        national varchar(100),
   Amount               decimal,
   Summary              national varchar(500),
   AuditTime            datetime,

   AuditorID            national varchar(100),
   Auditor              national varchar(100),
   Assessment           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (DeferredProfitsAccountID)
);

/*==============================================================*/
/* Table: Delivery                                              */
/*==============================================================*/
create table Delivery
(
   DeliveryID           national varchar(100) not null,
   Delivery             national varchar(100),
   DeliveryAddress      national varchar(100),
   Contacts             national varchar(100),
   ContactsPhone        national varchar(100),

   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (DeliveryID)
);

/*==============================================================*/
/* Table: Deliveryman                                           */
/*==============================================================*/
create table Deliveryman
(
   DeliverymanID        national varchar(100) not null,
   DeliveryID           national varchar(100),
   Delivery             national varchar(100),
   DeliverymanCode      national varchar(100),
   DeliverymanName      national varchar(100),

   DeliverymanPhone     national varchar(100),
   DeliverymanImage     national varchar(100),
   JobTime              datetime,
   Mileage              national varchar(100),
   DeliverySum          national varchar(100),

   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (DeliverymanID)
);

/*==============================================================*/
/* Table: Goods                                                 */
/*==============================================================*/
create table Goods
(
   GoodsID              national varchar(100) not null,
   MerchantID           national varchar(100),
   GoodsName            national varchar(100),
   GoodsUnit            national varchar(100),
   GoodsDesc            national varchar(500),

   SalesArea            national varchar(100),
   GoodsType            national varchar(100),
   PromotionType        national varchar(100),
   GroupPrice           decimal,
   RetailPrice          decimal,

   BenefitPrice         decimal,
   SoldQty              int,
   Racking              national varchar(100),
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),

   Remarks              national varchar(500),
   primary key (GoodsID)
);

/*==============================================================*/
/* Table: GoodsAdjustment                                       */
/*==============================================================*/
create table GoodsAdjustment
(
   GoodsAdjustmentID    national varchar(100) not null,
   GoodsID              national varchar(100),
   GroupPrice           decimal,
   RetailPrice          decimal,
   BenefitPrice         decimal,

   FormerGroupPrice     decimal,
   FormerRetailPrice    decimal,
   FormerBenefitPrice   decimal,
   AdjustmentTime       datetime,
   EffectiveTime        datetime,

   OperatorsID          national varchar(100),
   Operators            national varchar(100),
   AdjustmentType       national varchar(100),
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),

   Remarks              national varchar(500),
   primary key (GoodsAdjustmentID)
);

/*==============================================================*/
/* Table: GoodsComment                                          */
/*==============================================================*/
create table GoodsComment
(
   GoodsCommentID       national varchar(100) not null,
   GoodsID              national varchar(100),
   IsTop                national varchar(100),
   GoodsScore           decimal,
   CommentsDesc         national varchar(500),

   OperatorsID          national varchar(100),
   Operators            national varchar(100),
   OperatorsImage       national varchar(100),
   IssueTime            datetime,
   AuditTime            datetime,

   AuditorID            national varchar(100),
   Auditor              national varchar(100),
   Assessment           national varchar(100),
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),

   Remarks              national varchar(500),
   primary key (GoodsCommentID)
);

/*==============================================================*/
/* Table: GoodsImage                                            */
/*==============================================================*/
create table GoodsImage
(
   GoodsImageID         national varchar(100) not null,
   MerchantGoodsID      national varchar(100),
   ImageType            national varchar(100),
   SerialNo             int,
   GoodsUrl             national varchar(200),

   GoodsImage           longblob,
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (GoodsImageID)
);

/*==============================================================*/
/* Table: GoodsItems                                            */
/*==============================================================*/
create table GoodsItems
(
   GoodsItemsID         national varchar(100) not null,
   GoodsID              national varchar(100),
   GoodsName            national varchar(100),
   GoodsUnit            national varchar(100),
   GoodsDesc            national varchar(500),

   SalesArea            national varchar(100),
   GoodsType            national varchar(100),
   PromotionType        national varchar(100),
   GroupPrice           decimal,
   RetailPrice          decimal,

   BenefitPrice         decimal,
   SoldQty              int,
   Racking              national varchar(100),
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),

   Remarks              national varchar(500),
   primary key (GoodsItemsID)
);

/*==============================================================*/
/* Table: GoodsRole                                             */
/*==============================================================*/
create table GoodsRole
(
   GoodsRoleID          national varchar(100) not null,
   GoodsID              national varchar(100),
   SerialNo             int,
   RoleCode             national varchar(100),
   RoleDesc             national varchar(500),

   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (GoodsRoleID)
);

/*==============================================================*/
/* Table: MembersInformation                                    */
/*==============================================================*/
create table MembersInformation
(
   MembersID            national varchar(100) not null,
   MembersCode          national varchar(100),
   MembersName          national varchar(100),
   IDCard               national varchar(100),
   Phone                national varchar(100),

   Password             national varchar(100),
   MembersImage         national varchar(100),
   Nickname             national varchar(100),
   Birthdays            datetime,
   MembersAddress       national varchar(100),

   CreateTime           datetime,
   AuthenticationTime   datetime,
   LogTime              datetime,
   PasswordTime         datetime,
   EnableFlag           national varchar(100),

   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (MembersID)
);

/*==============================================================*/
/* Table: MembersLevel                                          */
/*==============================================================*/
create table MembersLevel
(
   MembersLevelID       national varchar(100) not null,
   LevelCode            national varchar(100),
   MembersLevel         int,
   MembersID            national varchar(100),
   MembersType          national varchar(100),

   MembersName          national varchar(100),
   Contacts             national varchar(100),
   ContactsPhone        national varchar(100),
   TopLevelID           national varchar(100),
   TopMembersID         national varchar(100),

   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (MembersLevelID)
);

/*==============================================================*/
/* Table: MembersPayments                                       */
/*==============================================================*/
create table MembersPayments
(
   MembersPaymentsID    national varchar(100) not null,
   MembersID            national varchar(100),
   PayTime              datetime,
   PayTotal             decimal,
   GoldCoin             decimal,

   BankCard             national varchar(100),
   BankName             national varchar(100),
   BankAccount          national varchar(100),
   TradeCode            national varchar(100),
   TradeTime            datetime,

   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (MembersPaymentsID)
);

/*==============================================================*/
/* Table: Merchant                                              */
/*==============================================================*/
create table Merchant
(
   MerchantID           national varchar(100) not null,
   SerialNo             int,
   Province             national varchar(100),
   City                 national varchar(100),
   County               national varchar(100),

   Street               national varchar(100),
   Merchant             national varchar(100),
   MerchantAddress      national varchar(100),
   MerchantPhone        national varchar(100),
   GIS                  national varchar(100),

   ExpirationDate       datetime,
   UsingTime            datetime,
   UsingRole            national varchar(500),
   AgentID              national varchar(100),
   AgentName            national varchar(100),

   RunningID            national varchar(100),
   RunningName          national varchar(100),
   DeliveryID           national varchar(100),
   DeliveryName         national varchar(100),
   EnableFlag           national varchar(100),

   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (MerchantID)
);

/*==============================================================*/
/* Table: MerchantFee                                           */
/*==============================================================*/
create table MerchantFee
(
   MerchantFeeID        national varchar(100) not null,
   MerchantID           national varchar(100),
   Merchant             national varchar(100),
   FeeType              national varchar(100),
   FeeTotal             decimal,

   FeeDesc              national varchar(500),
   BeginTime            datetime,
   EndTime              datetime,
   FeeTime              datetime,
   MerchantContact      national varchar(100),

   Manager              national varchar(100),
   ManagerPhone         national varchar(100),
   AuditTime            datetime,
   AuditorID            national varchar(100),
   Auditor              national varchar(100),

   Assessment           national varchar(100),
   DeleteReason         national varchar(500),
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (MerchantFeeID)
);

/*==============================================================*/
/* Table: MerchantRole                                          */
/*==============================================================*/
create table MerchantRole
(
   MerchantRoleID       national varchar(100) not null,
   MerchantID           national varchar(100),
   SerialNo             int,
   RoleCode             national varchar(100),
   RoleDesc             national varchar(500),

   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (MerchantRoleID)
);

/*==============================================================*/
/* Table: MerchantScore                                         */
/*==============================================================*/
create table MerchantScore
(
   MerchantScoreID      national varchar(100) not null,
   MembersID            national varchar(100),
   Merchant             national varchar(100),
   TradeTotal           decimal,
   TradeDesc            national varchar(500),

   TradeType            national varchar(100),
   TradeTime            datetime,
   ResourceID           national varchar(100),
   EventID              national varchar(100),
   ContractID           national varchar(100),

   BusinessTime         datetime,
   RecordTime           datetime,
   AuditTime            datetime,
   AuditorID            national varchar(100),
   Auditor              national varchar(100),

   Assessment           national varchar(100),
   AuditorRemarks       national varchar(500),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (MerchantScoreID)
);

/*==============================================================*/
/* Table: MerchantType                                          */
/*==============================================================*/
create table MerchantType
(
   MerchantTypeID       national varchar(100) not null,
   SerialNo             int,
   Sector               national varchar(100),
   SectorType           national varchar(100),
   EnableFlag           national varchar(100),

   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (MerchantTypeID)
);

/*==============================================================*/
/* Table: OperatingRevenueAccount                               */
/*==============================================================*/
create table OperatingRevenueAccount
(
   OperatingRevenueAccountID national varchar(100) not null,
   BusinessTime         datetime,
   RelevantID           national varchar(100),
   RelevantDesc         national varchar(500),
   MembersID            national varchar(100),

   MerchantID           national varchar(100),
   AgentID              national varchar(100),
   AccountCode          national varchar(100),
   TopSubjects          national varchar(100),
   TwoSubjects          national varchar(100),

   RecordTime           datetime,
   DebitCreditor        national varchar(100),
   Amount               decimal,
   Summary              national varchar(500),
   AuditTime            datetime,

   AuditorID            national varchar(100),
   Auditor              national varchar(100),
   Assessment           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (OperatingRevenueAccountID)
);

/*==============================================================*/
/* Table: OrderState                                            */
/*==============================================================*/
create table OrderState
(
   OrderStateID         national varchar(100) not null,
   OrdersID             national varchar(100),
   ExecuteTim           datetime,
   ExecutiveID          national varchar(100),
   Executive            national varchar(100),

   ExecuteType          national varchar(100),
   ExecuteDesc          national varchar(500),
   ExecuteResult        national varchar(500),
   AuditTime            datetime,
   AuditorID            national varchar(100),

   Auditor              national varchar(100),
   Assessment           national varchar(100),
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (OrderStateID)
);

/*==============================================================*/
/* Table: Orders                                                */
/*==============================================================*/
create table Orders
(
   OrdersID             national varchar(100) not null,
   OrdersCode           national varchar(100),
   MerchantID           national varchar(100),
   Merchant             national varchar(100),
   MembersID            national varchar(100),

   Contacts             national varchar(100),
   ContactsPhone        national varchar(100),
   ContactsAddress      national varchar(100),
   PayType              national varchar(100),
   TotalPrice           decimal,

   TakeOut              national varchar(100),
   PayTotal             decimal,
   CouponID             national varchar(100),
   CouponTotal          decimal,
   ShippingCost         decimal,

   CashBack             decimal,
   OrderCoupon          decimal,
   OrdersState          national varchar(100),
   TradeTime            datetime,
   BusinessTime         datetime,

   RecordTime           datetime,
   AuditTime            datetime,
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (OrdersID)
  
);

/*==============================================================*/
/* Table: OrdersItems                                           */
/*==============================================================*/
create table OrdersItems
(
   OrdersItemsID        national varchar(100) not null,
   OrdersID             national varchar(100),
   OrdersCode           national varchar(100),
   MerchantID           national varchar(100),
   Merchant             national varchar(100),

   MembersID            national varchar(100),
   Members              national varchar(100),
   GoodsID              national varchar(100),
   OrdersType           national varchar(100),
   GoodsName            national varchar(100),

   GoodsUnit            national varchar(100),
   GroupPrice           decimal,
   RetailPrice          decimal,
   BenefitPrice         decimal,
   GoodsDesc            national varchar(500),

   OrderQty             decimal,
   PayPrice             decimal,
   ItemsTotal           decimal,
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),

   Remarks              national varchar(500),
   primary key (OrdersItemsID)
);

/*==============================================================*/
/* Table: PayableAccount                                        */
/*==============================================================*/
create table PayableAccount
(
   PayableAccountID     national varchar(100) not null,
   BusinessTime         datetime,
   RelevantID           national varchar(100),
   RelevantDesc         national varchar(500),
   MembersID            national varchar(100),

   MerchantID           national varchar(100),
   AgentID              national varchar(100),
   AccountCode          national varchar(100),
   TopSubjects          national varchar(100),
   TwoSubjects          national varchar(100),

   RecordTime           datetime,
   DebitCreditor        national varchar(100),
   Amount               decimal,
   Summary              national varchar(500),
   AuditTime            datetime,

   AuditorID            national varchar(100),
   Auditor              national varchar(100),
   Assessment           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (PayableAccountID)
);

/*==============================================================*/
/* Table: Region                                                */
/*==============================================================*/
create table Region
(
   RegionID             national varchar(100) not null,
   SerialNo             int,
   Province             national varchar(100),
   City                 national varchar(100),
   County               national varchar(100),

   Street               national varchar(100),
   ZipCode              national varchar(100),
   EnableFlag           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (RegionID)
);

/*==============================================================*/
/* Table: RunningAccount                                        */
/*==============================================================*/
create table RunningAccount
(
   RunningAccountID     national varchar(100) not null,
   BusinessTime         datetime,
   RelevantID           national varchar(100),
   RelevantDesc         national varchar(500),
   MembersID            national varchar(100),

   MerchantID           national varchar(100),
   AgentID              national varchar(100),
   AccountCode          national varchar(100),
   TopSubjects          national varchar(100),
   TwoSubjects          national varchar(100),

   RecordTime           datetime,
   DebitCreditor        national varchar(100),
   Amount               decimal,
   Summary              national varchar(500),
   AuditTime            datetime,

   AuditorID            national varchar(100),
   Auditor              national varchar(100),
   Assessment           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (RunningAccountID)
);

/*==============================================================*/
/* Table: RunningRecord                                         */
/*==============================================================*/
create table RunningRecord
(
   RunningRecordID      national varchar(100) not null,
   MembersID            national varchar(100),
   MembersType          national varchar(100),
   MembersName          national varchar(100),
   TradeTotal           decimal,

   TradeDesc            national varchar(500),
   TradeType            national varchar(100),
   TradeTime            datetime,
   ResourceID           national varchar(100),
   EventID              national varchar(100),

   ContractID           national varchar(100),
   BusinessTime         datetime,
   RecordTime           datetime,
   AuditTime            datetime,
   AuditorID            national varchar(100),

   Auditor              national varchar(100),
   Assessment           national varchar(100),
   AuditorRemarks       national varchar(500),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (RunningRecordID)
);

/*==============================================================*/
/* Table: TaxesPayableAccount                                   */
/*==============================================================*/
create table TaxesPayableAccount
(
   TaxesPayableAccountID national varchar(100) not null,
   BusinessTime         datetime,
   RelevantID           national varchar(100),
   RelevantDesc         national varchar(500),
   MembersID            national varchar(100),

   MerchantID           national varchar(100),
   AgentID              national varchar(100),
   AccountCode          national varchar(100),
   TopSubjects          national varchar(100),
   TwoSubjects          national varchar(100),

   RecordTime           datetime,
   DebitCreditor        national varchar(100),
   Amount               decimal,
   Summary              national varchar(500),
   AuditTime            datetime,

   AuditorID            national varchar(100),
   Auditor              national varchar(100),
   Assessment           national varchar(100),
   DeleteFlag           national varchar(100),
   Remarks              national varchar(500),
   primary key (TaxesPayableAccountID)
);

