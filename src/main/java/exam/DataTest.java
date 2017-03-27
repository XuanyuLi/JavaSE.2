package exam;

/**
 * Created by lixuanyu
 * on 2017/3/25.
 */
public class DataTest {
    private static int i;

    public static void main(String[] args) {
        i = 1;
        System.out.println(i);
        DataTest dataTest = new DataTest();
        dataTest.method(2);
        i++;
        System.out.println(i);
    }

    public void method(int i) {
        i++;
        System.out.println(i);
    }
}
