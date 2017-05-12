package multithreading;

import java.util.Stack;

/**
 * Created by lixuanyu
 * on 2017/5/12.
 */
public class StackTest {//stack 堆栈LIFO Last In First Out  queue 队列FIFO
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("a");//push推
        strings.push("b");
        strings.push("c");

        System.out.println(strings.pop());//pop 流行，弹出
        System.out.println(strings.pop());
        System.out.println(strings.pop());
    }
}
