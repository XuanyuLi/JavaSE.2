package exam;

import java.util.Arrays;

/**
 * Created by lixuanyu
 * on 2017/4/8.
 */
/*将一个数组中值为0的项去掉,将不为0的值存入一个新的数组,比如:
　　int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        　　生成的新数组为:
        　　int b[]={1,3,4,5,6,6,5,4,7,6,7,5}*/
public class Month2 {
    public static void main(String[] args) {
        int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        String strings = Arrays.toString(a);
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            if (i1==0) {

            }
            System.out.println(i1);
        }
    }
}
