package java1702.javase.basic.generic;

/**
 * Created by lixuanyu
 * on 2017/4/13.
 */
public class Test<T> {
    //generic 通用的，泛型
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.concat(1.2,3.5));
    }

    private String concat(T x,T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}

