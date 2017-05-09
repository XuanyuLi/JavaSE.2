package java1702.javase.basic.io;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by lixuanyu
 * on 2017/5/8.
 */
public class JSoupTest {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://jandan.net/tag/nasa").get();
        System.out.println(document.text());
        Elements elements = document.select("img[class=lazy]");
        for (Element element : elements) {
            System.out.println("http:" + element.attr("data-original"));
        }
    }
}
