package com.finaltest;

class Circle {
    private double radius;
    public static String name = "这是一个圆";
    public static String getName() {
        return name;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double findArea() {
        return Math.PI * radius * radius;
    }
    public void display() {
        System.out.println("name:" + name + "radius:" + radius);
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(3.0);

        System.out.println(Circle.name);
        c1.name = "我是方的";
        //name:我是方的radius:2.0
        //name:我是方的radius:3.0
        c1.display();
        c2.display();
    }
}
//name:这是一个圆radius:2.0
//name:这是一个圆radius:3.0

