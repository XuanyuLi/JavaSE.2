package collection;
/**
 * Created by lixuanyu
 * on 2017/3/30.
 */
//使用数组模拟一个向量，实现向量的add(void),remove(String,返回的是被删除的元素）,get（String）,set（String）
// ,size（int),capacity(int)
public class ArrayVector {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
//    private String[] strings2;
    private int size;

    public ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
    }

    public ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
    }
    public void add(String string) {
        strings[size] = string;
        size++;
        if (size>10) {

        }
    }

    public String get(int index) {
        return strings[index];
    }


    public static void main(String[] args) {
        ArrayVector arrayVector = new ArrayVector();
        arrayVector.add("hello");
        arrayVector.add("hi");
        System.out.println(arrayVector.get(0));
        System.out.println(arrayVector.get(1));
    }
}
