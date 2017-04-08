package java1702.javase.basic.newcollection;

import java.util.Vector;

/**
 * Created by lixuanyu
 * on 2017/4/8.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        for (int i = 0; i < 100; i++) {
            strings.add("hello");
        }
        System.out.println(strings.add("hi"));
        strings.remove(99);
        strings.set(99,"test");
        System.out.println(strings.get(99));
        System.out.println(strings.size());
        System.out.println(strings.get(1));
        System.out.println(strings.capacity());
        System.out.println(strings.size());
    }
}
