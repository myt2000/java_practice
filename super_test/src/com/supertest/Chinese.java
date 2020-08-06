package com.supertest;


class Person{
    public static void prt(String s){
        System.out.println(s);
    }
    Person(){
        prt("A Person.");
    }
    Person(String name){
        prt("A person name is:"+name);
    }
}
public class Chinese extends Person{
    Chinese(){
        super();  //调用父类构造函数（1）
        prt("A chinese.");//(4)
    }
    Chinese(String name){
        super(name);//调用父类具有相同形参的构造函数（2）
        prt("his name is:"+name);
    }
    Chinese(String name,int age){
        this(name);//调用当前具有相同形参的构造函数（3）
        prt("his age is:"+age);
    }
    public static void main(String[] args){
        Chinese cn=new Chinese();
        cn=new Chinese("kevin");
//        cn=new Chinese("kevin",22);
    }
}
/*
A Person.
A chinese.
A person name is:kevin
his name is:kevin
A person name is:kevin
his name is:kevin
his age is:22
* */