package java1702.javase.basic.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by lixuanyu
 * on 2017/4/18.
 */
public class Download {
    private static final String IMAGE_URL = "https://img13.360buyimg.com/da/jfs/t5053/149/1767540160/201726/4c62f112/58f46164N2f502057.jpg";

//    private static void method() {
//        try {
//            URL url = new URL(IMAGE_URL);
//            System.out.println(url.openStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
    public static void main(String[] args) throws FileNotFoundException {
        Reader reader = new FileReader(IMAGE_URL);
        try {
            URL url = new URL(IMAGE_URL);
            System.out.println(url.openStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//java.net.url
