package com.stringtest;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer " + sb);
        System.out.println("length " + sb.length());
        System.out.println("capacity = " + sb.capacity());  // 默认长度是字符串长度 + 16 也就是5+16 = 21
        sb.append(" ").append("Java").append("!");
        System.out.println("buffer " + sb);
        System.out.println("length " + sb.length());
        System.out.println("capacity = " + sb.capacity());  // 没超过21的长度，不会增加
        sb.append(" This is an");
        System.out.println("buffer " + sb);
        System.out.println("length " + sb.length());
        System.out.println("capacity = " + sb.capacity()); // 如果长度超过21 （21+1）*2 = 44
        sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("buffer " + sb);
        System.out.println("length " + sb.length());
        System.out.println("capacity = " + sb.capacity()); // 再超过 （44+1）*2
    }
}
