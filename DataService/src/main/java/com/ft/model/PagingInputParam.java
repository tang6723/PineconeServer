/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.model;

/*
 * @author Ming
 */
public class PagingInputParam {
    
    /*
     * 当前页引索
     */
    private int pageIndex;
    
    /*
     * 当前请求数据条数
     */
    private int pageSize;
    
    /*
     * 查询参数
     */
    private String[] queryParam;
    
    /*
     * 查询条件
     */
    private String querySQL;
    
    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String[]getQueryParam(){
        return this.queryParam;
    }
 
    public void setQueryParam(String[]queryTable){
        this.queryParam = queryTable;
    }
    
    public String getQuerySql() {
        return querySQL;
    }

    public void setQuerySql(String querySQL) {
        this.querySQL = querySQL;
    }
}