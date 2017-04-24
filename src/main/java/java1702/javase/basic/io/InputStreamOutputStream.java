package java1702.javase.basic.io;

import java.io.*;

/**
 * Created by lixuanyu
 * on 2017/4/20.
 */
public class InputStreamOutputStream {
    private static final String PATH = "src/main/java/java1702/javase/basic/io/";
    public static void main(String[] args) {
        try {
            try (InputStream inputStream = new FileInputStream(PATH.concat("InputStreamOutputStream.java"));
                 OutputStream outputStream = new FileOutputStream(PATH.concat("Test.java"))) {
                int i;
                while ((i = inputStream.read()) != -1) {
                    outputStream.write(i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
