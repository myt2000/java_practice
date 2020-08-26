package com.finaltest;

import java.util.ArrayList;
import java.util.List;

public class ForTest {
    public static void main(String[] args) {
//        String[] str = new String[5];
//        str[0] = "a";
//        str[1] = "b";
//        str[2] = "c";
//        str[3] = "d";
//        str[4] = "e";
//
//        for (String myStr : str) {
//            myStr = "atguigu";
//            System.out.println(myStr);
//        }
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
        ForTest a = new ForTest();
        a.testListRemove();
//        a.updateList();

}
//    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);   //增加元素1,2,3
    }
    private static void updateList(List list) {
        list.remove(2);
    }  //删除索引为2的元素
}
//atguigu
//atguigu
//atguigu
//atguigu
//atguigu
//a
//b
//c
//d
//e

