/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.extend.exer;

public class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给"+ boy.getName());
        boy.marry(this);
    }


    /**
     *
     * @param girl
     * @return 正数，当前对象大;  负数：当前对象小； 0当前对象与形参对象相等
     */
    public int compare(Girl girl){
        if(this.age > girl.age){
            return 1;
        }
        else if (this.age < girl.age){
            return -1;
        }else {
            return 0;
        }
    }
}
