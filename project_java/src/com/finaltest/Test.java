package com.finaltest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

abstract class A {
    abstract void m1();
    public void m2() {
        System.out.println("A类中定义的m2方法");
    }
}
class B extends A {
    void m1() {
        System.out.println("B类中定义的m1方法");
    }
}
public class Test {
//    public static void main(String args[]) {
//        A a = new B();
//        a.m1();
//        a.m2();
//    }

    public static List duplicateList(List list) {
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));
        List list2 = duplicateList(list);
        for (Object integer : list2) {
            System.out.println(integer);
        } }
}
//B类中定义的m1方法
//A类中定义的m2方法

//1
//2
//4