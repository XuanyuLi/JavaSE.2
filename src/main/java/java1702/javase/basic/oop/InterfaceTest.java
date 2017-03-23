package java1702.javase.basic.oop;

/**
 * Created by lixuanyu
 * on 2017/3/23.
 */
public interface InterfaceTest {
    int i = 1;
    void m();

}

interface A {
    void a();
}
interface B {
    void b();
}
interface C {
    void c();
}
class InterfaceTestImpl implements InterfaceTest,A,B,C {

    @Override
    public void m() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    public static void main(String[] args) {
        System.out.println(i);
    }
}

