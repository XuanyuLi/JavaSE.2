package java1702.javase.basic.exercise;

/**
 * Created by Administrator on 2017/3/16.
 */
public class E4 {
    public static void main(String[] args) {
        E4 e4 = new E4();
        e4.get(15);
    }
    public void get(int n) {
        for (int i = 2; i < n+1 ; i++) {
            if (n%i==0) {
                if (i==n) {
                    System.out.println(i);
                }
            } else {
                System.out.println(n + "=");
                get(n/i);
            }
            break;
        }

    }
}
