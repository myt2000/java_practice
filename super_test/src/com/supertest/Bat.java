package com.supertest;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Bat{
     final double Pi=3.14;          //在定义时便给址值
    final int i;            //因为要在构造函数中进行初始化，所以此处便不可再给值
    final List list;        //此变量也与上面的一样
    Bat(){
        i=100;
        list=new LinkedList();
    }
    Bat(int ii,List l){
        i=ii;
        list=l;
    }
    public static void main(String[] args){
        Bat b=new Bat();
        b.list.add(new Bat());
        //b.i=25;
        //b.list=new ArrayList();
        System.out.println("I="+b.i+" List Type:"+b.list.getClass());
        b=new Bat(23,new ArrayList());
        b.list.add(new Bat());
        System.out.println("I="+b.i+" List Type:"+b.list.getClass());
        //        b.i = 0;  直接报错，无法修改
    }
}
/*
I=100 List Type:class java.util.LinkedList
I=23 List Type:class java.util.ArrayList
*/