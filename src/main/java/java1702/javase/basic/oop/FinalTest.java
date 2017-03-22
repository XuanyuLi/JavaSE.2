package java1702.javase.basic.oop;

/**
 * Created by lixuanyu
 * on 2017/3/21.
 */
//final可以修饰类，域，方法，修饰域是必须初始化,终态的类不能作为父类，终态的方法不能再子类中被重写和覆盖,终态修饰的域初始化之后不能被更改
public class FinalTest {
    private final int i;

    public FinalTest(int i) {
        this.i = i;
    }

    public FinalTest() {
        i= 0;
    }

    public final void method() {


    }


}

//class SubFinalTest extends FinalTest {
//
//
//}
