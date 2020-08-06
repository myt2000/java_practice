package com.oopTest;
/*
* 总结：属性赋值的先后顺序
*
* 1.默认初始化
* 2.显示初始化
* 3.构造器中赋值
* 4.通过“对象.方法”或“对象.属性”的方式，赋值
*
*
* */
public class UserTest {
    public static void main(String[] args){
        User u = new User(8);
        System.out.println(u.age);
        u.setAge(10);
    }


}


class User{
    String name;
    int age = 1;

    public User(int a){
        age = a;
    }

    public void setAge(int age){
        System.out.println("Age:"+ age);
    }
}
