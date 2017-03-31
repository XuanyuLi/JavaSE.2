package java1702.javase.basic.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by lixuanyu
 * on 2017/3/29.
 */
//Vector 向量
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();//<>里边放的是类，可以是其他类，可以是基本数据类型的封装类，
        // 容量可以自动增大，每次扩大的是以前容量的一倍
        vector.add("hi");//元素，组件，jdk5后加入泛型
        vector.add("hello");
        vector.add("test");
        vector.add("hi");
        System.out.println(vector.get(0));
        System.out.println(vector.size());//判断当前有多少个元素，可以重复
        System.out.println(vector.remove(2));
//        for (String aVector : vector) {
//            System.out.println(aVector);
//        }
        System.out.println(vector.size());
        //capacity  容量，能力
        System.out.println(vector.capacity());
        Set<String> strings = new HashSet<>();//Set 里不能放重复的元素
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
        System.out.println(strings.size());
    }
}
