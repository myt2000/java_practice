/*
 * Copyright (c) 2020. Author:brooks   email:myt2000@126.com
 */

package com.atguiya.java3;

public class Person {
    String name;
    int age;
    int id = 1001;//身份证号

    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人，吃饭");
    }

    public void wald(){
        System.out.println("人，走路");
    }
}
