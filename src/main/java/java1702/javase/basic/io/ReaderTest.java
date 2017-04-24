package java1702.javase.basic.io;
import java.io.FileReader;
import java.io.Reader;
/**
 * Created by lixuanyu
 * on 2017/4/20.
 */
public class ReaderTest {
    public static void main(String[] args) {
        try(Reader reader = new FileReader("test")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
