package java1702.javase.basic.newcollection;

/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
public class StringBufferTest {
    private static final String S = "123";
    public static void main(String[] args) {
        //buffer 缓冲区
//        String s = "hello";
//        StringBuffer stringBuffer = new StringBuffer(s);
//        String s1 = stringBuffer.toString();
        String s = "";
        StringBuffer stringBuffer = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
//            s+=S;
            stringBuffer.append(S);
        }
        System.out.println(System.currentTimeMillis() - start);
//        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }
}
//字符串类具有不可变性，在一个类中如果存在反复出现的字符串，建议使用字符串缓冲区
