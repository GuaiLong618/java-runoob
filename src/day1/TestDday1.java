package day1;


/**
 *  使用输出语句,把各类型变量打印到控制器台上
 * 	1.定义一个Test类
 * 	2.在类中定义主方法
 * 	3.在主方法中,使用输出语句,输出如下变量
 * 			(1)整数变量i1: 88, i2:-88
 * 			(2)小数变量d: 88.888
 * 			(3)字符变量ch1: 'A', ch2:'8'
 * 			(4)布尔变量flag1: true, flag2:false
 *
 * @author Ming
 */
public class TestDday1 {
    private int i1 = 88;
    private int i2 = -88;
    private double d = 88.888;
    private char ch1 = 'A';
    private boolean flag1 = true;
    private boolean flag2 = false;

    public static void main(String[] args) {
        TestDday1 test = new TestDday1();
        System.out.println(test.i1);
        System.out.println(test.i2);
        System.out.println(test.d);
        System.out.println(test.ch1);
        System.out.println(test.flag1);
        System.out.println(test.flag2);
    }
}
