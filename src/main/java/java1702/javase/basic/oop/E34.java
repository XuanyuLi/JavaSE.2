package java1702.javase.basic.oop;
import java.util.Hashtable;
import java.util.Random;

/**
 * Created by lixuanyu
 * on 2017/3/20.
 */
public class E34 extends Random {

    public static void main(String[] args) {
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < 20; i++) {
            hashtable.put(i + 1,0);
        }
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int r = (int)(Math.random()*20)+1;
            hashtable.put(r,hashtable.get(r) + 1);
//            System.out.println(r);
//            int r = random.nextInt(20)+1;
        }
        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "\t->\t" + hashtable.get(integer));
        }

    }
}
//7,33
