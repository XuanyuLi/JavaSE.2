package exam4;

/**
 * Created by lixuanyu
 * on 2017/5/13.
 */
/*7. 编写一个程序，开启3个线程，这3个线程的 Name 分别为 A、B、C，每个线程将自己的 Name 在屏幕上打印10遍，要求输出结果必须按
ABC 的顺序显示；如：ABCABC….依次递推*/
public class Test7 implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Test7());
        thread1.setName("A");
        Thread thread2 = new Thread(new Test7());
        thread2.setName("B");
        Thread thread3 = new Thread(new Test7());
        thread3.setName("C");
        for (int i = 0; i < 10; i++) {
        thread1.start();
        thread2.start();
        thread3.start();

        }
    }

    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());

    }
}
