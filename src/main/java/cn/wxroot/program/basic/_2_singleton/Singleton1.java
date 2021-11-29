package cn.wxroot.program.basic._2_singleton;

/**
 * 方式：饿汉式（空间换时间）
 * 描述：常见实现 -> 线程安全，业务扩展性强，实例对象扩展性不强
 *
 * @author wxroot
 * @date 2021-11-29
 */
public class Singleton1 {

    private static final Singleton1 _INSTANCE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {

        return _INSTANCE;
    }
}
