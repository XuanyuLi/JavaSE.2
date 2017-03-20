package java1702.javase.basic.exercise;

/**
 * Created by Administrator on 2017/3/16.
 */
public class E22 {
    public long jiecheng(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i*jiecheng(i-1);
        }
    }

    public static void main(String[] args) {
        E22 e22 = new E22();
        long sum = 0;
        for (int i = 1; i <21 ; i++) {
            sum += e22.jiecheng(i);
        }
        System.out.println(sum);
    }
}
