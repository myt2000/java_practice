package com.proxy;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // get/set方法

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, IntrospectionException {
        Person person = new Person("luoxn28", 23);
        Class clazz = person.getClass();  //获取类名

        Field[] fields = clazz.getDeclaredFields();   //
        for (Field field : fields) {
            String key = field.getName();
            PropertyDescriptor descriptor = null;

            descriptor = new PropertyDescriptor(key, clazz);

            Method method = descriptor.getReadMethod();
            Object value = null;

            value = method.invoke(person);   //虚拟方法调用


            System.out.println(key + ":" + value);

        }
    }
}

/*
使用反射的方式获取属性的
* name:luoxn28
* age:23
* */