package java1702.javase.basic.exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created by lixuanyu
 * on 2017/4/17.
 */
public class CheckExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("","");
    }
}
