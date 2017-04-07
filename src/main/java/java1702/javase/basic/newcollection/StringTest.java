package java1702.javase.basic.newcollection;

/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
public class StringTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        String s = "hello";
        s = "hi";
        byte[] bytes = new byte[10];
        String s1 = new String(bytes,1);//deprecated 弃用

    }
}
//GC 机制，垃圾回收机制，对于没有对象的字符串进行回收
/*String Pool 字符串池
    "test..."

 */
