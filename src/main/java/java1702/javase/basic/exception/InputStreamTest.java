package java1702.javase.basic.exception;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lixuanyu
 * on 2017/4/18.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("test");
            int i ;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println((char) inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
