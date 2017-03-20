package java1702.javase.basic.oop;

/**
 * Created by Administrator on 2017/3/17.
 */
public class E5 {
    public static void main(String[] args) {
        Student student = new Student("2", "Tom", 99);
        System.out.println(student.getNumber());
        student.setGrade(66);
        System.out.println(student.getGrade());

    }
}

class Student {
    private String number;
    private String name;
    private int grade;

    public Student(String number, String name, int grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
