package multithreading;

/**
 * Created by lixuanyu
 * on 2017/5/8.
 */
public class Test implements Runnable{
    public static void main(String[] args) {
        //进程 process   线程 thread
        Test test = new Test();
        Thread thread = new Thread(test);
        thread.start();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

//    private static void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
}
