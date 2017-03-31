package java1702.javase.basic.collection;
/**
 * Created by lixuanyu
 * on 2017/3/30.
 */
//使用数组模拟一个向量，实现向量的add(void),remove(String,返回的是被删除的元素）,get（String）,set（String）
// ,size（int),capacity(int)
public class ArrayVector {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] strings;
    private int capacity;
    private int size;

    public ArrayVector() {
        strings = new String[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public ArrayVector(int initialCapacity) {
        strings = new String[initialCapacity];
        capacity = initialCapacity;
    }
    public void add(String string) {
        if (size == capacity) {
            String[] newStrings = new String[capacity*2];
            capacity *=2;
            System.arraycopy(strings,0,newStrings,0,strings.length);
            strings = newStrings;
        }
        strings[size] = string;
        size++;

    }

    public String remove(int index) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }
        String s = strings[index];
        System.arraycopy(strings,index+1,strings,index,size-index-1);
        strings[size-1] = null;
        size--;
        return s;

    }

    public String get(int index) {
        if (index >= size) { // Exception
            System.out.println("error.");
            System.exit(0);
        }
        return strings[index];
    }

    public String set(int index,String element) {
        if (index >= size) {
            System.out.println("error.");
            System.exit(0);
        }

        String s = strings[index];
        strings[index] = element;
        return s;
    }
    public static void main(String[] args) {
        ArrayVector arrayVector = new ArrayVector();
        arrayVector.add("hello");
        arrayVector.add("red");
        arrayVector.add("yellow");
        arrayVector.add("java");
        arrayVector.remove(1);
        System.out.println(arrayVector.set(1,"world"));
        System.out.println(arrayVector.get(0));
        System.out.println(arrayVector.get(1));
        System.out.println(arrayVector.capacity);

    }
}
