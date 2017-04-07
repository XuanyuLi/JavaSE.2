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
        String s = scanner.nextLine();
        System.out.println(s);
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];

        }
    }
}
