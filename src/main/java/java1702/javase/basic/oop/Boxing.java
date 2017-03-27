package java1702.javase.basic.oop;

/**
 * Created by lixuanyu
 * on 2017/3/27.
 */
public class Boxing {
    public static void main(String[] args) {
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;

        }
        System.out.println("total time" + (System.currentTimeMillis() - start)/1000 + "s");
        System.out.println("sum" + sum);
    }
}
