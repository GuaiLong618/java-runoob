package day1;


import javax.swing.JOptionPane;

/**
 * 使用输出语句打印一个菱形 和 一个三角型
 *
 *      *        0  空格  - 5   -1 *
 *     ***       1       - 4   -3
 *    *****      2       - 3   -5
 *   *******     3       - 2   -7
 *  *********    4       - 1   -9
 * ***********   5       - 0   -11
 *  *********    6  0    - 1   -9
 *   *******     7  1    - 2   -7
 *    *****      8  2    - 3   -5
 *     ***       9  3    - 4   -3
 *      *        10 4    - 5   -1
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
 * 下标从0开始使用,容易造成判断条件 +1 -1的思维混乱
 * @author Ming
 */
public class Day1Test4 {

    public static void main(String[] args) {
        // 输入显示菱形行数
        String number = JOptionPane.showInputDialog("输入显示菱形行数?");
        int n = Integer.parseInt(number);

        //校验 n >= 3
        int parity = n % 2;

        if (1 == parity) {

            int upperHalf = (n+1) / 2;
            int bottomHalf = n/2;

            //上半区
            for (int i = 0; i < upperHalf; i++) {
                for (int j = 0; j < ((upperHalf-1) - i); j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < (2*i)+1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //下半区
            for (int i = 0; i < bottomHalf; i++) {
                for (int j = 0; j < bottomHalf-(bottomHalf -i)+1; j++) {
                    System.out.print(" ");
                }

                for (int h = 0; h < 2*(bottomHalf-i)-1; h++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            int upperHalf = (n+1) / 2;
            int bottomHalf = (n+1) / 2;

            //上半区
            for (int i = 0; i < upperHalf; i++) {
                for (int j = 0; j < ((upperHalf-1) - i); j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < (2*i)+2; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //下半区
            for (int i = 0; i < bottomHalf; i++) {
                for (int j = 0; j < bottomHalf-(bottomHalf -i); j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2*(bottomHalf-i); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
