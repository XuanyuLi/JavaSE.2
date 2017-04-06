package java1702.javase.basic.pdf;

import java.util.ArrayList;

/**
 * Created by lixuanyu
 * on 2017/4/6.
 */
public class Cycle {
    public static void main(String[] args) {
        int a = 100;
        do {
            System.out.println("Ok,a = 60");
            a--;
        }
        while (a == 60);
        String[] animal = new String[]{"狮子","老虎","大象","猴子"};
        int index = 0;
        System.out.println("动物园里有：");
        while (index < animal.length) {
            System.out.println(animal[index++]+" ");
        }
        //通过for循环在控制台输出9*9乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
//Java5以后新增了foreach循环,任何foreach循环都可以改写成for循环语句
