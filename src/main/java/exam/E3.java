package exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/18.
 */
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的边长");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double s = (a + b + c) / 2;
        System.out.println("该三角形的周长是" + (a + b + c));
        System.out.println("该三角形的面积是" + (s * Math.sqrt((s - a) * (s - b) * (s - c))));
    }
}
