package java1702.javase.basic.collection;
/**
 * Created by lixuanyu
 * on 2017/3/28.
 */
public class _2DArray {
    private static final  String[] COLORS = {"A","B","C","D","E","F"};

    public static void main(String[] args) {
        int[][] ints = new int[3][5];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }

//        String[][] strings = new String[4][];
//        strings[0] = new String[5];
//        strings[1] = new String[2];
//        strings[2] = new String[3];
//        strings[3] = new String[4];

        double[][] doubles = {
                {1d,2d,3d,4d,5d},
                {1d}
        } ;
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                System.out.println(doubles[i][j] + "\t");
            }
            System.out.println();
        }
        String[][] strings = new String[10][10];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = COLORS[(int)(Math.random()*6)] ;//?why
                System.out.print(strings[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
