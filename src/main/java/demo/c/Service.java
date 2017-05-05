package demo.c;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by lixuanyu
 * on 2017/5/5.
 */
public class Service {
    public void writer() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/demo/c/config.properties"));
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        try {
            Class clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod(methodName);
            Constructor constructor = clazz.getDeclaredConstructor();
            method.invoke(constructor.newInstance());
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }

}
