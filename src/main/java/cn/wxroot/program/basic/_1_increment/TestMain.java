package cn.wxroot.program.basic._1_increment;

/**
 * 自增操作测试类
 *
 * @author wxroot
 * @date 2021-11-28
 */
public class TestMain {

    public static void main(String[] args) {

        int x = 1;

        int y = x++;

        int z = x + ++x + --x * x;

        System.out.println(x); //2

        System.out.println(y); //1

        System.out.println(z); //9

        // x++：先将x放入操作数栈，后x自增1

        // ++x：先将x自增1，后将x放入操作数栈
    }
}
