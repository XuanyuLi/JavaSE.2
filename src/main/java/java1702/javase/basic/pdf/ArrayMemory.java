package java1702.javase.basic.pdf;
/**
 * Created by lixuanyu
 * on 2017/4/6.
 */
//在类的主方法中使用一维数组和二维数组存储相同的数据，在控制台输出它们所占的内存，并加以比较
public class ArrayMemory {//memory 记忆力，回忆，存储
    public static void main(String[] args) {
        int i = 1024*1024*2;
        int[] ints = new int[i];
        for (int j = 0; j < ints.length; j++) {
            ints[j] = j;
        }
        long memory1 = Runtime.getRuntime().totalMemory()/1024/1024;
        System.out.println("用一维数组存储占用内存总量为：" + memory1);
        int i1 = 1014*1024;
        int[][] ints1 = new int[i1][2];
        for (int j = 0; j < ints1.length; j++) {
            ints1[j][0] = j;
            ints1[j][1] = j;
        }
        long memory2 = Runtime.getRuntime().totalMemory()/1024/1024;
        System.out.println("用二维数组存储占用的内存总量为：" + memory2);
    }
}
