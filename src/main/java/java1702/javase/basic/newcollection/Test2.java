package java1702.javase.basic.newcollection;

import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            String s1 = aChar + "";//Character.toString(aChar);
            if (s1.toLowerCase().equals(s1)) {
                s1 = s1.toUpperCase();
                chars[i] = s1.toCharArray()[0];
            } else if (s1.toUpperCase().equals(s1)) {
                s1 = s1.toLowerCase();
                chars[i] = s1.toCharArray()[0];
            }
        }
        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;

        System.out.println(String.valueOf(chars ));
        //网慢
    }
}
