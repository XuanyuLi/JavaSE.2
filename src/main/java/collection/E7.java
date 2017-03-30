package collection;

import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/3/29.
 */

// 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串 :");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (char aChar : chars) {
            if ((aChar >= 'A' && aChar <= 'Z') || (aChar >= 'a' && aChar <= 'z')) {
                a++;
            } else if (aChar == ' ') {
                b++;
            } else if (aChar >= '0' && aChar <= '9') {
                c++;
            } else {
                d++;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
