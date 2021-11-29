package cn.wxroot.program.basic._2_singleton;

/**
 * 方式：懒汉式（时间换空间）
 * 描述：静态内部类实现 -> 线程安全，业务扩展性强，实例对象扩展性不强
 *
 * @author wxroot
 * @date 2021-11-29
 */
public class Singleton4 {

    private Singleton4() {
    }

    private static class InnerClass {

        static final Singleton4 _INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {

        return InnerClass._INSTANCE;
    }
}
