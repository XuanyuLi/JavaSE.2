package java1702.javase.basic.oop;

/**
 * Created by lixuanyu
 * on 2017/3/24.
 */
//值传递
public class PrimitiveTest {
    private String s;
    private static void method(PrimitiveTest primitiveTest) {
        System.out.println("b:" + primitiveTest.s);
        primitiveTest.s = "hello";
        System.out.println("c:" + primitiveTest.s);

    }
    public static void main(String[] args) {
        PrimitiveTest primitiveTest = new PrimitiveTest();
        primitiveTest.s = "hi";
        System.out.println("a:" + primitiveTest.s);
        method(primitiveTest);
        System.out.println("d:" + primitiveTest.s);
    }
}
//git 版本控制软件，github 托管代码的网站（gitlab,bitbucket)
