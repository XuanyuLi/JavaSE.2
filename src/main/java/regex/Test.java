package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lixuanyu
 * on 2017/4/27.
 */
public class Test {
    public static void main(String[] args) {
//        Pattern 模式  Matcher 匹配
        Pattern pattern = Pattern.compile("l",Pattern.CASE_INSENSITIVE);//JS var pattern = /e/;
        Matcher matcher = pattern.matcher("Hello");
//        System.out.println(matcher.find());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

}
