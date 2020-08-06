/*
 * Copyright (c) 2020. Author:brooks   email:myt2000@126.com
 */

package com.practice.java;

public class KidsTest {
    public static void main(String[] args){
        Kids someKid = new Kids(12);

        someKid.printAge();

//        someKid.setYearsOld(15);
        someKid.printAge();

        someKid.setSalary(0);
        someKid.getSalary();
    }
}
