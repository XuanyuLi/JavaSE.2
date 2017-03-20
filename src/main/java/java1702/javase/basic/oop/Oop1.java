package java1702.javase.basic.oop;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/16.
 */
/// 闰年 西元年份除以400余数为0的,或者除以4余数为0且除以100余数不为0的,为闰年
public class Oop1{
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入年份");
//        int year =scanner.nextInt();
//        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
//            System.out.println(year + "是一个闰年");
//        } else {
//            System.out.println(year + "不是一个闰年");
//        }
        DefaultClass defaultClass = new DefaultClass();
        System.out.println(defaultClass.toString());
    }
 }
