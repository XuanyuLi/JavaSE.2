package java1702.javase.basic.inheritance;

/**
 * Created by Administrator on 2017/3/15.
 */
public class Venhicle {
    char color;
    double weight;
    double price;
    String name;

    public Venhicle(char color, double weight, double price, String name) {
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    public void star() {
        System.out.println("java1702.javase.basic.inheritance.Venhicle is starting...");
    }

    public void stop() {
        System.out.println("java1702.javase.basic.inheritance.Venhicle is stopped...");
    }
}

class Bicycle extends Venhicle {
    String power;

    public Bicycle(char color, double weight, double price, String name) {
        super(color, weight, price, name);
        this.power = power;
    }
    public void climb() {
        System.out.println("周末去爬山...");
    }
}

class VenhicleTest {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle('白',100,100,"五羊");

        System.out.println(bicycle.name);
        System.out.println(bicycle.power);
        bicycle.climb();
        bicycle.stop();
    }
}


