package exam3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixuanyu
 * on 2017/4/22.
 */
/*编写一个程序,将Fibonacii数列的前20项写入一个随机访问文件raf.txt
然后从该文件中读出第2、4、6等偶数位置上的项并将它们依次写入另一个文件output.txt*/
public class E5 {
    private static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("raf.txt","rw");//?
            for (int i = 0; i < 20; i++) {
                randomAccessFile.writeInt(fibonacci(i+1));
            }
            randomAccessFile.seek(0);
            for (int i = 0; i < 10; i++) {
                randomAccessFile.readInt();
                try (RandomAccessFile file = new RandomAccessFile("output.txt", "rw")) {
                    int r = randomAccessFile.readInt();
                    System.out.println(r);
                    file.writeInt(r);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
