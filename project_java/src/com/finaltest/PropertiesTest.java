package com.finaltest;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) {
        InputStream input = null;
        // 第一种，使用ClassLoad的方法获取InputStram对象。
        input = PropertiesTest.class.getClassLoader().getResourceAsStream("PropertiesTest.properties");
        // 第二种，直接使用Class的方法来获取InputStream对象。必须加'/'表示在classpath路径下，如果不加的话，那么获取的是PropertiesApp这个类所在package下的文件。
        input = PropertiesTest.class.getResourceAsStream("PropertiesTest.properties");
        OutputStream os = null;

        try {
            os = new FileOutputStream("storePropertiesTest.xml");
        } catch (FileNotFoundException e1) {
        }

        // 第一步：创建Properties对象
        Properties prop = new Properties();
        try {
            // 第二步：加载属性, 不会自动关闭input输入流。
            prop.load(input);
            // 第三步：获取属性
            String value1 = prop.getProperty("key1");
            String value5 = prop.getProperty("key5");
            String value7 = prop.getProperty("key7", "defaultvalue");
            System.out.println("[key1:" + value1 + "],[key5:" + value5 + "],[key7:" + value7 + "]");
            Set<String> keys = prop.stringPropertyNames();
            System.out.println("全部的key/value属性：");
            for (String key : keys) {
                System.out.println("[" + key + "][" + prop.getProperty(key) + "]");
            }
            // 第四步：设置属性
            prop.setProperty("key7", "value7");
            // 第五步：保存成文件
            prop.storeToXML(os, "comments");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    // ignore
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    // ignore
                }
            }
        }
    }

}