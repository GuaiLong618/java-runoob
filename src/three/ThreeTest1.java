package three;


import java.util.ArrayList;

/**
 * 遍历1到200之间（包含1和200）的所有数字，统计能被7整除的偶数的个数，最后将个数和数字打印在控制台
 */
public class ThreeTest1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;

        for (int i = 1; i <= 200; i++) {
            int even = i % 2;

            if (0 == even) {
                int exact = i % 7;
                if (0 == exact) {
                    cnt++;
                    list.add(i);
                }
            }
        }

        System.out.println("数字: "+list);
        System.out.println("个数: "+cnt);
    }
}
