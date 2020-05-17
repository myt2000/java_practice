package com.oopTest;

/*
* 1. 形参：方法定义时，声明的小括号内的参数
*    实参：方法调用时，实际传递给形参的数据
*
* 2. 值传递的机制
*   如果参数是基本数据类型，此时参数赋给形参的是实参真实数据的存储值
*   如果参数是引用数据类型，此时实参赋给形参的是实参存储数据的地址值
* */

public class ValueTransferargsTest {
    public static void main(String[] args){
        int m = 10;
        int n = 20;
        System.out.println("m =" + m +", n = "+n);
        //m =10, n = 20


//        int temp = m;
//        m = n;
//        n = temp;
//        System.out.println("m =" + m +", n = "+n);
        //m =20, n = 10
        ValueTransferargsTest test = new ValueTransferargsTest();
        test.swap(m, n);
        System.out.println("m =" + m +", n = "+n);
        //m =10, n = 20

        Data data = new Data();
        data.m = 10;
        data.n = 20;

        test.swap2(data);
        System.out.println("m =" + data.m +", n = "+ data.n);
        //m =20, n = 10



    }


    public void swap2(Data data){
        int temp = data.m ;
        data.m = data.n;
        data.n = temp;
    }

    public void swap(int m, int n){
        int temp = m ;
        m = n;
        n = temp;
    }

}

class Data{
    int m;
    int n;
}
