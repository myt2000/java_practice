package com.atguiya.java;

public class Array_Test {
    public static void main(String[] args){
        int[] arr = new int[10];

        for (int i =0; i<arr.length;i++){
            arr[i] = (int)(Math.random() * (99-10+1) + 10);
        }

        // 求数组元素最大值
        int maxValue = 0;
        for (int i=0;i<arr.length;i++) {
            if (maxValue <arr[i]){
                maxValue = arr[i];
            }

        }
        System.out.println("最大值"+maxValue);

        int minValue = 0;
        for (int i=0;i<arr.length;i++) {
            if (minValue >arr[i]){
                minValue = arr[i];
            }

        }
        System.out.println("最小值"+minValue);


        //求数组元素的总和
        int sum = 0;
        for (int i=0;i<arr.length; i++) {
//            if (sum >arr[i]){
                sum += arr[i];
//            }

        }
        System.out.println("总和为"+sum);


        //求数组元素的平均数
        double avgValue = (double)sum / (double)arr.length;
        System.out.println("平均数"+avgValue);
    }

//    public static void main(String[] args){
//
//        // 1.声明并初始化二维数组
//        int[][] yanghui = new int[10][];
//        // 2.给数组的元素赋值
//        for (int i=0;i<yanghui.length;i++){
//            yanghui[i] = new int[i+1];
//
//            yanghui[i][0] = yanghui[i][i] =1;
//            if(i>1){
//                for (int j=1;j<yanghui[i].length-1;j++){
//                    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
//                }
//            }
//        }
//
//        //3.遍历二维数组
//        for (int i =0;i<yanghui.length;i++){
//            for (int j=0;j<yanghui[i].length;j++){
//                System.out.print(yanghui[i][j]+" ");
//            }
//            System.out.println();
//        }


//    }
//    public static void main(String[] args){
//        int[] y[];//二维数组
//        int[] x;//一维数组
//        y = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(y);
//    }
}
