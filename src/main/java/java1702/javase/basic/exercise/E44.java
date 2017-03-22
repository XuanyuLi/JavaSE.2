package java1702.javase.basic.exercise;

/**
 * Created by lixuanyu
 * on 2017/3/21.
 */
//一个偶数总能表示为两个素数之和
public class E44 {
    public boolean isPrime(int i) {
        for (int j = 2; j < i / 2 + 1; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 20;
        E44 e44 = new E44();

        for (int i = 2; i < n - 1; i++) {
            if (e44.isPrime(i) && e44.isPrime(n - i)) {
                System.out.println(n + "=" + i + "+" + (n - 1));
            }
        }
    }
}

