package exam;

import java.util.Arrays;

/**
 * Created by lixuanyu
 * on 2017/4/1.
 */
public class Exam4 {
    public static void main(String[] args) {
        int index = 0;
        int[] ints1 = {89,90,77,87,66,54,328,890,99};
        int[] ints2 = {65,72,12,77,2,96,54,27,89};
        int[] ints3 = new int[3];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (ints1[i] == ints2[j]) {
                    ints3[index] = ints1[i];
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(ints3));
    }
}
