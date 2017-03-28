package collection;

/**
 * Created by lixuanyu
 * on 2017/3/28.
 */
public class StringTest {
    public static void main(String[] args) {
        char[] chars = {'a','b','c'};
        String s = new String(chars);
        System.out.println(s);
        for (char c : s.toCharArray()){
            System.out.println(chars);
        }
        String s1 = "Hello";//HELLO
        System.out.println(toLowerCase(s1));
        System.out.println(s1.toUpperCase());

    }

    private static String toLowerCase(String origin) {
        char[] chars = origin.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar>='A'&&aChar<='Z') {
                chars[i]+=32;//a-A = 32
            }
        }
        return new String(chars);
    }
}
