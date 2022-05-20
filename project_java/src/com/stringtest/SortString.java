package com.stringtest;

public class SortString {
    static String arr[] = {
            "Now", "is", "the", "time", "for", "all", "good", "men",
            "to", "come", "to", "the", "aid", "of", "their", "country"
    };

    // compareto 英文字符串如果包含子串，但是长度不一样，比较的是长度，返回长度差 字符串不相同比较的是每一个字符 ASCII 差值， 中文比较的是unicode 编码的值
    public static void main(String[] args) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                int compareResult = arr[i].compareTo(arr[j]);
                System.out.println("Compare result " + compareResult);
                if (arr[i].compareTo(arr[j]) < 0 ) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println(arr[j]);
        }
    }
}


