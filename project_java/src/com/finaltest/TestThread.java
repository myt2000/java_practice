package com.finaltest;
import java.lang.Thread;

class MyThread extends Thread{
    public MyThread(){
        super();
    }
    public void main(String[] args){
        for(int i=0; i<100; i++){
            System.out.println("子线程："+i);
        }
    }
}

public class TestThread {
    public static void main(String[] args){
        //1.创建线程
        MyThread mt = new MyThread();
        //2.启动线程；并调用当前线程run()方法
        mt.start();

    }
}