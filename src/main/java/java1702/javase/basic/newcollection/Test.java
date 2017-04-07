package java1702.javase.basic.newcollection;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
//求矩阵的主对角线和以及副对角线的积，由控制台输入矩阵
public class Test {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println("input int:"); // ?
                ints[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += ints[i][j];
                }
                if (i + j == ints.length - 1) { // ?
                    mul *= ints[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(ints));
        System.out.println(sum);
        System.out.println(mul);
    }
}
