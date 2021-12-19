package com.example.output;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

@SuppressWarnings("all")
public class FileWriterTest {

    private Writer writer;

    @Before
    public void test01() throws IOException {
        writer = new FileWriter("/Users/terry/Documents/test.txt");
    }

    /**
     * 对于对于字符输出流来说，flush 或者 close 用于刷新内存的缓冲区，数据只是保存到缓冲区，并未保存到文件。
     */
    @After
    public void test02() throws IOException {
        writer.close();
    }

    @Test
    public void test03() throws IOException {
        String msg = "你好 世界";
        char[] chars = msg.toCharArray();
        for (char c : chars) {
            writer.write(c);
        }
    }

    @Test
    public void test04() throws IOException {
        String msg = "你好 世界";
        char[] chars = msg.toCharArray();
        writer.write(chars);
    }

    @Test
    public void test05() throws IOException {
        String msg = "你好 世界";
        char[] chars = msg.toCharArray();
        // 输出结果为：" 世界"
        writer.write(chars, 2, 3);
    }

    @Test
    public void test06() throws IOException {
        String msg = "你好 世界";
        writer.write(msg);
    }

    @Test
    public void test07() throws IOException {
        String msg = "你好 世界";
        // 输出结果为：" 世界"
        writer.write(msg, 2, 3);
    }

}
