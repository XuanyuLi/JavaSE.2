package java1702.javase.basic.newcollection;

/**
 * Created by lixuanyu
 * on 2017/4/8.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello ");
        stringBuffer.append("world");
        System.out.println(stringBuffer);
        stringBuffer.delete(5,6);//ctrl + Q 快速查看文档
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.insert(3,"ll"));//offset 偏移量
        System.out.println(stringBuffer.insert(stringBuffer.length(),"!"));
        System.out.println(stringBuffer.reverse());//reverse 逆序
        stringBuffer.reverse().setCharAt(0,'H');
        System.out.println(stringBuffer);
    }
}
