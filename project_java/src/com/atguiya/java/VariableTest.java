package com.atguiya.java;

import java.util.Scanner;

public class VariableTest {
    public static void main(String args[]){
        for (int i=0;i<100;i++){
            if(i%10==0)
                continue;
            System.out.println(i);
        }

//    public static void main(String[] args){
//        for (int i=0;i<10;i++){
//            if(i==3)
//                break;
//            System.out.println("i="+i);
//        }
//        System.out.println("Game over!");
        /*
        i=0
        i=1
        i=2
        Game over!
        */
    }
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int positeNumber=0;
//        int negativeNumber=0;
//        for(;;){ //while(true){
//            System.out.println("请输入一个整数");
//            int z = scanner.nextInt();
//            if(z>0)
//                positeNumber++;
//            else if(z<0)
//                negativeNumber++;
//            else
//                // 输入0为
//                break;
//        }
//        System.out.println("正数的个数为："+positeNumber);
//        System.out.println("负数的个数为："+negativeNumber);
//    }
//    public static void main(String[] args){
//        int result = 0, i = 1;
//        do {
//            result += i;
//            i++;
//        } while (i <=100);
//        System.out.println("result="+result);
//    }

//    public static void main(String[] args){
//        int result =0;
//        int i =1;
//        while(i<=100){
//            result +=i;
//            i++;
//            System.out.println("result = "+result);
//        }

//    }
//    public static void main(String[] args){
//        int result = 0;
//        for (int i=1; i<100; i++){
//            result += i;
//            System.out.println("result = "+result);
//        }
//    }

//    public static void main(String[] args){
//        int x = 1;
//        int y = 1;
//        if(x++==2 & ++y==2){
//            // false & true == false
//            // x=2 y=2
//            x = 7;
//        }
//        System.out.println("x="+x+",y="+y);
//
//
//        x = 1;
//        y = 1;
//        if(x++==2 && ++y==2){
//            // false
//            // x=2 右侧不计算 y=1
//            x=7;
//        }
//        System.out.println("x="+x+",y="+y);
//
//        x = 1;
//        y = 1;
//        if(x++==1 | ++y==1){
//            // true | false
//            x=7;
//        }
//        System.out.println("x="+x+",y="+y);
//
//        x = 1;
//        y = 1;
//        if(x++==1 || ++y==1){
//            x=7;
//        }
//        System.out.println("x="+x+",y="+y);
//    }

//    public static void main(String[] args){
//        short s = 3;
////        s = s+ 2;
//        s +=2;
//
//        int i = 1;
//        i *= 0.9; //整型*浮点型,如果浮点型小于1，则为0，大于1，则为整型*整型
//        System.out.println(i);
//        //0
//        i++; //i此时为0， i++后自增1
//        System.out.println(i);
//        //1
//
//        int m = 2;
//        int n = 3;
//        n *= m++;
//        System.out.println("m=" +m);
//        //m=3
//        System.out.println("n=" +n);
//        //n=6
//
//        n =10;
//        n += (n++) + (++n);
//        // 32
//    }

//    public static void main(String[] args){
//        int number1;
//        number1 = 10;
//
//        int number2;
//        number2 = 10;
//
//        int number3;
//        number3 = number1 + number2;
//        System.out.println("Number3= "+ number3);
//
//        int number4 = 50;
//        int number5 = number4 - number3;
//        System.out.println("Number5 ="+number5);
//    }
//    public static void main(String[] arg){
//        int no = 10;
//        String str = "abcdef";
//        String str1 = str + "xyz" + no;
//
//        str1 = str1 + "123";
//        char c = '国';
//
//        double pi = 3.1416;
//        str1 = str1 + pi;
//        boolean b = false;
//        str1 = str1 + b;
//        str1 = str1 + c;
//        // str可以将不同类型的值拼接的
//        System.out.println("str1 = "+ str1);
//    }
//    public static void main(String[] arg){
//        long s = 5;
//        s = s - 2;
//        short t= 6;
//        t = t - 2;
//        System.out.println("5+5 = "+5+5);
        //5+5 = 55
//    }

//    public static void main(String[] args){
//        int i1 = 10;
//        int i2 = 20;
//        int i = i1++;
//        System.out.print("i="+i);
//        System.out.println("\n-------\n");
//        System.out.println("i1="+i1);
//        i = ++i1;
//        System.out.print("i="+i);
//        System.out.println("\n-------\n");
//        System.out.println("i1="+i1);
//        i = i2--;
//        System.out.print("i="+i);
//        System.out.println("\n-------\n");
//        System.out.println("i2="+i2);
//        i = --i2;
//        System.out.print("i="+i);
//        System.out.println("\n-------\n");
//        System.out.println("i2="+i2);
/*
i=10
-------

i1=11
i=12
-------

i1=12
i=20
-------

i2=19
i=18
-------

i2=18

*/
    }
//}
//public class OperatorTest {
//
//}