package java1702.javase.basic.oop;

/**
 * Created by lixuanyu
 * on 2017/3/22.
 */
public class StaticTest {
    private static int i;

    public static void main(String[] args) {
        ManKind tom = new ManKind();
//        tom.name = "Tom";
        tom.age = 18;
        tom.married = true;
        System.out.println(tom.married);
        System.out.println(tom.age);
        System.out.println(tom.name);
        System.out.println("----------------------");
        ManKind jerry = new ManKind();
        jerry.name = "Jerry";
//        jerry.age = 16;
        System.out.println(jerry.age);
        System.out.println(jerry.name);
//        jerry.married = true;
        System.out.println(jerry.married);
    }
}

class ManKind {
    public String name;
    public int age;
    public static boolean married;

}
//是否静态的对类成员变量进行分类可分两种：一种是被static修饰的变量，叫静态变量或类变量；
// 另一种是没有被static修饰的变量，叫实例变量