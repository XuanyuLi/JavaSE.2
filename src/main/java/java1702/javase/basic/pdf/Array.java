package java1702.javase.basic.pdf;

/**
 * Created by lixuanyu
 * on 2017/4/6.
 */
public class Array {
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        int[][] ints1 = new int[ints.length][ints.length];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints1[j][i] = ints[i][j];
                System.out.print(ints1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
