package com.practice.java;

public class Singleton {
    private static Singleton instance;

    public Singleton() {
    }

    public synchronized static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void singletonTest() {
        System.out.println("singletonTest is called");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.singletonTest();
        Singleton singleton1 = Singleton.getInstance();
        singleton1.singletonTest();
//        boolean test = singleton.equals(singleton1);
        System.out.println("singleton equals singleton1 " + (singleton == singleton1));
    }

}