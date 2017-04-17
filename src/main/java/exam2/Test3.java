package exam2;

import java.util.Arrays;

/**
 * Created by lixuanyu
 * on 2017/4/15.
 */
/*
拆分字符串，字符串中含有逗号和数字，对数字排序并输出
例如：String s0=”123,45,25,85”;
输出：25 45 85 123
*/
public class Test3 {
    public static void main(String[] args) {
        String s = "123,45,25,85";
        String[] strings = s.split(",");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
