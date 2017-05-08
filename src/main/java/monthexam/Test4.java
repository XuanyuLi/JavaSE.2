package monthexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by lixuanyu
 * on 2017/5/6.
 */
public class Test4 {
    public static void main(String[] args) {
        Class clazz = String.class;
        Field[] field = clazz.getFields();
        Method[] method = clazz.getMethods();
        Constructor[] constructors = clazz.getConstructors();
        for (Field field1 : field) {
            System.out.println(field1);
        }
        for (Method method1 : method) {
            System.out.println(method1);
        }
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
