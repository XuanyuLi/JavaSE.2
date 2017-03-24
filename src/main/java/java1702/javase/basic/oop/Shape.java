package java1702.javase.basic.oop;
/**
 * Created by lixuanyu
 * on 2017/3/21.
 */
public interface Shape {
    double getPerimeter();
    double getArea();
}

class CircleTest implements Shape {
    private double radius;
    private double pi = 3.14;

    public CircleTest(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;//Math.pow(radius,2)
    }

    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest(6);
        System.out.println(circleTest.getArea());
        System.out.println(circleTest.getPerimeter());
    }
}

class Triangle implements Shape {
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return (s * Math.sqrt((s - a) * (s - b) * (s - c)));//海伦-秦九韶公式
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

