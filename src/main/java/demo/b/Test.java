package demo.b;
/**
 * Created by lixuanyu
 * on 2017/5/5.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service(new FloppyWriter());
        service.writer();
    }
}
