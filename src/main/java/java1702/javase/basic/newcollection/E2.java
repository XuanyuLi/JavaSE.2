package java1702.javase.basic.newcollection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixuanyu
 * on 2017/4/12.
 */
public class E2 {
    public static void main(String[] args) {
        HashMap<String,Double> hashMap = new HashMap<>();
        hashMap.put("Tom",2000.0);
        hashMap.put("Lucy",800.0);
        hashMap.put("Jack",700.0);
        hashMap.put("Jackson",2000.0);
        hashMap.put("Tiw",2000.0);
        for (String s : hashMap.keySet()) {
            System.out.println(s);
        }
        hashMap.remove("Tom");
        for (Map.Entry<String, Double> stringDoubleEntry : hashMap.entrySet()) {
            System.out.println(stringDoubleEntry);
        }
        System.out.println(hashMap.get("Jackson"));
        for (Double aDouble : hashMap.values()) {
            if (aDouble < 1000.0) {
                aDouble = aDouble*1.2;
            }
            System.out.println(aDouble);
        }
    }
}

