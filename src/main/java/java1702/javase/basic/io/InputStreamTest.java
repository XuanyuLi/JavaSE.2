package java1702.javase.basic.io;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lixuanyu
 * on 2017/4/18.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("test");
            int i ;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println((char) inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
