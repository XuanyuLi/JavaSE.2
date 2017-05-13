package exam4;

/**
 * Created by lixuanyu
 * on 2017/5/13.
 */
//5. 使用 wait 方法实现一次阻塞
public class Test5 implements Runnable {
    private static Sync sync = new Sync();
    public static void main(String[] args){
        Test5 test5 = new Test5();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(test5,"thread" + i);
            thread.start();
        }

    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().endsWith("5")) {
            sync.notifyTest();
            return;
        }
        sync.waitTest();
    }
}

class Sync {
    synchronized void waitTest() {
        System.out.println(Thread.currentThread().getName() + " wait start...");
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " wait end...");
    }

    synchronized void notifyTest() {
        System.out.println(Thread.currentThread().getName() + " notify start... ");
        this.notify();
        System.out.println(Thread.currentThread().getName() + " notify end...");
    }
}
