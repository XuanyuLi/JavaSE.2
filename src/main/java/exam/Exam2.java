package exam;

import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/1.
 */
public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = scanner.nextLine();
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
    }
}
