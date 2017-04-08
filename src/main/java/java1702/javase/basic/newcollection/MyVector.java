package java1702.javase.basic.newcollection;

/**
 * Created by lixuanyu
 * on 2017/4/8.
 */
public class MyVector {
    private String[] strings;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public MyVector() {
        strings = new String[DEFAULT_CAPACITY];
    }

    public void add(String element) {
        strings[size++] = element;

    }

    public int size() {
        return size;
    }

    public String get(int index) {
//        if (index >= size||index<0) {
//            System.out.println("error.");
//            System.exit(0);
//
//        }
        return strings[index];

    }


    public static void main(String[] args) {
        MyVector myVector = new MyVector();
        myVector.add("hello");
        System.out.println(myVector.size());
        System.out.println(myVector.get(9));

    }
}
