package java1702.javase.basic.newcollection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by lixuanyu
 * on 2017/4/11.
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i + " ");
            linkedList.add(i + " ");

        }
        long time1 = System.currentTimeMillis();
        System.out.println(arrayList.get(50000));
        long time2 = System.currentTimeMillis();
        System.out.println(linkedList.get(50000));
        long time3 = System.currentTimeMillis();
        System.out.println(time2 - time1);
        System.out.println(time3 - time2);
    }
}
