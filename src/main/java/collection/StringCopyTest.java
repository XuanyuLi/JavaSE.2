package collection;
import java.util.Arrays;

/**
 * Created by lixuanyu
 * on 2017/3/31.
 */
public class StringCopyTest {
    public static void main(String[] args) {
        int[] srcArray = {1,2,3,4,5,6};//source 源
        int[] destArray = new int[10];//destination 目的地
        System.arraycopy(srcArray,2,destArray,0,3);
        System.out.println(Arrays.toString(destArray));
        String[] strings = {"a","b","c","d","e","f","g","h","i","j"};
        System.arraycopy(strings,3,strings,2,7);
        strings[9] = null;
        System.out.println(Arrays.toString(strings));
    }
}
