package com.finaltest;

import java.util.Arrays;
import java.util.Comparator;

class Goods implements Comparable {
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    //按照价格，比较商品的大小
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods) {
            Goods other = (Goods) o;
            if (this.price > other.price) {
                return 1;
            } else if (this.price < other.price) {
                return -1;
            }
            return 0;
        }
        throw new RuntimeException("输入的数据类型不一致");
    }
//构造器、getter、setter、toString()方法略

}


public class ComparableTest{
//    public static void main(String[] args) {
//        Goods[] all = new Goods[4];
//        all[0] = new Goods("《红楼梦》", 100);
//        all[1] = new Goods("《西游记》", 80);
//        all[2] = new Goods("《三国演义》", 140);
//        all[3] = new Goods("《水浒传》", 120);
//        Arrays.sort(all);
//        System.out.println(Arrays.toString(all));
//        //[Goods{name='《西游记》', price=80.0}, Goods{name='《红楼梦》', price=100.0}, Goods{name='《水浒传》', price=120.0}, Goods{name='《三国演义》', price=140.0}]
//    }

    public static void main(String[] args){
        Goods[] all = new Goods[4];
        all[0] = new Goods("War and Peace", 100);
        all[1] = new Goods("Childhood", 80);
        all[2] = new Goods("Scarlet and Black", 140);
        all[3] = new Goods("Notre Dame de Paris", 120);
        Arrays.sort(all, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Goods g1 = (Goods) o1;
                Goods g2 = (Goods) o2;
                // Name进行排序
                return g1.getName().compareTo(g2.getName());
            }
        });
        System.out.println(Arrays.toString(all));
        //[Goods{name='Childhood', price=80.0}, Goods{name='Notre Dame de Paris', price=120.0}, Goods{name='Scarlet and Black', price=140.0}, Goods{name='War and Peace', price=100.0}]
    }
}


