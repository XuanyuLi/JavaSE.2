package exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/18.
 */
public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆球半径");
        double r = scanner.nextDouble();
        double v = (4 / 3) * Math.PI * r * r * r;
        System.out.println("球的体积是" + v);
    }
}
