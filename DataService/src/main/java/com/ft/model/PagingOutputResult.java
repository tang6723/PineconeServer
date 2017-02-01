/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ft.model;

import java.util.List;

/*
 * @author Ming
 */
public class PagingOutputResult <T>{

    /*
     * 当前查询条件一共有多少条数据
     */
    private int _totalCount;
    
    /*
     * 查询结果列表
     */
    private List<T> _resultList;

    public List<T> getResultList() {
        return _resultList;
    }

    public void setResultList(List<T> resultlist) {
        this._resultList = resultlist;
    }

    public int getTotal() {
        return _totalCount;
    }

    public void setTotal(int totalCount) {
        this._totalCount = totalCount;
    }
}
