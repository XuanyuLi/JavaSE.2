package java1702.javase.basic.io;

import java.io.File;

/**
 * Created by lixuanyu
 * on 2017/4/21.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("new");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
//java语言的File类既指文件也指目录
