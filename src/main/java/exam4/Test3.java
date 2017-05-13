package exam4;

/**
 * Created by lixuanyu
 * on 2017/5/13.
 */
//3. 使用 sleep 方法实现一次阻塞
public class Test3 implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test3());
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Test3 is start...");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is sleep...");
    }
}
