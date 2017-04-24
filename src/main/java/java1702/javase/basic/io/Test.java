package java1702.javase.basic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lixuanyu
 * on 2017/4/22.
 */
public class Test {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("abc");
            int i;
            if ((i = inputStream.read()) != -1) {
                inputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
