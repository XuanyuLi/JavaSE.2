package java1702.javase.basic.newcollection;

import java.util.Vector;

/**
 * Created by lixuanyu
 * on 2017/4/8.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        System.out.println(strings.add("hello"));
        System.out.println(strings.add("hi"));
        System.out.println(strings.size());
        System.out.println(strings.get(1));
        System.out.println(strings.capacity());
        System.out.println(strings.size());
    }
}
