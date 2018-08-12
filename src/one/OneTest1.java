package one;

import javax.swing.*;

/**
 * 1、
 *
 * 提示用户输入消费金额，根据消费金额输出对应的折扣，并根据折扣在控制台输出对应折扣后的金额，折扣的范围如下（P代表消费的金额）：
 *
 *
 * P>=2000 7折，1000<=P<2000 8折，500<=P<1000 9.5折，0<=P<500 不打折
 *
 * 控制台示例1:
 * 请输入消费金额:1000
 * 折扣8折,打折前金额:1000,打折后金额:800.0
 *
 * 控制台示例2:
 * 请输入消费金额:100
 * 不打折,金额:100
 */
public class OneTest1 {

    public static void main(String[] args) {
        while (true) {
            String str = JOptionPane.showInputDialog(null, "输入消费金额");

            double number = (double) Integer.parseInt(str);
            double p = 0;

            if (number >= 2000) {
                p = number * 0.7;
                System.out.println("折扣7折,打折前金额: " + p);
            } else if ((number>=1000) && (number<2000)) {
                p = number * 0.8;
                System.out.println("折扣8折,打折前金额: " + p);
            } else if ((number>=500) && (number<1000)) {
                p = number * 0.95;
                System.out.println("折扣9.5折,打折前金额: " + p);
            } else if ((number>=0) && (number<500)) {
                p = number;
                System.out.println("不打折,金额: " + p);
            } else {
                ;
            }
        }
    }
}
