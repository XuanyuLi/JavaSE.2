package java1702.javase.basic.newcollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixuanyu
 * on 2017/4/10.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        List<String> strings1 = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        System.out.println(strings.equals(strings1));
        List<String> strings2 = new ArrayList<>(strings1.subList(0,1));
        System.out.println(strings2);


//        List<String> list = new ArrayList<>();
//        list.add("hello");
//        list.add("hi");
//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        System.out.println(list.set(1,"hello"));
//        System.out.println(list.get(1));
//        for (String s : list) {
//            System.out.println(s);
//        }
//        List<String> strings = new ArrayList<>();
    }
}
