package collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by lixuanyu
 * on 2017/3/29.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        hashtable.put(1,"hi...");
        hashtable.put(2,"hello...");
        hashtable.put(3,"hello...");
        hashtable.put(3,"hi");
        System.out.println(hashtable.size());
        System.out.println(hashtable);
        System.out.println(hashtable.get(2));
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "->" + hashtable.get(integer));//哈希表的输出是无序的,keySet 获取键
            //values 获取值，entrySet 既能获取键又能获取值
        }
        System.out.println("--------------------");
        for (String s : hashtable.values()) {
            System.out.println(s);
        }
        System.out.println("---------------------");
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "->" + integerStringEntry.getValue());
        }
    }
}
