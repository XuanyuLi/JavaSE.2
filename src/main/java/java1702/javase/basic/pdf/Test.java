package java1702.javase.basic.pdf;

import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/5.
 */
public class Test {
    private static int i;
    public static void main(String[] args) {
        int i = 'a';
        char c = 100;
        System.out.println(i);
        System.out.println(Test.i);
        System.out.println(c);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请出入A的值：");
        int p = scanner.nextInt();
        System.out.println("请输入B的值：");
        int d = scanner.nextInt();
        p = p^d;
        d = d^p;
        p = p^d;
        System.out.println(p);
        System.out.println(d);
    }
}
//转义字符：\t制表符;  \r回车;  \n换行;  \b退格;  \f换页。
//局部变量可与成员变量的名字相同，此时成员变量将被隐藏，需要通过“类名.静态变量”调用。
//成员变量在整个类体内都有效，局部变量在方法体内有效。
