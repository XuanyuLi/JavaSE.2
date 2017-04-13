package java1702.javase.basic.newcollection;

import java.util.Vector;

/**
 * Created by lixuanyu
 * on 2017/4/13.
 */
public class MyVectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("abc");
        vector.add(true);
        vector.add(123);
        for (Object o : vector) {
            System.out.println(o);
        }
    }
}
