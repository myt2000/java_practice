/*
 * Copyright (c) 2020. Author:brooks   email:myt2000@126.com
 */

package com.project.p2.customerlist;

import com.project.p2.customer.Customer;

public class CustomerList {
    private Customer[] customers;  //用来保存客户对象的数组
    private int total = 0;   //记录以保存客户对象的数量


    /**
     * 用来初始化customer数组的构造器
     * @param totalCustomer: 指定数组的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * @Description 将指定的客户添加到数组中
     * @param customer
     * @return true:添加成功 false:添加失败
     */
    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }

    /**
     * @Description 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return true:修改成功  false:修改失败
     */
    public boolean replaceCustomer(int index, Customer cust){
        if (index <0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    public boolean deleteCustomer(int index){
        if (index <0 || index >= total){
            return false;
        }
        for (int i = index; i < total - 1 ; i++) {
            customers[i] = customers[i+1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * 获取所有客户信息
     * @return
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return 如果找到了元素，则返回，没有，返回null
     */
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    public int getTotal(){
        return total;
    }
}
