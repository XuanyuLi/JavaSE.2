package collection;

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
        Vector<String> vector = new Vector<>();
        vector.add("hi");//元素，组件，jdk5后加入泛型
        vector.add("hello");
        vector.add("test");
        vector.add("hi");
        System.out.println(vector.get(0));
        System.out.println(vector.size());//判断当前有多少个元素，可以重复
        for (String aVector : vector) {
            System.out.println(aVector);
        }
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
