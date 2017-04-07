package java1702.javase.basic.newcollection;

import java.util.Arrays;

/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
public class StringTest {
    public static void main(String[] args) {
//        StringTest stringTest = new StringTest();

        String s = "hello";
        String s1 = "hi";
//        char[] chars1 = {'a','b','c','d','e'};
//        String s1 = new String(bytes,1);//deprecated 弃用
//        System.out.println("hello".charAt(1));
        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(1));
        System.out.println(s.codePointBefore(4));//返回指定索引之前的一个字符对应的Unicode值
        System.out.println(s.codePointCount(0,3));
        System.out.println(s.compareTo(s1));
        System.out.println(String.format(s, 10));//?
        System.out.println(Arrays.toString(s.getBytes()));
//        System.out.println(s.getChars(0,3,chars1,2));
        System.out.println(s.concat(" boy"));
        System.out.println(s.indexOf("l"));
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.length());
        System.out.println(s.matches("hello"));
        System.out.println(s.replace('o',' '));
        System.out.println(s.replaceAll("hell","phot"));
        System.out.println(s.replaceFirst("l","a"));
        System.out.println(Arrays.toString(s.split("l")));
        System.out.println(Arrays.toString(s.split("l",3)));
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(String.valueOf(new char[]{'a','b','c'}));
    }
}
//GC 机制，垃圾回收机制，对于没有对象的字符串进行回收
/*String Pool 字符串池
    "test..."

 */
