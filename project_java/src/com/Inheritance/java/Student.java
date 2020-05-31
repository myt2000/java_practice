/*
 * Copyright (c) 2020. Author:brooks   email:myt2000@126.com
 */

package com.Inheritance.java;

public class Student extends Person{
//    String name;
//    int age;
    String major;

    public Student() {

    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

//    public void eat(){
//        System.out.println("吃饭");
//    }

//    public void sleep(){
//        System.out.println("睡觉");
//    }

//    public void study(){
//        System.out.println("学习");
//    }

    public void show(){
        System.out.println("name:"+ name + "age:" + age);
    }

    public void study(){
        System.out.println("专业是"+ major);
    }

    public void eat(){
        System.out.println("学生应该多吃肉和蔬菜");
    }

    public void sleep(){
        System.out.println("学生应该多睡觉");
    }


    public void walk(int distance){
        System.out.println("学生应该多跑步"+distance);
    }
}
