package com.proxy;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;

public class LambdaTest {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("+++++++++");
            }
        };

        Runnable r2 = () -> System.out.println("lambda ++++++");

        r1.run();
        r2.run();

        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        TreeSet<String> ts2 = new TreeSet<>(
                (o1, o2)  -> Integer.compare(o1.length(), o2.length())
         );
        

        String a = "10000";
        String b = "2333";
        ts.add(a);
        ts.add(b);
        for (String string :ts){
            System.out.println(string);
        }

        ts2.add(a);
        ts2.add(b);
        for(String string: ts2){
            System.out.println(string);
        }

    }
}

