package com.example.input;

import org.junit.Before;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@SuppressWarnings("all")
public class BufferedInputStreamTest {

    private InputStream inputStream;

    @Before
    public void test01() throws IOException {
        inputStream = new BufferedInputStream(new FileInputStream("/Users/terry/Documents/test.txt"));

    }

}
