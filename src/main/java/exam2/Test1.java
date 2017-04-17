package exam2;

import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/15.
 */
/*输入字符串长度len1，字符串s1，字符串长度len2，字符串s2。从后向前比较，以最短字符串为标准，输出不同的元素的个数。
例如:
        输入：s1=”1,3,5” len1=3 s2=”2,4,1,7,5” len2=5
        输出：1*/
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入是s1：");
        String s1 = scanner.nextLine();
        char[] char1 = s1.toCharArray();
        System.out.println("请输入len1:");
        int len1 = scanner.nextInt();
        char[] chars2 = new char[len1];
        for (int i = 0; i < len1; i++) {
            chars2[i] = char1[len1-i-1];
        }//忘了逆序输出是哪个方法，所以做了逆序输出

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("请输入s2：");
        String s2 = scanner1.nextLine();
        char[] char3 = s2.toCharArray();
        System.out.println("请输入len2:");
        int len2 = scanner1.nextInt();
        char[] chars4 = new char[len2];
        for (int i = 0; i < len2; i++) {
            chars4[i] = char3[len2-i-1];
        }

        int m = 0;
        if (len1 >= len2) {
            for (int i = 0; i < len2; i++) {
                if (chars4[i] == chars2[i]) {
                    m++;
                }
            }
        } else {
            for (int i = 0; i < len1; i++) {
                if (chars2[i] == chars4[i]) {
                    m++;
                }
            }
        }
        System.out.println(m);
    }
}
