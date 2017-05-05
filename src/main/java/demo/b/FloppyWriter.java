package demo.b;

/**
 * Created by lixuanyu
 * on 2017/5/5.
 */
public class FloppyWriter implements DeviceWriter {

    @Override
    public void writerToDevice() {
        System.out.println("writer to floppy...");
    }
}
