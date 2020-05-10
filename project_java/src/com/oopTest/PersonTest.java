package com.oopTest;
/*
* 属性 = 成员变量 = field = 域、字段
* 方法 = 成员变量 = 函数 = method
*
* 创建类的对象 = 实例化的对象 = 实例化类
* */



public class PersonTest {
    public static void main(String[] args){
        //创建Person类的对象
        Person p1 = new Person();
        //调用对象的结构、属性、方法
        //调用属性：“对象、属性”
        p1.name = "Jack";
        p1.isMale = false;
        System.out.println(p1.name);
        // 调用方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        Person p2 = new Person();
        p2.name = "Henry";
        System.out.println(p1.name);

        Person p3 = p1;
        p3.age = 10;
        System.out.println("年龄"+p1.age);

    }

}

class Person{
    String name;
    int age =1;
    boolean isMale;

    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用的是：" + language);
    }
}
