package com.stringtest;

public class StringRepalce {
    public static void main(String[] args) {
        String org = "This is a test, This is, too";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;
        // substring 两种重载方法
        do {
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1) {
                result = org.substring(0, i);  // substring 开始位置截取到结束位置
                result = result + sub;
                result = result + org.substring(i + search.length());  // substring 只填写开始位置， 会去截取开始位置到结尾
                org = result;

            }
        } while (i != -1);
    }
}
