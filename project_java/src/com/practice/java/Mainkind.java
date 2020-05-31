/*
 * Copyright (c) 2020. Author:brooks   email:myt2000@126.com
 */

package com.practice.java;

public class Mainkind {
    private int sex;//性别
    private int salary;//薪资

    public void manOrWoman(){
        if(sex == 1){
            System.out.println("man");
        }else if(sex == 0){
            System.out.println("woman");
        }
    }


    public Mainkind() {
    }

    public Mainkind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void employeed(){
        String jobInfo = (salary == 0)? "no job" : "job";
        System.out.println(jobInfo);
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
