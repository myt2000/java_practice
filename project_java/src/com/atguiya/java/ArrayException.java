package com.atguiya.java;

public class ArrayException {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};

        //情况一：空指针异常  NullPointerException
        /*
        Exception in thread "main" java.lang.NullPointerException
	        at com.atguiya.java.ArrayException.main(ArrayException.java:9)
        */
//        int[] arr1 = new int[]{1,2,3};
//        arr1 = null;
//        System.out.println(arr1[0]);

        //情况二：
//        int[][] arr2 = new int[4][];
//        System.out.println(arr2[0][0]);

        //情况三：
        String[] arr3 = new String[]{null, "BB", "CC"};
        System.out.println(arr3[0].toString());
    }
}
