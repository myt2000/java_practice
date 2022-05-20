package com.finaltest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOWrite {
    public static void main(String[] args){
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("Test.txt"));
            fw.write("人人都有钱赚");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
