package com.supertest;

public class INClass{
    void innerClass(final String str){
        class IClass{
            IClass(){
                System.out.println(str);
            }
        }
        IClass ic=new IClass();
    }
    public static void main(String[] args){
        INClass inc=new INClass();
        inc.innerClass("Hello");
    }
}

// Hello