package java1702.javase.basic.newcollection;

import java.util.Arrays;

/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
public class _2DArray {
    public static void main(String[] args) {
        String[][] strings = new String[3][5];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = Math.pow(i,j) +" ";
            }
        }
        int[] ints = {1,2,4,5,6};
        System.out.println(strings[strings.length-1][strings[strings.length-1].length-1]);
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
