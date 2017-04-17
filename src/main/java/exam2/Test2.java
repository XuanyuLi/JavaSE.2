package exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/4/15.
 */
//找出字符串中出现次数最多的字母和出现的次数
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int amount = 0;
        for (char aChar : chars) {
            for (char aChar1 : chars) {
                if (aChar == aChar1) {
                    amount++;
                }
                hashMap.put(aChar, amount);
            }

        }
        Integer[] integers = new Integer[hashMap.size()];
        int x = 0;
        for (Integer integer : hashMap.values()) {
            integers[x] = integer;
            x++;
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : hashMap.entrySet()) {
            System.out.println(characterIntegerEntry);
        }

    }
}
