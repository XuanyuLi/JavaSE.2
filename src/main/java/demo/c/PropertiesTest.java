package demo.c;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by lixuanyu
 * on 2017/5/5.
 */
//properties  属性
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/demo/c/config.properties"));
        System.out.println(properties.getProperty("k"));
    }
}
