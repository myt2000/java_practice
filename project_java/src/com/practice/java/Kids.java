/*
 * Copyright (c) 2020. Author:brooks   email:myt2000@126.com
 */

package com.practice.java;

public class Kids extends Mainkind{
    private int yearsOld;

    public void printAge(){
        System.out.println("I am" + yearsOld + "years old");
    }

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
