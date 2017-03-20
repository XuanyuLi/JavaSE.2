package java1702.javase.basic.polymorphism;

/**
 * Created by Administrator on 2017/3/17.
 */
public class DynamicPolymorphism {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.method();
        SubClass subClass = new SubClass();
        subClass.method();
    }
}

class SuperClass {
    public void method() {
        System.out.println("method in super class...");
    }
}

class SubClass extends SuperClass {
    public void method() {
        System.out.println("method in sub class...");//动态多样性，在父类和子类中存在同名方法，重写(overwrite)，覆盖 (override),返回类型也必须一样
    }
}

class SubClass2 extends SubClass {
    @Override
    public void method() {
        super.method();
    }
}
//FQN - Full Qualified Name 全限定名
//common sense 常理
