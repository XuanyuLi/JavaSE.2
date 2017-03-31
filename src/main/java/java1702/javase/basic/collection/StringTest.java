package java1702.javase.basic.collection;

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
        String s = "hello world!";
        //match 匹配,spilt 根据给定的正则拆分成字符串数组(用的比较多)
        System.out.println(s.matches("\\w+"));
        System.out.println(s.replaceAll("l","y"));
        System.out.println(s.replaceFirst("l","b"));
        String[] strings = s.split("l");//  \\s   space 空格
        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
        String s1 = "hello";
//        String s2 = "hello";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s2);
        String s2 = new String(s1);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);//比较多是地址
        String string = "test...";
        System.out.println(string);
        string = "test";
        System.out.println(string);//原来的“test...”是不可变的，变的是string的指向。gc garbage java1702.javase.basic.collection 垃圾回收机制  memory leak 内存泄漏（C语言）
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
//String pool  字符串池  immutable 不可变的   C语言的两大难点，指针（pointer）和内存泄漏
