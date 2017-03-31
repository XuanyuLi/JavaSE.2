package java1702.javase.basic.inheritance;

/**
 * Created by Administrator on 2017/3/16.
 */
public class Father {
    int money;

    public String coding() {
        System.out.println("son");
        return "father";
    }
}


class Son extends Father {


}

class ExtendsTest {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.money);
        father.coding();
        System.out.println(father.coding());
        // coding方法没有返回值，不能输出.println 方法需要参数，各种数据类型都可以.继承是为了实现代码重用，提高软件开发效率
        //子类的对象依然是父类以及间接父类的实例
        Son son = new Son();
        System.out.println(son.money);
        son.coding();
    }
}
