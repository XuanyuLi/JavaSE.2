package exam;

import com.sun.media.sound.SoftTuning;

/**
 * Created by lixuanyu
 * on 2017/4/8.
 */
/*按以下要求编写程序
(1) 编写 Animal 接口，接口中声明 eat() 方法
(2) 定义Bird类和 Fish 类实现 Animal 接口,Bird 中还有 flying 方法，Fish 中还有 swimming 方法，分别实现这些方法
(3) 编写 Bird 类和 Fish 类的测试程序，并调用其中的各个方法*/
public class Month5 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.flying();
        Fish fish = new Fish();
        fish.eat();
        fish.swimming();
    }
}

interface Animal {
      void eat();
}

class Bird implements Animal {
    public void flying() {
        System.out.println("Bird is flying");
    }

    @Override
    public void eat() {

    }
}


 class Fish implements Animal{

    public void swimming() {
        System.out.println("Fish is swimming");
    }

     @Override
     public void eat() {
         System.out.println("Fish is eating");
     }
 }




