package java1702.javase.basic.oop;

/**
 * Created by Administrator on 2017/3/17.
 */
public class E6 {
    String color;
    String type;

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
        System.out.println(car.type);
    }

}

class Car {
     String color = "红色";
     String type = "BMW";
}
