package java1702.javase.basic.newcollection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixuanyu
 * on 2017/4/12.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"acd");
        hashMap.put(1000,"acd");
        hashMap.put(1,"acd");
        hashMap.put(100,"abcd");
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(100));
        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer);
        }
        for (String s : hashMap.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashMap.entrySet()) {
            System.out.println(integerStringEntry);
        }
    }
}
//Map 无序，键值对，键不可重复
