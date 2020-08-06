/*
 * Copyright (c) 2020. Author:brooks   email:myt2000@126.com
 */

package com.atguiya.javaaccount;

public class AccountTest {
    public static void main(String[] args){
        Account acct = new Account(1122, 20000, 0.045);

        acct.withdraw(30000);
        System.out.println("您的账户余额为："+ acct.getBalance());

        acct.withdraw(2500);
        System.out.println("您的账户余额为："+ acct.getBalance());

        acct.deposit(3000);
        System.out.println("您的账户余额为："+ acct.getBalance());

        System.out.println("月利率为："+ (acct.getMonthlyInterest()*100) + "%");
    }
}
