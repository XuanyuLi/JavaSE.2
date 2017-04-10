package java1702.javase.basic.newcollection;

import javax.xml.ws.spi.http.HttpHandler;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by lixuanyu
 * on 2017/4/10.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable();
        hashtable.put(1,"a");
        hashtable.put(100,"b");
//        hashtable.remove(100);
//        hashtable.clear();
        System.out.println(hashtable.size());
        System.out.println(hashtable.get(100));
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "→" + hashtable.get(integer));
        }
        for (String s : hashtable.values()) {
            System.out.println(s);
        }
        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "→" + integerStringEntry.getValue());
        }
    }
}
