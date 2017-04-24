package exam3;

import javax.swing.plaf.metal.MetalIconFactory;
import java.io.*;
import java.util.Random;

/**
 * Created by lixuanyu
 * on 2017/4/22.
 */
/*编写一个程序实现以下功能:
(1)产生5000个1~9999之间的随机整数,将其存入文本文件a.txt中
(2)从文件中读取这5000个整数,并计算其最大值、最小值和平均值并输出结果。*/
public class E4 {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("txt","rw");
            Random random = new Random();
            byte[] bytes = new byte[5000];
            for (int i = 0; i < 5000; i++) {
                randomAccessFile.writeInt(random.nextInt(9999));
//                randomAccessFile.read(bytes,0,5000);

            }
            Reader reader = new FileReader("txt");
            int i;
            if ((i = reader.read()) != -1) {
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
