package day9;


import java.util.Date;
import javax.swing.JOptionPane;

/**
 * 酒店管理系统
 * 使用面向对象的方式完成一个酒店管理系统
 * 1:酒店类
 * 	酒店类中有若干个房间
 * 	五层 每层有十个房间(使用二维数组的方式实现)
 * 	Room[][] r = new Room[5][10];//null
 *
 * 	打印酒店列表的方法
 * 	订房的方法
 * 	退房的方法
 *
 * 2:房间类
 * 	房间编号
 * 	房间类型
 * 	房间状态(是否入住)
 *
 * 3:测试类
 * 	输入房间号订房
 * 	输入房间号退房
 * 	打印酒店房间展示
 *
 * @author hell
 */
public class test {
    public static void main(String[] args) {
        //输入房间号订房
        String name = JOptionPane.showInputDialog("what's your name?");
        System.out.println(name);
        System.exit(0);
    }
}
