package com.stringtest;

public class IndexOfDemo {
    // indexOf是从左到有， lastIndexOf是从右到左
    public static void main(String[] args) {
        String s = "Now is the time for all good men" +
                "to come to the aid for their country";
        System.out.println(s);
        System.out.println("s length " + s.length());
        System.out.println("indexOf(t)  = " + s.indexOf("t"));
        System.out.println("lastIndexOf(t) = " + s.lastIndexOf("t"));
        System.out.println("indexOf(the)  = " + s.indexOf("the"));
        System.out.println("indexOf(t, 10)  = " + s.indexOf("t", 10));
        System.out.println("lastIndexOf(t, 60) = " + s.lastIndexOf("t", 60));
        System.out.println("indexOf(the, 10)  = " + s.indexOf("the", 10));
        System.out.println("lastIndexOf(the, 60) = " + s.lastIndexOf("the", 60));
    }
}
