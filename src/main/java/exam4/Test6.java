package exam4;

/**
 * Created by lixuanyu
 * on 2017/5/13.
 */
//6. 编写一个程序，子线程循环 10 次，接着主线程循环 100 次，接着又回到子线程循环 10 次，接着再回到主线程又循环 100 次，如此循环
//50次
public class Test6 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test6());
        thread.start();
        for (int i = 0; i < 500; i++) {
            System.out.println("Main thread is running...");
            if (i % 100 == 0) {
                Thread.yield();
            }
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println( "Son is running...");
            if (i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}
