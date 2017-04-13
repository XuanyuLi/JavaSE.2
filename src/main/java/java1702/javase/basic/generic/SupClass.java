package java1702.javase.basic.generic;

/**
 * Created by lixuanyu
 * on 2017/4/13.
 */
public class SupClass<T> {
    public static void main(String[] args) {
        SupClass<String> stringSupClass = new SupClass<>();

    }
}

class SubClass extends SupClass {

}
