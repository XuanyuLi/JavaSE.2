package java1702.javase.basic.chapter;

import com.sun.media.sound.SoftTuning;

/**
 * Created by Administrator on 2017/3/7.
 */
public class CharTest {
    public static void main(String[] args) {
        char c = '\r';
        char c1 = '\\';
        String c2 = "中";
//        System.out.println(c);
//        System.out.println(c1);
//        System.out.println(c2);
        //\d 退格  ++i  先加， i++ 后加
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1^b2);
        //&与&& ，|和||的区别，条件与，逻辑与存在短路规则，&&在第前边的条件即可判断真假时，后边的条件不再执行；！非的优先级在运算符里是最高的
        //为什么硬盘容量与实际可用有差距：计算机以1024换算，生产时按1000换算
        int i1 = 1;
        int i2 = 3;
        System.out.println(i1 >> i2);
        System.out.println(~i1);
        //>>>无符号右移运算符，>>有符号右移运算符，左移左边数字出去，右移右边数字出去
    }
}
