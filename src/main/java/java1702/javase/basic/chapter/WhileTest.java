package java1702.javase.basic.chapter;

/**
 * Created by Administrator on 2017/3/10.
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i<10);
        System.out.println("------------");
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        System.out.println("----------------");
        while (i < 20) {
            System.out.println(i);
            i++;
        }
    }
}
