package java1702.javase.basic.pdf;

import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/6.
 */
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入员工编号：");
        String string = scanner.nextLine();
        switch (string) {
            case "abc":
                System.out.println(string + "员工在维护部门");
                break;
        }

    }
}
