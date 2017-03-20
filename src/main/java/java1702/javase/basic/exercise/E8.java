package java1702.javase.basic.exercise;

/**
 * Created by Administrator on 2017/3/17.
 */
public class E8 {
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        int sum = 0;
        int x = 0;
        for (int i = 0; i < 5; i++) {
            int y = 1;
            for (int j = 0; j < i ; j++) {
                y*=10;
            }
            x += a*y;
            sum+=x;
        }
        System.out.println(sum);
        E8 e8 = new E8();
        e8.method();
    }

    public void method() {
        System.out.println("abc...");
    }

}
