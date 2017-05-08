package monthexam;

/**
 * Created by lixuanyu
 * on 2017/5/6.
 */
public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.method(6,6,6);
        test2.method(8,8);
    }
    private void method(int i ,int j) {
        System.out.println(i * j);
    }
    private void method(int i ,int j ,int k) {
        System.out.println(i * j * k);
    }
}
