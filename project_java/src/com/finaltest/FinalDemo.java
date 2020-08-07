package com.finaltest;

final class Final{
    final String str="final Data";
    public String str1="non final data";
    final public void print(){
        System.out.println("final method.");
        }
    public void what(){
        System.out.println(str+" "+str1);
        }
        }

public class FinalDemo {   //extends final 无法继承
    public static void main(String[] args){
        Final f = new Final();
        f.what();
        f.print();
    }
}
/*
final Data non final data
final method.
 */