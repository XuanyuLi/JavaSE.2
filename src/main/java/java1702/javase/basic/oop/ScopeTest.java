package java1702.javase.basic.oop;

/**
 * Created by lixuanyu
 * on 2017/3/24.
 */
public class ScopeTest {
    private int i;
    public void method() {
        i = 0;
        int j = 1;
        System.out.println(j);
        for (int k = 0; k < 10; k++) {

        }
        for (int k = 0; k < 10; k++) {

        }
    }

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        scopeTest.method();

    }

    public void exceptionTest() {
        try {
            String s = "hello...";
        } catch (Exception e) {

        }finally {
//            s = "hi...";
        }
    }

}
//类作用域范围，类的起始，域和方法；块作用域范围，从变量声明之处到当前块结束之处，方法的局部变量，方法的参数，循环的变量。
//方法内的局部变量可以覆盖同名的域。