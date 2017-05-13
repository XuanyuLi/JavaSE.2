package exam4;

/**
 * Created by lixuanyu
 * on 2017/5/13.
 */
//2. 使用 Runnable 接口实现多线程
public class Test2 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test2());
        thread.start();
        System.out.println("Test2 is start...");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is start...");
    }
}
