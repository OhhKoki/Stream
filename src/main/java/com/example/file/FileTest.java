package com.example.file;

import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

@SuppressWarnings("all")
public class FileTest {

    private String fileName;
    private String directoryName;
    private File file;
    private File directory;

    @Before
    public void before() {

        // 文件不存在
        fileName = "/Users/terry/Documents/test.txt";
        // 目录存在，且目录下有别的文件
        directoryName = "/Users/terry/Documents";

        file = new File(fileName);
        directory = new File(directoryName);

    }

    /**
     * File 类访问文件和目录的相关方法：
     *
     *      1）String getName()：返回此 File 对象所对应的文件名或目录名
     *
     *      2）String getPath()：返回此 File 对象所对应的路径名
     *
     *      3）String getAbsolutePath()：返回此 File 对象所对应的绝对路径名
     *
     *      4）File getAbsoluteFile()：返回此 File 对象对应的绝对路径，返回的还是一个 File 对象
     *
     *      5）String getParent()：返回此 File 对象所对应的目录的父目录名
     *
     *      6）File getParentFile()：返回此 File 对象所对应的目录的父目录，返回的还是一个 File 对象
     */
    @Test
    public void test01() {

        // -------------------- 1）String getName()：返回此 File 对象所表示的文件名或目录名 --------------------
        // test.txt
        System.out.println(file.getName());
        // Documents
        System.out.println(directory.getName());

        // -------------------- 2）String getPath()：返回此 File 对象所对应的路径名 --------------------
        // /Users/terry/Documents/test.txt
        System.out.println(file.getPath());
        // /Users/terry/Documents
        System.out.println(directory.getPath());

        // -------------------- 3）String getAbsolutePath()：返回此 File 对象所对应的绝对路径名 --------------------
        // /Users/terry/Documents/test.txt
        System.out.println(file.getAbsolutePath());
        // /Users/terry/Documents
        System.out.println(directory.getAbsolutePath());

        // -------------------- 4）File getAbsoluteFile()：返回此 File 对象对应的的绝对路径，返回的还是一个 File 对象 --------------------
        // /Users/terry/Documents
        System.out.println(file.getAbsoluteFile());
        // /Users/terry
        System.out.println(directory.getAbsoluteFile());

        // -------------------- 5）String getParent()：返回此 File 对象所对应的目录的父目录名 --------------------
        // /Users/terry/Documents
        System.out.println(file.getParent());
        // /Users/terry
        System.out.println(directory.getParent());

        // -------------------- 6）File getParentFile()：返回此 File 对象所对应的目录的父目录，返回的还是一个 File 对象 --------------------
        // /Users/terry/Documents
        System.out.println(file.getParentFile());
        // /Users/terry
        System.out.println(directory.getParentFile());

    }

    /**
     * File 类中文件检测相关的方法：
     *
     *      1）boolean exists()：判断 File 对象所对应的文件或目录是否存在
     *
     *      2）boolean canRead()：判断 File 对象所对应的文件和目录是否可读
     *
     *      3）boolean canWrite()：判断 File 对象所对应的文件和目录是否可写
     *
     *      4）boolean canExecute()：判断 File 对象对应的文件和目录是否可执行
     *
     *      5）boolean isFile(): 判断 File 对象所对应的是否是文件，而不是目录
     *
     *      6）boolean isDirectory(): 判断 File 对象所对应的是否是目录，而不是文件
     *
     *      7）boolean isAbsolute(): 判断 File 对象所对应的文件或目录是否是绝对路径。该方法消除了不同平台的差异，
     *          可以直接判断 File 对象是否为绝对路径。在 Unix、Linux、BSD 等系统上，如果路径名开头是一条斜线（/），
     *          则表明该 File 对象是一个绝对路径；在 Windows 等系统上，如果路径开头是盘符，则说明他是一个绝对路径
     *
     */
    @Test
    public void test02() {

        // -------------------- 1）boolean exists()：判断 File 对象所对应的文件或目录是否存在 --------------------
        // false（文件不存在）
        System.out.println(file.exists());
        // true
        System.out.println(directory.exists());

        // -------------------- 2）boolean canRead()：判断 File 对象所对应的文件和目录是否可读 --------------------
        // false（文件不存在时，会返回 false）
        System.out.println(file.canRead());
        // true
        System.out.println(directory.canRead());

        // -------------------- 3）boolean canWrite()：判断 File 对象所对应的文件和目录是否可写 --------------------
        // false（文件不存在时，会返回 false）
        System.out.println(file.canWrite());
        // true
        System.out.println(directory.canWrite());

        // -------------------- 4）boolean canExecute()：判断 File 对象对应的文件和目录是否可执行 --------------------
        // false（文件不存在时，会返回 false）
        System.out.println(file.canExecute());
        // true
        System.out.println(directory.canExecute());

        // -------------------- 5）boolean isFile(): 判断 File 对象所对应的是否是文件，而不是目录 --------------------
        // false（文件不存在时，会返回 false）
        System.out.println(file.isFile());
        // false
        System.out.println(directory.isFile());

        // -------------------- 6）boolean isDirectory(): 判断 File 对象所对应的是否是目录，而不是文件 --------------------
        // false（如果指定的路径为文件，不是目录的情况下，不管文件是否存在，都会返回 false）
        System.out.println(file.isDirectory());
        // true
        System.out.println(directory.isDirectory());

        // -------------------- 7）boolean isAbsolute(): 判断 File 对象所对应的文件或目录是否是绝对路径 --------------------
        // true（如果指定的绝对路径为路径，不管文件或目录是否存在，都会返回 true）
        System.out.println(file.isAbsolute());
        // true
        System.out.println(directory.isAbsolute());

    }

    /**
     * File类中获取常规文件信息：
     *
     *      1）long length(): 返回文件内容的长度
     *
     *      2）long lastModified(): 返回文件的最后修改时间
     *
     */
    @Test
    public void test03() {

        // -------------------- 1）long length(): 返回文件内容的长度 --------------------
        // 0（文件不存在）
        System.out.println(file.length());
        // 192（目录下有别的文件）
        System.out.println(directory.length());

        // -------------------- 2）long lastModified(): 返回文件的最后修改时间 --------------------
        // 0（文件不存在）
        System.out.println(file.lastModified());
        // 1638281714144（目录的最后修改时间）
        System.out.println(directory.lastModified());

    }

    /**
     * File 类中文件操作的相关方法：
     *
     *      1）boolean createNewFile(): 当 File 对象所对应的文件不存在时，则创建该文件，并返回 true，如果已经存在，则不进行创建操作，直接返回 false
     *
     *      2）boolean delete(): 将 File 对象所对应的文件或目录删除，删除目录时，只能删除空目录
     *
     */
    @Test
    public void test04() throws IOException {

        // -------------------- 1）boolean createNewFile(): 当 File 对象所对应的文件不存在时，则创建该文件，并返回 true，如果已经存在，则不进行创建操作，直接返回 false --------------------
        // true（文件不存在），注意，如果 /Users/terry/Documents 在存在一个名为 test.txt 的目录时，返回的是 false !
        System.out.println(file.createNewFile());
        // false（目录已存在，且存在其他文件）
        System.out.println(directory.createNewFile());

        // -------------------- 2）boolean delete(): 将 File 对象所对应的文件或目录删除，删除目录时，只能删除空目录 --------------------
        // true（文件不存在）
        System.out.println(file.delete());
        // false（目录已存在，且存在其他文件）；删除目录时，只能删除空目录
        System.out.println(directory.delete());

    }

    /**
     * File 类中目录操作相关的方法：
     *
     *      1）boolean mkdir(): 创建一个 File 对象所对应的目录，如果创建成功，则返回 true，否则返回 false。调用该方法时，如果 File 对象对应一个文件名，则会将该文件名当作目录名，用于创建目录
     *
     *      2）String[] list(): 列出 File 对象的所有子文件名和目录名，返回 String 数组
     *
     *      3）File[] listFiles(): 列出 File 对象的所有子文件和目录名，返回 File 数组
     *
     */
    @Test
    public void test05() {

        // -------------------- 1）boolean mkdir(): 创建一个 File 对象所对应的目录，如果创建成功，则返回 true，否则返回 false。调用该方法时，如果 File 对象对应一个文件名，则会将该文件名当作目录名，用于创建目录 --------------------
        // true（file 指向一个文件，不是目录，且该文件不存在。此时调用方法，则会在 /Users/terry/Documents 目录下创建一个名为 "test.txt" 的子目录）
        System.out.println(file.mkdir());
        // false（目录已存在，且存在其他文件）
        System.out.println(directory.mkdir());

        // -------------------- 2）String[] list(): 列出 File 对象的所有子文件名和目录名，返回 String 数组 --------------------
        String[] directoryNameList = directory.list();
        // 列出 /Users/terry/Documents 下 所有 File（文件 & 目录）的名称，例如：IdeaProject、apache-maven-3.8.4
        for (String directoryName : directoryNameList) {
            System.out.println(directoryName);
        }

        // -------------------- 3）File[] listFiles(): 列出 File 对象的所有子文件和目录名，返回 File 数组 --------------------
        File[] directoryList = directory.listFiles();
        // 列出所有 File（文件 & 目录），例如：/Users/terry/Documents/IdeaProject、/Users/terry/Documents/apache-maven-3.8.4
        for (File directory : directoryList) {
            System.out.println(directory);
        }

    }

}
