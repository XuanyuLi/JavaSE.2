package exam;

import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/8.
 */
//接受用户输入的一个字符串，将其每个字节的数据相加求和输出
public class Month1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String strings = scanner.nextLine();
        byte[] bytes = strings.getBytes();
        int sum = 0;
        for (byte aByte : bytes) {
            sum += aByte;
        }
        System.out.println(sum);
    }
}
