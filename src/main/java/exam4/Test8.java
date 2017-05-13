package exam4;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lixuanyu
 * on 2017/5/13.
 */
/*8. 使用多线程同时下载以下两个视频 20分
https://gifshow-static.download.ks-cdn.com/video/home-1.mp4
https://gifshow-static.download.ks-cdn.com/video/home-2.mp4
*/
public class Test8 implements Runnable {
    private static final String URL_ONE = "https://gifshow-static.download.ks-cdn.com/video/home-1.mp4";
    private static final String URL_TWO = "https://gifshow-static.download.ks-cdn.com/video/home-2.mp4";
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new Test8());
            thread.start();
        }
    }

    @Override
    public void run() {
        try {
            URL url = new URL(URL_ONE);
            try {
                try (BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("video"))
                ){
                    int i;
                    while ((i = bufferedInputStream.read()) != -1) {
                        bufferedWriter.write(i);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
