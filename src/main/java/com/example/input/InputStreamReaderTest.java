package com.example.input;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

@SuppressWarnings("all")
public class InputStreamReaderTest {

    private Reader reader;

    @Before
    public void test01() throws IOException {
        reader = new InputStreamReader(new FileInputStream("/Users/terry/Documents/test.txt"));
    }

    @After
    public void test02() throws IOException {
        reader.close();
    }

    @Test
    public void test03() throws IOException {
        int data = -1;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
    }

}
