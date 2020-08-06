package com.supertest;


/*
* 定义方法中的参数为final，对于基本类型的变量，这样做并没有什么实际意义，
* 因为基本类型的变量在调用方法时是传值的，
* 也就是说你可以在方法中更改这个参数变量而不会影响到调用语句，
* 然而对于对象变量，
* 却显得很实用，
* 因为对象变量在传递时是传递其引用，
* 这样你在方法中对对象变量的修改也会影响到调用语句中的对象变量，当你在方法中不需要改变作为参数的对象变量时，明确使用final进行声明，
* 会防止你无意的修改而影响到调用方法。
* */
public class INClass{
    void innerClass(final String str){
        class IClass{
            IClass(){  //这是个方法，缺省default的使用方法
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