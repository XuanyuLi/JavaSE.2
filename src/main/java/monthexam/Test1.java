package monthexam;

import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/5/6.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int score = scanner.nextInt();
        if (score >= 90 & score <= 100) {
            score = 1;
        } else if (score >= 80 & score < 90){
            score = 2;
        } else if (score >= 70 & score < 80) {
            score = 3;
        } else if (score >= 60 & score < 70) {
            score = 4;
        } else if (score >= 0 & score < 60) {
            score = 5;
        } else {
            System.out.println("成绩输入有误");
        }
        switch (score) {
            case (1):
                System.out.println("优秀");
                break;
            case (2):
                System.out.println("良好");
                break;
            case (3):
                System.out.println("中等");
                break;
            case (4):
                System.out.println("及格");
                break;
        }
    }
}
