package java1702.javase.basic.chapter;

import javafx.scene.media.SubtitleTrack;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/10.
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input A B C D：");
        String s = scanner.nextLine();
//        System.out.println(s);
        switch (s) {
            case "A":
                System.out.println("[90,100]");
                break;
            case "B":
                System.out.println("[80,90]");
                break;
            case "C":
                System.out.println("[60,80]");
                break;
            case "D":
                System.out.println("[0,60]");
                break;
            default:
                System.out.println("输入错误");   //alt +4 快速跳转到运行结果框
                break;

        }
    }
}
