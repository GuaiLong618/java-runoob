package day1;


import javax.swing.*;

/**
 * 使用输出语句打印一个菱形 和 一个三角型
 *
 *      *        1  空格  - 5   -1 *
 *     ***       2       - 4   -3
 *    *****      3       - 3   -5
 *   *******     4       - 2   -7
 *  *********    5       - 1   -9
 * ***********   6       - 0   -11
 *  *********    7  1    - 1   -9
 *   *******     8  2    - 2   -7
 *    *****      9  3    - 3   -5
 *     ***       10 4    - 4   -3
 *      *        11 5    - 5   -1
 *
 *      *        0  空格  - 5   *
 *     * *       1       - 4
 *    *   *      2       - 3
 *   *     *     3       - 2
 *  *       *    4       - 1
 * *         *   5       - 0
 *  *       *    6       - 1
 *   *     *     7       - 2
 *    *   *      8       - 3
 *     * *       9       - 4
 *      *        10      - 5
 *
 *
 * @author Ming
 */
public class Day1Test4Bak1 {

    public static void main(String[] args) {
        while (true) {
            // 输入显示菱形行数
            String number = JOptionPane.showInputDialog("输入显示菱形行数?");
            int n = Integer.parseInt(number);

            //校验 n >= 3
            int parity = n % 2;

            if (1 == parity) {
                int upperHalf = (n+1) / 2;  //6
                int bottomHalf = n/2;       //5

                //上半区
                for (int i = 1; i <= upperHalf; i++) {
                    for (int j = 1; j <= upperHalf-i; j++) {
                        System.out.print(" ");
                    }

                    for (int h = 1; h <= (2*i) -1; h++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                //下半区
                for (int i = 1; i <= bottomHalf; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }

                    for (int h = 1; h <= (2*(bottomHalf-i))+1; h++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } else {
                int upperHalf = n/2;  //6
                int bottomHalf = n/2; //6

                //上半区
                for (int i = 1; i <= upperHalf; i++) {
                    for (int j = 1; j <= upperHalf-i; j++) {
                        System.out.print(" ");
                    }

                    for (int h = 1; h <= (2*i); h++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                //下半区
                for (int i = 1; i <= bottomHalf; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }

                    for (int h = 1; h <= 2*(bottomHalf-i); h++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            System.out.println("---");
        }
    }
}
