package java1702.javase.basic.exercise;

/**
 * Created by Administrator on 2017/3/8.
 */
public class E2 {
    public static void main(String[] args) {
        int i;
        int j;
        for ( i = 101; i <= 200 ; i++) {
            for (  j = 2; j < i ; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.println(i);
            }
        }
    }
}
