package com.example.example;

import org.junit.Test;

import java.io.*;

/**
 * FileReader & FileWriter 的综合使用案例：文本复制
 */
@SuppressWarnings("all")
public class TextCopy {

    @Test
    public void test01() throws IOException {
        // source
        Reader reader = new FileReader("/Users/terry/Documents/test.txt");
        // target
        Writer writer = new FileWriter("/Users/terry/Documents/bar.txt");

        int data = -1;

        while ((data = reader.read()) != -1) {
            writer.write(data);
        }

        reader.close();
        writer.close();
    }

}
