package com.oopTest;

/*
* 关于变量的赋值：
*
*   如果变量是基本数据类型，此时赋值的是变量所保存的数据值
*   如果变量是引用数据类型，此时复制的是变量所保存的数据的地址值
* */

public class ValueTransferTest {
    public static void main(String[] args){
        int m = 10;
        int n = m;
        System.out.println("***********基本数据类型：***************");
        System.out.println("m =" + m +", n = "+n);

        n = 20;

        System.out.println("m =" + m +", n = "+n);

        System.out.println("************引用数据类型：**************");

        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;
        System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId =" + o2.orderId);

        o2.orderId = 1002;
        System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId =" + o2.orderId);
/**
 * ***********基本数据类型：***************
 * m =10, n = 10
 * m =10, n = 20
 * ************引用数据类型：**************
 * o1.orderId = 1001, o2.orderId =1001
 * o1.orderId = 1002, o2.orderId =1002
 */

    }

}

class Order{
    int orderId;
}
