package com.finaltest;


abstract class Template {
    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis(); //单位是毫秒
        System.out.println("执行时间是：" + (end - start) + "毫秒");
    }
    public abstract void code();
}
class SubTemplate extends Template {
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}
public class TemplateTest {
    public static void main(String[] args){
        SubTemplate a = new SubTemplate();
        a.getTime();
    }

    public TemplateTest() {
        int i = 1;
    }
}
