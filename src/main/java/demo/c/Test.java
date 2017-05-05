package demo.c;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by lixuanyu
 * on 2017/5/5.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Service service = new Service();
        service.writer();
    }
}
