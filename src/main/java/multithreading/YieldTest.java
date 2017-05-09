package multithreading;

/**
 * Created by lixuanyu
 * on 2017/5/9.
 */
public class YieldTest implements Runnable{
    public static void main(String[] args) {
        //yield 屈服，放弃
        Thread thread1 = new Thread(new YieldTest());
        thread1.setName("thread1");
        Thread thread2 = new Thread(new YieldTest());
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
        System.out.println("test...");

    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ":" + Thread.currentThread().getName() + " is running...");
            if (i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}
