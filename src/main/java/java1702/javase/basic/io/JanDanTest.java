package java1702.javase.basic.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * Created by lixuanyu
 * on 2017/4/21.
 */
public class JanDanTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://jandan.net/tag/%E5%A4%A9%E6%96%87");
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains("data-original=\"//")) {
                        String imageURL = "http:" + line.substring(line.indexOf("//tankr"), line.indexOf("jpg") + 3);
                        System.out.println(imageURL);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static void download(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
