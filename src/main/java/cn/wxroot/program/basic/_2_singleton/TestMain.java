package cn.wxroot.program.basic._2_singleton;

/**
 * 单例测试类
 *
 * @author wxroot
 * @date 2021-11-29
 */
public class TestMain {

    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.instance;

        Singleton3 singleton3 = Singleton3.getInstance();

        Singleton4 singleton4 = Singleton4.getInstance();

    }
}
