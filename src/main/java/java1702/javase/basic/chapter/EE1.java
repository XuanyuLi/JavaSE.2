package java1702.javase.basic.chapter;


import java.util.Random;
import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/3/21.
 */
//猜数字1.生成一个随机数，10000,100小了，1000小，100000大了。统计用户一共试了多少次
public class EE1 {
    private static int x;
    private static int counter;

    public static void main(String[] args) {
        Random random = new Random();
        x = random.nextInt();
        System.out.println(x);
         guess();

    }
    private static void guess() {
        System.out.println("请输入一个数");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (y > x) {
            System.out.println("大了");
            counter++;
            guess();
        } else if (y<x){
            System.out.println("小了");
            counter++;
            guess();
        } else{
            System.out.println("猜对了");
            counter++;
            System.out.println(counter);
        }
    }
}
