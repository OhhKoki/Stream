package com.example.example;

import org.junit.Test;

import java.io.*;

@SuppressWarnings("all")
public class ObjectSerialize {

    /**
     * 文件序列化 & 文件反序列化
     */
    @Test
    public void test01() throws Exception {
        User user1 = new User("tom", 18);
        // 文件输出流
        FileOutputStream fos = new FileOutputStream("/Users/terry/Documents/test.txt");
        // 对象输出流
        ObjectOutputStream output = new ObjectOutputStream(fos);
        // 将对象序列化成字节序列，然后写到文件
        output.writeObject(user1);

        // 文件输入流
        FileInputStream fis = new FileInputStream("/Users/terry/Documents/test.txt");
        // 对象输入流
        ObjectInputStream input = new ObjectInputStream(fis);
        // 读取文件中的字节序列，然后将字节序列反序列化成对象
        User user2 = (User) input.readObject();
        System.out.println(user2);

        output.close();
        input.close();

    }

    /**
     * 内存序列化 & 内存反序列化
     */
    @Test
    public void test02() throws Exception {
        User user1 = new User("tom", 18);
        // 内存输出流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // 对象输出流
        ObjectOutputStream output = new ObjectOutputStream(baos);
        // 将对象序列化字节序列，然后将字节序列写入内存
        output.writeObject(user1);

        // 将存在内存流中的数据转为 byte[] 全部取出
        byte[] data = baos.toByteArray();
        // 内存输入流
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        // 对象输入流
        ObjectInputStream input = new ObjectInputStream(bais);
        // 读取内存中的字节序列，然后反序列化成对象
        User user2 = (User) input.readObject();
        System.out.println(user2);

        output.close();
        input.close();

    }

}

@SuppressWarnings("all")
class User implements Serializable {

    private String name;
    // transient 指定的属性不会被序列化
    transient private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
