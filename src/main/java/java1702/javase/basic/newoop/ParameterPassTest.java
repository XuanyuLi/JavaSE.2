package java1702.javase.basic.newoop;

/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
public class ParameterPassTest {//parameter 参数
    private static void test(int i) {
        System.out.println("b:" + i);
        i++;
        System.out.println("c:" + i);
    }

    private static void stringTest(String string) {
        System.out.println("b:" + string);
        string = "goodbye";
        System.out.println("c:" + string);
    }

    private static void integerTest(Integer integer1) {
        System.out.println("b:" + integer1);
        integer1 = 888;
        System.out.println("c:" + integer1);
    }

    public static void main(String[] args) {
        String string = "good";
        int i = 0;
        Integer integer = 666;
        System.out.println("a:" + i);
        test(i);//实际参数
        System.out.println("d:" + i);//输出结果为0，方法的参数属于基本数据类型，方法中的改变不影响实际参数
        System.out.println("---------------------------");
        System.out.println("a:" + string);
        stringTest(string);
        System.out.println("d:" + string);
        System.out.println("----------------------------");
        System.out.println("a:" + integer);
        integerTest(integer);
        System.out.println("d:" + integer);
    }
}
//String类型以及基本数据类型的封装类也是值传递，方法中的改变同样不会影响到实际参数
//shift + F6 快速修改
