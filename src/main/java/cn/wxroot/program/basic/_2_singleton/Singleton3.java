package cn.wxroot.program.basic._2_singleton;

/**
 * 方式：饿汉式（空间换时间）
 * 描述：静态代码块实现 -> 线程安全，业务扩展性强，实例对象扩展性强
 *
 * @author wxroot
 * @date 2021-11-29
 */
public class Singleton3 {

    private static final Singleton3 _INSTANCE;

    static {

        String name = "zhangsan"; //name可能是从配置文件或者其他地方读取到的..

        _INSTANCE = new Singleton3(name);
    }

    private Singleton3(String name) {
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Singleton3 getInstance() {

        return _INSTANCE;
    }
}
