package java1702.javase.basic.exception;

/**
 * Created by lixuanyu
 * on 2017/4/17.
 */
public class CatchTest {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);//Exception in thread "main" java.lang.ArithmeticException:
            System.out.println(123);
        } catch (Exception e) {
            e.printStackTrace();//java.lang.ArithmeticException:
        }
        System.out.println("test");
    }
}
