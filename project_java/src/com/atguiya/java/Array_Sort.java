package com.atguiya.java;

public class Array_Sort {
    public static void main(String[] args){
        String[] arr =new String[]{"JJ", "DD", "MM", "BB","AA"};

        // 数组的反转

        //方法一
//        for (int i = 0; i < arr.length/2; i++) {
//            String temp = arr[i];
//            arr[i] =arr[arr.length-1-i];
//            arr[arr.length-i-1] =temp;
//        }

//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+"\t");
//        }

        //方法二
        for (int i = 0, j=arr.length-1; i<j; i++,j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }


        String dest ="BB";
        boolean isFlag = true;
        for(int i=0;i<arr.length;i++){
            if(dest.equals(arr[i])){
                System.out.println("找到了指定的元素， 位置为："+i);
                isFlag =false;
                break;
            }
        }
        if (isFlag){
        System.out.println("很遗憾，没有找到哦");
        }

        //二分查找法：
        //前提：所要查找的数组必须有序。
        int[] arr2 = new int[]{-98, -34, 2, 34, 54, 66,79, 105, 210,333};

        int dest1 = -34;
        int head = 0;//初始值索引
        int end = arr2.length - 1;//初始的末索引
        boolean isFlag1 = true;
        while(head<=end){
            int middle = (head + end)/2;

            if (dest1 == arr2[middle]){
                System.out.println("找到了指定的元素， 位置为："+middle);
                isFlag1 = false;
                break;
            }
            else if(arr2[middle] > dest1){
                end =middle - 1;
            }
            else {
                head = middle + 1;
            }
        }
        if(isFlag1)
        {
            System.out.println("没有找到啦");
        }

    }



}
