package collection;
/**
 * Created by lixuanyu
 * on 2017/3/27.
 */
//数组是一个容器,就是同一种值的集合,数组是静态的，数据初始化之后，元素的个数不变
public class ArrayTest {
    public static void main(String[] args) {
       String[] strings = new String[10];
       System.out.println(strings[0]);//下标，索引 index
//        ArrayTest[] arrayTest = new ArrayTest[10];
        ArrayTest[] arrayTests = {new ArrayTest(),new ArrayTest(),new ArrayTest()};//以类定义数组参数的另一种写法
        System.out.println(arrayTests[0]);
        System.out.println(arrayTests[1]);
        System.out.println(arrayTests[2]);
        int[] ints = new int[100];
        System.out.println(ints.length);
        java.lang.String[] months = {"Jan","Feb","Mar"};
        for (String month : months) {
            System.out.println(month);
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            System.out.println(month);
        }

    }
}
