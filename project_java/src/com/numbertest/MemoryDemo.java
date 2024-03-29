package com.numbertest;

public class MemoryDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer someints[] = new Integer[1000];
        System.out.println("Total memory is: " + r.totalMemory());
        mem1 = r.freeMemory();
        System.out.println("Initial memory is: " + mem1);
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem1);
        for (int i = 0; i<1000; i++) {
            someints[i] = i;
        }
        mem2 = r.freeMemory();
        System.out.println("Free memory after collection: " + mem2);
        System.out.println("Memory used by allocation: " + (mem1 - mem2));

        for (int i=0; i<1000; i++) {
            someints[i] = null;
        }
        r.gc();
        mem2 = r.freeMemory();
        System.out.println("Free memory after collecting" + " discarded Integers: " + mem2);
    }
}
