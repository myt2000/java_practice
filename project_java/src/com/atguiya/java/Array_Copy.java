package com.atguiya.java;

public class Array_Copy {
    public static void main(String[] args){
        int[] array1, array2;
        array1 = new int[]{2,3,5,7,9,11,13,17,19};

        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }

        //赋值array2变量等于array1
        // 不能称作数组的复制
        array2 = array1;

        // 修改array2中的偶索引元素，使其等于索引值
        for (int i=0;i<array2.length;i++){
            if (i%2==0){
                array2[i] = i;
            }
        }
        System.out.println();
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
//        2	3	5	7	9	11	13	17	19
//        0	3	2	7	4	11	6	17	8


        // array2复制array1的操作
        array2 =new int[array1.length];
        for (int i=0;i<array2.length;i++){
            array2[i] = array1[i];
        }



    }
}
