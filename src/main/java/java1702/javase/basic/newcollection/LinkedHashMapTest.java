package java1702.javase.basic.newcollection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lixuanyu
 * on 2017/4/12.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hashMap = new LinkedHashMap<>();
        hashMap.put(100,"hello");
        hashMap.put(-20,"hi");
        hashMap.put(10,"hi");
        for (Map.Entry<Integer, String> integerStringEntry : hashMap.entrySet()) {
            System.out.println(integerStringEntry);
        }
    }
}
