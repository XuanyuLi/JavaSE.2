package java1702.javase.basic.io;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by lixuanyu
 * on 2017/5/9.
 */
public class Spider {
    public static void main(String[] args) throws IOException {
        String url = "http://bj.lianjia.com/ershoufang/dongcheng";
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("li[class=clear]");
        for (Element element : elements) {
            String region = element.select("a[data-el=region]").get(0).text();
            System.out.println(region);
        }
        System.out.println(elements.size());
    }
}
