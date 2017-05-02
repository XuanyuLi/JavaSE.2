package java1702.javase.basic.io;

/**
 * Created by lixuanyu
 * on 2017/5/2.
 */
public class Parent {

    {
        System.out.println("parent constructor block");
    }

    static {
        System.out.println("parent static block");
    }

    public Parent() {
        System.out.println("parent constructor");
    }
}

//class Child extends Parent {
//
//    {
//        System.out.println("child constructor block");
//    }
//
//    static {
//        System.out.println("child static block");
//    }
//
//    public Child() {
//        System.out.println("child constructor");
//    }
//}

class Test1 {
    public static void main(String[] args) {
        new Parent();
    }
}