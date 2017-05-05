package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by lixuanyu
 * on 2017/5/4.
 */
public class AccessibleTest {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Person person = new Person(100);
        Field age = Class.forName("reflect.Person").getDeclaredField("age");
        age.setAccessible(true);
        age.set(person,99);
        System.out.println(age.get(person));

    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

}
