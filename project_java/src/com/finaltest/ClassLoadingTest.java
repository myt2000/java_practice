package com.finaltest;

import java.io.InputStream;

public class ClassLoadingTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classloader = ClassLoader.getSystemClassLoader();
        System.out.println(classloader);  //sun.misc.Launcher$AppClassLoader@18b4aac2
        //2.获取系统类加载器的父类加载器，即扩展类加载器
        classloader = classloader.getParent();
        System.out.println(classloader);  // sun.misc.Launcher$ExtClassLoader@39a054a5
        //3.获取扩展类加载器的父类加载器，即引导类加载器
        classloader = classloader.getParent();
        System.out.println(classloader);
        //4.测试当前类由哪个类加载器进行加载
//        classloader = Class.forName("exer2.ClassloaderDemo").getClassLoader();
        System.out.println(classloader);
        //5.测试JDK提供的Object类由哪个类加载器加载
        classloader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classloader);
        //*6.关于类加载器的一个主要方法：getResourceAsStream(String str):获取类  径下的指定文件的输入流
        InputStream in = null;
//    in = this.getClass().getClassLoader().getResourceAsStream("exer2\\test.properties");
        System.out.println(in);
    }
}

