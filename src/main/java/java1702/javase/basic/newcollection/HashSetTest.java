package java1702.javase.basic.newcollection;

import java.util.HashSet;

/**
 * Created by lixuanyu
 * on 2017/4/11.
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("test");
        strings.add("test");
        System.out.println(strings.size());
        for (String arg : args) {
            System.out.println(strings);
        }
    }
}
//Set 无序，不能重复
