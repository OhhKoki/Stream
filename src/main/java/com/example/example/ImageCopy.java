package com.example.example;

import org.junit.Test;

import java.io.*;

/**
 * FileInputStream & FileOutputStream 的综合使用案例：图片复制
 */
@SuppressWarnings("all")
public class ImageCopy {

    @Test
    public void test01() throws IOException {
        // source
        InputStream inputStream = new FileInputStream("/Users/terry/Pictures/IMG_0019.JPG");
        // target
        OutputStream outputStream = new FileOutputStream("/Users/terry/Documents/IMG_0019.JPG");

        int data = -1;

        while ((data = inputStream.read()) != -1) {
            outputStream.write(data);
        }

        inputStream.close();
        outputStream.close();
    }

}
