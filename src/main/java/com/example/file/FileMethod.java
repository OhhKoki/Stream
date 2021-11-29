package com.example.file;

import org.junit.Test;
import java.io.File;
import java.io.IOException;

/**
 * File类常用方法
 */
@SuppressWarnings("all")
public class FileMethod {

    /**
     * File(String pathname)
     * 声明文件：根据 "绝对路径" 声明
     */
    @Test
    public void test01() {
        String fileName = "/Users/terry/Documents/test.txt";
        // 声明文件
        File file = new File(fileName);
        try {
            // 创建文件
            file.createNewFile();
        }catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * File(String parent, String child)
     * 声明文件：根据 "目录 + 文件名" 声明
     */
    @Test
    public void test02() {
        // 需要事先创建目录，否则报错：No such file or directory
        String directoryName = "/Users/terry/Documents/TestIO";
        String fileName = "test.txt";
        // 声明文件
        File file = new File(directoryName, fileName);
        try {
            // 创建文件
            file.createNewFile();
        }catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    /**
     * 创建目录：创建单个目录对象
     */
    @Test
    public void test03() {
        String dirname = "/Users/terry/Documents/TestIO/";
        File file = new File(dirname);
        // 创建目录
        file.mkdir();
    }

    /**
     * 创建目录：创建多个目录对象
     */
    @Test
    public void test04() {
        String dirname = "/Users/terry/Documents/TestIO/TestDemo";
        File file = new File(dirname);
        // 创建目录
        file.mkdirs();
    }

    /**
     * 文件信息
     */
    @Test
    public void test() {
        String fileName = "/Users/terry/Documents/TestIO/testFile.txt";
        File file = new File(fileName);
        System.out.println("是否存在：" + file.exists());
        System.out.println("是目录否：" + file.isDirectory());
        System.out.println("是文件否：" + file.isFile());
        System.out.println("文件名称：" + file.getName());
        System.out.println("父级目录：" + file.getParent());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("文件大小：" + file.length());
    }

}
