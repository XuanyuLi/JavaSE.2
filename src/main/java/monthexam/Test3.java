package monthexam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 * Created by lixuanyu
 * on 2017/5/6.
 */
/*用输入/输出写一个程序,让用户输入一些姓名和电话号码。每一个姓名和号码将加在文件 里。
用户通过点”Done”按钮来告诉系统整个列表已输入完毕。 如果用户输入完整个列表,
程序将创建一个输出文件并显示或打印出来。格式如:
Tom
123-456-7890
Jerry
987-654-3210
*/
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名以及联系电话，输入完成后点Done键");
        String string = scanner.nextLine();
        try {
            FileWriter fileWriter = new FileWriter("exam");
            fileWriter.write(string);
            fileWriter.close();
            Reader reader = new FileReader("exam");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char)i);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
