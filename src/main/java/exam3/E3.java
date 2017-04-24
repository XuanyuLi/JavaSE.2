package exam3;

import java.io.*;

/**
 * Created by lixuanyu
 * on 2017/4/22.
 */
/*编写一个程序,其功能是将两个文件的内容合并到一个文件中
例如：1.txt 内容为 abc；2.txt 内容为 def；生成新文件3.txt 内容为 abcdef*/
public class E3 {
    public static void main(String[] args) {
        try {
            Writer writer1 = new FileWriter("txt1");
            writer1.write("abc");
            writer1.flush();
            Writer writer2 = new FileWriter("txt2");
            writer2.write("def");
            writer2.flush();
            Writer writer3 = new FileWriter("txt3");
            Reader reader1 = new FileReader("txt1");
            for (int i = 0; i < 3; i++) {
                writer3.write(reader1.read());
            }
            Reader reader2 = new FileReader("txt2");
            for (int i = 0; i < 3; i++) {
                writer3.write(reader2.read());
            }
            writer3.flush();

            System.out.println(writer1.toString());
            System.out.println(writer2.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
