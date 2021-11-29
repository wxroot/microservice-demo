package cn.wxroot.program.basic._2_singleton;

/**
 * 方式：饿汉式（空间换时间）
 * 描述：枚举实现 -> 线程安全，最简洁，业务扩展性不强
 *
 * @author wxroot
 * @date 2021-11-29
 */
public enum Singleton2 {

    instance
}
