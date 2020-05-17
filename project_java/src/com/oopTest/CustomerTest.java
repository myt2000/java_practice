package com.oopTest;


import java.lang.reflect.Array;

/*
* 类中方法的声明和使用
*
* 方法：描述类应该具有的功能。
* 比如：Math类：sqrt()\random()\ ...
*       Scanner类：nextXxx() ...
*       Arrays类：sort() \ binarySearch() \ toString() \ equals() \ ...
*
* 1. 举例：
*   public void eat(){}
*
* 2. 方法的声明：权限修饰符 返回值类型  方法名（形参列表）{
*               方法体
* }
* static、final、abstract 来修饰的方法，后面再讲
*
* 3. 说明
*       3.1 关于权限修饰符：
*           private public 缺省 protected   ---封装性细说
*       3.2 返回值类型，有返回值  无返回值
*           有返回值，声明出返回值的类型。与方法体中“return 返回值”搭配使用
*           没有返回值，用void来表示，通常没有返回值的方法中，就不需要return。
*                  但是，如果使用的话，只能“return;”表示结束此方法
*
*
*       3.3 方法名：属于标识符，遵循标识符的规则和规范
*       3.4 形参列表：方法可以声明0个，1个，或多个形参
*           格式：数据类型1 形参1，数据类型2  形参2，...
*
*       return 关键字的使用：
*           1.使用范围：使用在方法体中
*           2.作用：1.结束方法
*                   2.返回值
*
* */
public class CustomerTest {
    public static void main(String[] args){
        Customer cust1 = new Customer();
        cust1.eat();
        int[] arr = new int[]{1,2,432,65,23};
    }

}

class Customer{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国籍是：" + nation;
        return info;
    }
}
