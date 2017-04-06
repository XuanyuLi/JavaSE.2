package java1702.javase.basic.pdf;

import java.util.Arrays;

/**
 * Created by lixuanyu
 * on 2017/4/6.
 */
public class CopyTest {
    public static void main(String[] args) {
        int[] ints = new int[]{11,22,33};
        int[] ints1 = Arrays.copyOf(ints,10);
        for (int anInts1 : ints1) {
            System.out.print(anInts1 + "\t");
        }
    }
}
