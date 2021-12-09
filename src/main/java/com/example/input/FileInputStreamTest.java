package com.example.input;

import org.junit.Test;
import java.io.*;

/**
 * @author terry
 */
@SuppressWarnings("all")
public class FileInputStreamTest {

    /**
     * int read()：从输入流中读取单个字节
     */
    @Test
    public void test01() {
        File file = new File("/Users/terry/Documents/test.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            int data = 0;
            // int read()：从输入流中读取单个字节，如果读取到结尾（没有数据可读了），则返回 -1
            while ((data = inputStream.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * int read(byte b[])：从输入流中读取多个字节
     */
    @Test
    public void test02() {
        File file = new File("/Users/terry/Documents/test.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            // 一次读取八个字节
            byte[] buf = new byte[8];
            int length = 0;
            // int read(byte b[])：从输入流中读取 b.length 个字节到 b 数组中，并返回，并返回实际读取到的字节数，如果读取到结尾了（没有数据可读了），则返回 -1
            while ((length = inputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
