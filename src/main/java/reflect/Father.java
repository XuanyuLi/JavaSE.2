package reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by lixuanyu
 * on 2017/5/5.
 */
public class Father <C>{
}

class SonA extends Father <Doctor> {
}
class SonB extends Father <Lawyer> {
}
class SonC extends Father <Programmer> {
}
class SonD extends Father <Programmer> {
}

class Doctor {

}

class Lawyer {

}

class Programmer {

}

class SonTest {
    public static void main(String[] args) {
        SonA sonA = new SonA();
        SonB sonB = new SonB();
        SonC sonC = new SonC();
        SonD sonD = new SonD();
        Class clazz = SonA.class;
        Type type = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType)type;
        Type[] types = parameterizedType.getActualTypeArguments();
        Type t = types[0];
        Class aClass = (Class) t;
        System.out.println(aClass.getSimpleName());

    }
}

