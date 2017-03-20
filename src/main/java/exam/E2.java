package exam;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/18.
 */
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        byte b = scanner.nextByte();
        if (b == 100 || b == -100) {
            System.out.println(b);
        }
    }
}
