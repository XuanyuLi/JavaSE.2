package java1702.javase.basic.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixuanyu
 * on 2017/3/31.
 */
public class ListTest extends ArrayList{
    public static void main(String[] args) {
    //    Iterable 可迭代的
    //    Collection 集合
    //    Set 集合
    //    List 列表
    //    Map 映射（一个独立的接口）
//        Vector<Integer> integers = new Vector<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }//输出是有顺序的，有索引
        ArrayList<Integer> arrayList = new ArrayList<>();//无参构造初始容量为10
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList.set(1,10));
        System.out.println(arrayList);
        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.contains(0));
        arrayList.clear();
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.indexOf(1));
        ListTest listTest = new ListTest();
        for (int i = 0; i < 10; i++) {
            listTest.add(" + i");
        }
        listTest.removeRange(3,5);
        for (Object o : listTest) {
            System.out.println(o);
        }
        // array 数组\ [ə'reɪ]
        // list 列表\ [lɪst]
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hi");
        strings.add("hello");
        strings.add("hello");
        System.out.println(strings.size());
        System.out.println(strings.get(1));
        System.out.println(strings.contains("test"));
        System.out.println(strings.indexOf("hello"));
        System.out.println(strings.lastIndexOf("hello"));
//        strings.clear();
        System.out.println(strings.isEmpty());
        System.out.println(strings.remove(1));
        System.out.println(strings.set(0, "test"));
        Object[] objects = strings.toArray();
        strings.add("hello");
        System.out.println(strings.size()); // 3
        System.out.println(strings); // [test, hello, hello]
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("hello");
        strings1.add("test");
        strings.removeAll(strings1);
        System.out.println(strings.size()); // 1
        System.out.println(strings); // [test]
        List<String> strings2 = strings.subList(1,2);//包含开头不包含结尾
        System.out.println(strings2);

    }

}
