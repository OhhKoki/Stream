package com.example.input;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

@SuppressWarnings("all")
public class FileReaderTest {

    private Reader reader;

    @Before
    public void test01() throws IOException {
        reader = new FileReader("/Users/terry/Documents/test.txt");
    }

    @After
    public void test02() throws IOException {
        reader.close();
    }

    @Test
    public void test03() throws IOException {
        int data = 1;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
    }

    @Test
    public void test04() throws IOException {
        int length = -1;
        char[] chars = new char[8];
        while ((length = reader.read(chars)) != -1) {
            System.out.print(new String(chars, 0, length));
        }
    }

    @Test
    public void test05() throws IOException {
        int length = -1;
        char[] chars = new char[8];
        while ((length = reader.read(chars, 0, 4)) != -1) {
            System.out.print(new String(chars, 0, length));
        }
    }

}
