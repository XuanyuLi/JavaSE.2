package demo.b;

/**
 * Created by lixuanyu
 * on 2017/5/5.
 */
//松散耦合   软件开发追求的就是不断的解耦合
public class Service {
    private DeviceWriter deviceWriter;

    public Service(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void writer() {
        deviceWriter.writerToDevice();
    }
}
