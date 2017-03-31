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
    private int capcity;
    private int size;

    public ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
        capcity = DEFAULT_CAPACITY;
    }

    public ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
        capcity = initialCapacity;
    }
    public void add(String string) {
        if (size == capcity) {
            String[] newStrings = new String[capcity*2];
            capcity *=2;
            System.arraycopy(strings,0,newStrings,0,strings.length);
            strings = newStrings;
        }
        strings[size] = string;
        size++;

    }

    public void remove(int index) {

    }

    public String get(int index) {
        if (index >= size) { // Exception
            System.out.println("error.");
            System.exit(0);
        }
        return strings[index];
    }


    public int size() {
        return size;
    }



    public static void main(String[] args) {
        ArrayVector arrayVector = new ArrayVector();
        arrayVector.add("hello");
        arrayVector.add("hi");
        System.out.println(arrayVector.get(0));
        System.out.println(arrayVector.get(1));
        System.out.println(arrayVector.capcity);
    }
}
