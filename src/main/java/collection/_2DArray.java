package collection;

/**
 * Created by lixuanyu
 * on 2017/3/28.
 */
public class _2DArray {
    public static void main(String[] args) {
        int[][] ints = new int[3][5];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }

       /* String[][] strings = new String[4][];
        strings[0] = new String[5];
        strings[1] = new String[2];
        strings[2] = new String[3];
        strings[3] = new String[4];不规则二维数组
*/
        double[][] doubles = {
                {1d,2d,3d,4d,5d},
                {1d}
        } ;
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                System.out.print(doubles[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
