package com.example.input;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

@SuppressWarnings("all")
public class FileInputStreamTest {

    private InputStream inputStream;

    /**
     * 构造方法
     */
    @Before
    public void test01() throws IOException {
        inputStream = new FileInputStream("/Users/terry/Documents/test.txt");
    }

    /**
     * 关闭资源
     */
    @After
    public void test02() throws IOException {
        inputStream.close();
    }

    /**
     * int read()：从输入流中读取单个字节，返回所读取的字节数据
     */
    @Test
    public void test03() throws IOException {
        int data = -1;
        while ((data = inputStream.read()) != -1) {
            System.out.print((char)data);
        }
    }

    /**
     * int read(byte[] b)：从输入流中最多读取 b.length 个字节的数据，并将其存储在字节数组 b 中，返回实际读取的字节个数，为空时返回 -1
     */
    @Test
    public void test04() throws IOException {
        int length = -1;
        byte[] data = new byte[8];
        while ((length = inputStream.read(data)) != -1) {
            System.out.print(new String(data));
        }
    }

    /**
     * int read(byte[] b, int off, int len) throws IOException：从输入流中最多读取 len 个 字节的数据，并将其存储在数组 b 中，将数据放入数组 b 中时，并不一定是从数组零索引处开始，而是从索引为 off 位置处开始，返回实际读取的字节数
     */
    @Test
    public void test05() throws IOException {
        int length = -1;
        byte[] data = new byte[8];
        while ((length = inputStream.read(data, 1, 5)) != -1) {
            System.out.print(new String(data, 1, length));
        }
    }

}
