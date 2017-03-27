package exam;

/**
 * Created by lixuanyu
 * on 2017/3/25.
 */
public class Cat extends Animal implements Flying,Swiming{
    private double bodyLength;
    private String color;

    public Cat(double bodyLength, String color) {
        this.bodyLength = bodyLength;
        this.color = color;
    }

    public void jump() {
        System.out.println("Cat is jumping");
    }

    public void mouse() {
        System.out.println("Cat is mousing");
    }

    @Override
    public void sleeping() {
        super.sleeping();
    }

    @Override
    public void eating() {
        super.eating();
    }

    @Override
    public void multiply() {
        super.multiply();
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
