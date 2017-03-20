package java1702.javase.basic.exercise;

/**
 * Created by Administrator on 2017/3/17.
 */
//求最大公约数和最小公倍数
public class E6 {
    public static void main(String[] args) {
        int m = 10;
        int n = 15;
        int min = Math.min(m, n);
        for (int i = min; i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                break;
            }

        }
    }

    public int min(int x, int y) {
        return (x >= y) ? y : x;
    }

}
