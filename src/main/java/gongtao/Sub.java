package gongtao;

/**
 * Created by lixuanyu
 * on 2017/3/20.
 */
public class Sub extends Super{

    public Sub(int i, boolean b) {
        super(i, b);
    }

    public static void main(String[] args) {
        Sub sub = new Sub(2,true);
        sub.method();
        System.out.println(sub.b);
    }

}
