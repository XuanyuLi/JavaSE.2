package java1702.javase.basic.exercise;

/**
 * Created by Administrator on 2017/3/8.
 */
//打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个“水仙花数’，因为153=1的三次方＋5的三次方＋3的三次方。
public class E3 {
    public static void main(String[] args) {
        int m,n,b,v;
        for ( int i = 1000; i<10000 ; i++) {
            v = i/1000;
            m = i/100%10;
            n = i/10%10;
            b = i%10;
            if (i == m * m * m * m + n * n * n * n + b * b * b * b + v * v * v * v) {
                System.out.println(i);
            }
        }
    }
}
