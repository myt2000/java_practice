package com.finaltest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileIOTest {
    public static void main(String[] args){
        FileReader fr = null;
        try {
            fr = new FileReader(new File("g:\\test.txt"));
            char[] buf = new char[1024];
            int len;
            while ((len = fr.read(buf)) != -1) {
                System.out.print(new String(buf, 0, len));
            }
        } catch (IOException e) {
            System.out.println("read-Exception :" + e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("close-Exception :" + e.getMessage());
                } } }
    }
}
