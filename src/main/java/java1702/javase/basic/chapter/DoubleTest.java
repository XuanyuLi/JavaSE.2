package java1702.javase.basic.chapter;

import java.math.BigDecimal;

/**
 * Created by lixuanyu
 * on 2017/3/21.
 */
public class DoubleTest {
    public static void main(String[] args) {
        System.out.println(1.0-0.9);//binary二进制，无法精确表示0.1；
        BigDecimal bigDecimal1 = new BigDecimal("1.0");//传入的参数必须是字符串形式
        BigDecimal bigDecimal2 = new BigDecimal("0.9");
        System.out.println(bigDecimal2.add(bigDecimal1));
    }
}
