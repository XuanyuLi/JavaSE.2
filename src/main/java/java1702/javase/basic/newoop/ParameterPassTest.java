package java1702.javase.basic.newoop;

/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
public class ParameterPassTest {
    private static void test(int i) {
        System.out.println("b:" + i);
        i++;
        System.out.println("c:" + i);
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a:" + i);
        test(i);//实际参数
        System.out.println("d:" + i);//输出结果为0，方法的参数属于基本数据类型，方法中的改变不影响实际参数
    }
}
