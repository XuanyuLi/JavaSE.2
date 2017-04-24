package exam3;

/**
 * Created by lixuanyu
 * on 2017/4/22.
 */
/*编写一个没有处理的发生数组下标越界异常的程序*/
public class E1 {
    public static void main(String[] args) {
        String[] strings = new String[]{"one","two","three","four"};
        System.out.println(strings[5]);
    }
}
