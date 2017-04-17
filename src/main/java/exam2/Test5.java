package exam2;
import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/15.
 */
/*写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
例如：
-4.5 四舍五入的结果是-4
4.4 四舍五入的结果是4*/
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个浮点数值：");
        Double d = scanner.nextDouble();
        if ((d - d.intValue()) >= 0.5) {
            System.out.println(d.intValue() + 1);
        } else {
            System.out.println(d.intValue());
        }
    }
}
