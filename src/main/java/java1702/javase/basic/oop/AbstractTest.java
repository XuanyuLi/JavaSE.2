package java1702.javase.basic.oop;

/**
 * Created by lixuanyu
 * on 2017/3/21.
 */
public  abstract class AbstractTest {
    private int i;

    public abstract void method();

    public void method1() {

    }
    //abstract 可以修饰类和方法，修饰方法时，方法不可以有方法体;抽象方法必须在抽象类里边;instantiated实例化，抽象的类不能被实例化
    public static void main(String[] args) {
        SubAbstractTest subAbstractTest = new SubAbstractTest();
        System.out.println(subAbstractTest);//java1702.javase.basic.oop.SubAbstractTest@74a14482
        subAbstractTest.method();
    }
}

class SubAbstractTest extends AbstractTest {

    @Override
    public void method() {
        System.out.println("in SubAbstractTest...");//implement实现，实现就是添加方法体的过程
    }

    @Override
    public void method1() {
        super.method1();
    }//覆盖
}
//什么时候使用抽象类,抽象类对其所有子类做了限制和约束

