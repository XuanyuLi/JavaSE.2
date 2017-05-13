package exam4;

/**
 * Created by lixuanyu
 * on 2017/5/13.
 */
//1. 使用 Thread 类实现多线程
public class Test1 extends Thread{

    public static void main(String[] args) {
        Thread thread = new Thread(new Test1());
        thread.start();
        System.out.println("Test is start...");
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is start...");
    }
}
