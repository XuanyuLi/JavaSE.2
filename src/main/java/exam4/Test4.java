package exam4;

/**
 * Created by lixuanyu
 * on 2017/5/13.
 */
//4. 使用 join 方法实现一次阻塞
public class Test4 implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Test4());
        thread1.start();
        Thread thread2 = new Thread(new Test4());
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test4 is start...");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is join...");
    }
}
