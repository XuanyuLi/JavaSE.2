package demo.a;

/**
 * Created by lixuanyu
 * on 2017/5/5.
 */
//高层应用类  高层应用类和底层实现类的强耦合
public class Service {
    private FloppyWriter floppyWriter;

    public Service(FloppyWriter floppyWriter) {
        this.floppyWriter = floppyWriter;
    }

    public void write() {
        floppyWriter.writerToFloppy();
    }
}
