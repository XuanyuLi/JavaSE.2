package java1702.javase.basic.oop;

import com.sun.media.sound.SoftTuning;

/**
 * Created by lixuanyu
 * on 2017/3/21.
 */
public abstract class Shape {
    public abstract double getPerimeter();

    public abstract double getArea();

    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest(6);
        System.out.println(circleTest.getArea());
        System.out.println(circleTest.getPerimeter());
        Triangle triangle = new Triangle(3.0,4.0,5.0);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());


    }

}

class CircleTest extends Shape {
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
}

class Triangle extends Shape {
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
        return (s * Math.sqrt((s - a) * (s - b) * (s - c)));//海伦公式
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length + width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Square extends Shape {
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

