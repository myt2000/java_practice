/*
 * Copyright (c) 2020. Author:brooks   email:myt2000@126.com
 */

package com.atguiya.java4;

/**
 * 面向多态性，可以理解为一个事务的多种形态
 *
 * 1.理解多态性：可以理解为一个事务的多种形态。
 * 2.何为多态性：
 *      对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 *
 * 3.多态的使用：虚拟方法调用
 *  有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法
 *  总结：编译，看左边；运行，看右边
 *
 *  4.多台使用的前提：1.类的继承关系 2.方法的重写
 *
 *  5.对象的多态性：只适用于方法，不适用于属性（编译和运行都看左边）
 */
public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        //对象多台性：父类的引用指向子类的对象
        Person p2 = new Man();
        Person p3 = new Woman();
        //多态的使用，当调用字符类同名同参数的方法时，实际执行的是子类重写父类的方法 -- 虚拟方法调用
        p2.eat();
        p2.walk();
    }

}
