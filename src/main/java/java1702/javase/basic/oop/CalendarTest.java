package java1702.javase.basic.oop;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/3/23.
 */
public class CalendarTest {
    //输入某年每月的日历
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.set(2017,0,1);
//        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_WEEK,1);
        while (year == calendar.get(Calendar.YEAR)) {
            int weekday = calendar.get(Calendar.DAY_OF_WEEK);
            int monthday = calendar.get(Calendar.DAY_OF_MONTH);
            if (weekday == 1) {
                System.out.println("");
            }
        }
    }
}
