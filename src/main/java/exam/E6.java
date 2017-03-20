package exam;

/**
 * Created by Administrator on 2017/3/18.
 */
public class E6 {

}

class Person {
    String name;
    char gender;
    int old;

     Person(String name, char gender, int old) {
        this.name = name;
        this.gender = gender;
        this.old = old;
    }

//     Person() {
//    }

     String getName() {
        return name;
    }

     char getGender() {
        return gender;
    }

     int getOld() {
        return old;
    }
}

class Student extends Person {
    String number;

     Student(String name, char gender, int old, String number) {
        super(name, gender, old);
        this.number = number;
    }

//     Student(String number) {
//        this.number = number;
//    }

     String getNumber() {
        return number;
    }
}

class Test {
    public static void main(String[] args) {
        String s1;
        String s2;
        Student student = new Student("Tom", 'M', 25, "19936666");
        s1 = student.getName() + "  " + student.getGender() + "  " + student.getOld() + "  " + student.getNumber();
        System.out.println("s1 :" + s1);
        Student student1 = new Student("Lucy", 'F', 24, "19938888");
        s2 = student1.getName() + "  " + student1.getGender() + "  " + student1.getOld() + "  " + student1.getNumber();
        System.out.println("s2 :" + s2);


    }
}
