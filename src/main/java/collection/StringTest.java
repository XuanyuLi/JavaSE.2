package collection;

import com.sun.media.sound.SoftTuning;

/**
 * Created by lixuanyu
 * on 2017/3/28.
 */
public class StringTest {
    //    public static void main(String[] args) {
//        char[] chars = {'a','b','c'};
//        String s = new String(chars);
//        System.out.println(s);
//        for (char c : s.toCharArray()){
//            System.out.println(chars);
//        }
////        String s1 = "Hello";//HELLO
////        System.out.println(toLowerCase(s1));
//        System.out.println(s.toUpperCase());
//        String s2 = "abcdefg";
//        System.out.println(s2.charAt(3));
//        System.out.println(s2.codePointAt(3));
//        System.out.println(s2.concat("hijklmn"));
//        System.out.println(s2.contains("wer"));
//        System.out.println(s2.endsWith("fg"));
//        System.out.println(s2.equals("abcdefg"));
//        System.out.println(s2.equalsIgnoreCase("ABCDEFG"));
//        System.out.println(String.format(s2, "abcd"));
//
//
//    }
    public static void main(String[] args) {
        String s = "hello";
        //match 匹配
        System.out.println(s.matches("\\w+"));
        System.out.println(s.replaceAll("l","y"));
        System.out.println(s.replaceFirst("l","b"));
    }

    private static String toLowerCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= 'A' && aChar <= 'Z') {
                chars[i] += 32;//a-A = 32
            }
        }
        return new String(chars);
    }
}
