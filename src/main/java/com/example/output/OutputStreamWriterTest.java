package com.example.output;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

@SuppressWarnings("all")
public class OutputStreamWriterTest {

    private Writer writer;

    @Before
    public void test01() throws IOException {
        writer = new OutputStreamWriter(new FileOutputStream("/Users/terry/Documents/test.txt"));
    }

    @After
    public void test02() throws IOException {
        writer.close();
    }

    @Test
    public void test03() throws IOException {
        String msg = "你好 世界";
        writer.write(msg);
    }

}
