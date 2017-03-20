package java1702.javase.basic.oop;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/15.
 */
public class Oop2 {
    private int length;
    private int width;
    private int height;

    public Oop2(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Oop2() {
    }

    public int volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长");
        length = scanner.nextInt();
        System.out.println("请输入宽");
        width = scanner.nextInt();
        System.out.println("请输入高");
        height = scanner.nextInt();

        return length*width*height;
    }

    public static void main(String[] args) {
//        java1702.javase.basic.oop.Oop2 oop2 = new java1702.javase.basic.oop.Oop2(2,2,2);
//        System.out.println(oop2.volume());
        Oop2 oop2 = new Oop2();
        System.out.println("体积是" + oop2.volume());
    }
}
