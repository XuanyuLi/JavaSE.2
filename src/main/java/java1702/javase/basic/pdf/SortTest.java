package java1702.javase.basic.pdf;

import java.util.Arrays;

/**
 * Created by lixuanyu
 * on 2017/4/6.
 */
public class SortTest {
    public static void main(String[] args) {
        int[] ints = new int[]{22,35,17,66,93,8,54};
        Arrays.sort(ints);
        System.out.println("升序后的数组是：");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
//java 语言中String类型数组的排序算法是根据字典编排顺序排序的，数字排在字母前面，大写字母排在小写字母前边。