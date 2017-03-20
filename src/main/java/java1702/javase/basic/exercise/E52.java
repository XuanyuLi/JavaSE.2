package java1702.javase.basic.exercise;

/**
 * Created by Administrator on 2017/3/15.
 */
public class E52 {
    private void hanoi(int n,String src,String use,String dest) {
        if (n == 1) {
            System.out.println(src + "-" + dest);


        } else {
            hanoi(n-1,src,dest,use);
            System.out.println(src+"-"+dest);

            hanoi(n-1,use,src,dest);
        }

    }
    public static void main(String[] args) {
        E52 e52 = new E52();
        e52.hanoi(1,"A","B","C");


    }
}
