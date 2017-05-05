package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

/**
 * Created by lixuanyu
 * on 2017/5/3.
 */
class Animal {
    private double weight;
    public int age;

    public Animal() {
    }

    public Animal(double weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Human extends Animal {
    private boolean married;
    public String name;

    public Human() {

    }

//    public Human(double weight, int age) {
//        super(weight, age);
//    }
}

class Test {
//    public static void main(String[] args) throws NoSuchMethodException {
//        Human human = new Human();
//        Class clazz = human.getClass();
//        Field[] fields = clazz.getFields();
//        System.out.println("--------");
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
//        Field[] fields1 = clazz.getDeclaredFields();
//        System.out.println("---getDeclaredFields()");
//        for (Field field : fields1) {
//            System.out.println(field.getName());
//        }
//    }
    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = Human.class;

        Constructor[] constructors = clazz.getConstructors();
        System.out.println("-- getConstructors() ---");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t" + parameter);
            }
        }

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("-- getDeclaredConstructors() ---");
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t" + parameter.getName());
            }
        }

        Constructor constructor = clazz.getDeclaredConstructor(int.class, double.class, String.class, boolean.class);
        System.out.println(constructor.getName());
        for (Parameter parameter : constructor.getParameters()) {
            System.out.println(parameter);
        }
    }
}
