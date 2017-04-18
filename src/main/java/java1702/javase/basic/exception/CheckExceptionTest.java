package java1702.javase.basic.exception;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/17.
 */
public class CheckExceptionTest {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件名：");
        String fileName = scanner.nextLine();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "r");
        } catch (FileNotFoundException e) {
            System.out.println("file not found!");
            test();
        }
    }
}
//抽取方法快捷键（重构方法）Ctrl + Alt + M
