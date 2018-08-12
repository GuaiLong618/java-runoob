package two;


import javax.swing.*;
import java.util.ArrayList;

/**
 *
 *
 * 提示用户在控制台上输入五个字符串，将这五个字符串存放在ArrayList集合中
 *
 * 筛选集合中长度小于5的元素(字符串),存到一个新的集合中.
 *
 * 并打印这个新集合中所有的元素.
 *
 *
 */
public class TwoTest1 {

    public static void main(String[] args) {
        //String str = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 5; i > 0; i--) {
            String str = JOptionPane.showInputDialog("输入字符串: " + i);

            if (str.length() < 5) {
                list.add(str);
            }
        }

        System.out.println(list);
    }
}
