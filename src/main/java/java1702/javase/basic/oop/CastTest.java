package java1702.javase.basic.oop;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by lixuanyu
 * on 2017/3/27.
 */
public class CastTest {


    public static void main(String[] args) {
        int x = 1;
        int z = 2;
        String s = Integer.toString(x);
        System.out.println(s);
        String s1 = "123";
        int y = Integer.valueOf(s1);
        System.out.println(y);
        int y1 = Integer.parseInt(s1);
        System.out.println(y1);//parse 解析
        String s2 = " " + x;
        System.out.println(s2);

    }
}
