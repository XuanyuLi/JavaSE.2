package java1702.javase.basic.collection;

/**
 * Created by lixuanyu
 * on 2017/3/29.
 */
public class StringVsStringBufferTest {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        String s = "";
        StringBuffer stringBuffer = new StringBuffer(s);
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
//            s+=ALPHABET;
            stringBuffer.append(ALPHABET);
        }
        System.out.println("time:" + (System.currentTimeMillis() - start));
//        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }

}
