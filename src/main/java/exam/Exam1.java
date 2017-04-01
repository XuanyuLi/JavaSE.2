package exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/1.
 */
public class Exam1 {
    public static void main(String[] args) {
        int[][] ints = new int[4][4];
        int j ;
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        for ( j = 0; j < 4; j++) {
            for ( k = 0; k < 4; k++) {
                System.out.println("请输入一个数字：");
                int i = scanner.nextInt();
                ints[j][k] = i;
            }
        }

//        int sum = 0;
//        int s = 1;
//        if (j == k) {
//            sum+=ints[j][k];
//        }
//        System.out.println("主对角线之和是→" + sum);
//        if (j + k == 3) {
//            s*=ints[j][k];
//        }
//        System.out.println("副对角线之积是→" + s);
        System.out.println(Arrays.deepToString(ints));
    }
}
