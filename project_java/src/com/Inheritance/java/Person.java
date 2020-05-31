/*
 * Copyright (c) 2020. Author:brooks   email:myt2000@126.com
 */

package com.Inheritance.java;

public class Person extends Creature{
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
        sleep();
        System.out.println("****************");
        walk(10);
        show();
    }

    private void sleep(){
        System.out.println("睡觉");
    }

    private void walk(int distance){
        System.out.println("走路走了多远" + distance);
    }

    public void show(){
        System.out.println("人类是个傻逼动物");
    }
}
