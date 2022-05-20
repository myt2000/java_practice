package com.stringtest;


public class OtherStringMethodTest {


    public static void main(String[] args) {
        String ch = "中文";
        String eng = "English";
        System.out.println(ch.codePointAt(0)); // 将unicode 16进制编码会输出为 10进制 中 16进制 为 \u4e2d 10进制 20013
        System.out.println(eng.codePointAt(2)); // g 的 ascii码 10进制
        System.out.println(ch.codePointBefore(1));
        System.out.println(ch.codePointCount(0, 2));
        System.out.println(eng.codePointCount(1, 6));  // 返回字符串的长度
        System.out.println(eng.contains("ss"));
        System.out.println(eng.contentEquals("english"));
        System.out.println(String.format("a %s", ch));
//        System.out.println(eng.matches("^E*"));
        System.out.println(eng.subSequence(1,3));
        System.out.println(eng.substring(1,3));

    }
}
