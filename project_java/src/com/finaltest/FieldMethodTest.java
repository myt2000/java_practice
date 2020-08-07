package com.finaltest;

class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}

public class FieldMethodTest {
    public static void main(String[] args){
        Sub s = new Sub();
        System.out.println(s.count);
        // 20
        s.display();
        // 20
        Base b = s;
        // b实际还是sub类
        System.out.println(b == s);
        System.out.println(b.count);
        // 由于多态性，多态只能调用子类方法，不能调用子类属性， 打印10
        b.display();
        // 20
    }
}