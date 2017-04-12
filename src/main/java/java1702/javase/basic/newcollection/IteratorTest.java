package java1702.javase.basic.newcollection;

import java.util.*;

/**
 * Created by lixuanyu
 * on 2017/4/12.
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        TreeSet<String> set = new TreeSet<>();
        set.add("a");
        set.add("b");
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            System.out.println(next);
        }
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"abc");
        hashMap.put(10,"abcd");
        hashMap.put(100,"abcde");
        Iterator<Integer> iterator2 = hashMap.keySet().iterator();
        while (iterator2.hasNext()) {
            int key = iterator2.next();
            System.out.println(key + "→" + hashMap.get(key));
        }


    }
}
