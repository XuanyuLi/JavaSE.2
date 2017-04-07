package java1702.javase.basic.newcollection;

/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
public class ArrayTest {
    public static void main(String[] args) {//arguments 参数
        int[] ints = new int[10];//在内存中开辟一块存放十个整数的区域
        System.out.println(ints[ints.length-1]);//输出最后一个元素
        for (int i = 0; i < 10; i++) {
            ints[i] = i;
            System.out.println(ints[i]);
        }
        System.out.println("-----------------");
        for (int i = 0; i < ints.length; i++) {//itar = iterate array 相对来说比上边的for循环好,相比foreach循环来说，
            //可以具体输出某一个索引对应的值，foreach循环做不到
            int anInt = ints[i];
            System.out.println(anInt);
//            System.out.println(ints[i]);
        }
        System.out.println(ints.length);
        System.out.println("------------------");
        for (int anInt : ints) {//foreach循环，也叫增强for循环,JDK1.5以后增加的
            System.out.println(anInt);
        }
        String[] strings = {"Jan","Feb","Mar"};
        System.out.println(strings.length);
    }
}
