package java1702.javase.basic.newoop;

/**
 * Created by lixuanyu
 * on 2017/4/7.
 */
//创建了四个对象，三个地址，changeReference方法并没有改变对象f的指向，只是把a对象的指向由原来的值"f"改变为值"b"
//本质上还是值传递（传递的是对象的地址的值→特殊的值）
public class Main {
    public static void main(String[] args) {
        Foo f = new Foo("f");
        System.out.println(f.getS()); // "f"
        changeReference(f);
        modifyReference(f);
        System.out.println(f.getS()); // "f"
    }
    private static void changeReference(Foo a) {
        System.out.println(a.getS()); // "f"
        Foo b = new Foo("b");
        a = b;
    }
    private static void modifyReference(Foo c) {
        c.setAttribute("c");
    }
}

class Foo {
    private String s;

    public Foo(String s) {
        this.s = s;
    }

    public void setAttribute(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}

