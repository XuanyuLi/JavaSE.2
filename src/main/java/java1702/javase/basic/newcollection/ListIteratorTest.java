package java1702.javase.basic.newcollection;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by lixuanyu
 * on 2017/4/12.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        ListIterator<String> listIterator = strings.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println(next);
        }
    }
}
