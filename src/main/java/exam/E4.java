package exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/18.
 */
public class E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入摄氏温度C");
        double c = scanner.nextDouble();
        double f = (9/5)*c+32;
        System.out.println("华氏温度F为" + f);
    }
}
