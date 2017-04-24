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
    public static void main(String[] args) {
        long[] longs = new long[20];
        for (int i = 0; i < 20; i++) {
            if (i == 0 | i ==1) {
                longs[i] = 1;
            } else{
                longs[i] = longs[i-1] + longs[i-2];
            }
        }
        for (long aLong : longs) {
            System.out.println(aLong);
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("raf.txt","rw");//?
            Reader reader = new FileReader("raf.txt");
            Writer writer = new FileWriter("output.txt");
            int i;
            if ((i = reader.read()) != -1) {
                writer.write(i);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
