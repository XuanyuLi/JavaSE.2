package java1702.javase.basic.polymorphism;

/**
 * Created by Administrator on 2017/3/17.
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        System.out.println(calculatorTest.add(5.0,6.0));
        System.out.println(calculatorTest.add(3,4));
    }
}

class CalculatorTest {
    public int add(int x, int y) {
        return x+y;
    }

    public float add(double a, double b) {
        return 1;//一个类的内部可以存在同名方法，和返回类型没关系，和参数类型和个数以及排列顺序有关系（同名方法的重载 overload）
    }
}
