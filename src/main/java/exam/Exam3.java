package exam;

import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/1.
 */
public class Exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = scanner.nextLine();
        char[] chars = new char[string.length()];
        chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                int t = 0;
                if (chars[i] == chars[j]) {
                    t++;
                    System.out.println(chars[i]+(t-1));
                }
            }
        }
    }
}
