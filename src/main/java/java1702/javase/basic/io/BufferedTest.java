package java1702.javase.basic.io;

import java.io.*;

/**
 * Created by lixuanyu
 * on 2017/4/21.
 */
public class BufferedTest {
    public static void main(String[] args) {
        try {
            try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(""));
                 BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(""))){
                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
