package java1702.javase.basic.exercise;

/**
 * Created by Administrator on 2017/3/16.
 */
public class E21 {
    public int jiecheng(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i*jiecheng(i-1);
        }
    }
    public static void main(String[] args) {

        E21 e21 = new E21();
        System.out.println(e21.jiecheng(3));
    }

}
