package com.example.output;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@SuppressWarnings("all")
public class FileOutputStreamTest {

    private OutputStream outputStream;

    /**
     * 构造函数
     * @throws Exception
     */
    @Before
    public void test01() throws Exception {
        // 创建 FileOutputStream 对象前会先创建文件：该路径下，如果没有这个文件，会创建该文件。如果有这个文件，会清空这个文件的数据
        outputStream = new FileOutputStream("/Users/terry/Documents/test.txt");
    }

    /**
     * 关闭资源
     * @throws IOException
     */
    @After
    public void test02() throws IOException {
        outputStream.close();
    }

    /**
     * void write(int b) throws IOException：输出单个字节数据
     * @throws IOException
     */
    @Test
    public void test03() throws IOException {
        String msg = "hello world";
        byte[] bytes = msg.getBytes();
        for (byte b : bytes) {
            outputStream.write(b);
        }
    }

    /**
     * write(byte b[]) throws IOException：输出整个字节数组
     * @throws IOException
     */
    @Test
    public void test04() throws IOException {
        String msg = "hello world";
        byte[] bytes = msg.getBytes();
        outputStream.write(bytes);
    }

    @Test
    public void test05() throws IOException {
        String msg = "hello world";
        byte[] bytes = msg.getBytes();
        // 从第六个字节开始（也就是w）,一个五个（world）
        outputStream.write(bytes, 6, 5);    // world
    }

    @Test
    public void test06() throws IOException {
        outputStream = new FileOutputStream("/Users/terry/Documents/test.txt", true);
        String msg = "hello world";
        byte[] bytes = msg.getBytes();
        // 字节输出
        outputStream.write(bytes);
        // 内容换行
        outputStream.write("\r".getBytes());
    }

}
