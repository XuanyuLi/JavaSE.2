package java1702.javase.basic.exception;

/**
 * Created by lixuanyu
 * on 2017/4/17.
 */
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(new int[]{1,2,3}[0]);
            System.out.println("hello".charAt(5));
            System.out.println(Integer.valueOf("123"));

        } catch (StringIndexOutOfBoundsException e) {
        }
        System.out.println("test...");
    }
}
