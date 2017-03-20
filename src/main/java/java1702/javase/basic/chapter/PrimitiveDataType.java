package java1702.javase.basic.chapter;

/**
 * Created by Administrator on 2017/3/7.
 */
public class PrimitiveDataType {
    public static void main(String[] args) {
        byte b = 127; /*[-128,127*/
        char c = 65535;/*[0,65535*/
        short s = 32767;/* [-32768,32767*/
        int i = 4;/*[-2147483648,2147483647*/
        long l = 50000000000L;/*[9223372036854775807,-9223372036854775808]*/
        float f = 1.5622222222222222222222222222222f;//小数点后7位有效
        double d = 3.1415926585733333333333333333333;//小数点后15位有效
        System.out.println(Long.MAX_VALUE+","+Long.MIN_VALUE);
        System.out.println(f);
//        System.out.println(d);
        //auto fix （快捷修复）:alt + enter
        //F2(寻找错误)
        //[4E00,9fbb]
        //tab  水平制表符

    }
}
