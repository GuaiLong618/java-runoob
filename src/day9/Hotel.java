package day9;


import javax.swing.JOptionPane;
import java.util.Random;

/**
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
 */

/**
 * 酒店
 *
 * @author hell
 */
public class Hotel {
    public static final int FLOOR = 5;
    public static final int ROOM_NUMBER = 10;
//    private int ro[][] = new int[2][3];
    private Room[][] rooms = new Room[FLOOR][ROOM_NUMBER];
    private String[] rmType = {"标准间", "双人间", "家庭房"};

    public Hotel() {

        for (int i = 0; i < FLOOR; i++)
            for (int j = 0; j < ROOM_NUMBER; j++) {
                Room r = new Room();
                Random rand = new Random();  //无参
                this.rooms[i][j] = r;
                this.rooms[i][j].status = false;
                this.rooms[i][j].type = rand.nextInt(3);
                int kk = (i * 100 + 1) + j + 1;
                this.rooms[i][j].no = kk;
            }
    }

    /**
     * 输入房间号订房
     *
     * @author hell
     */
    public void makeRoomReservation() {

        while (true) {
            String name = JOptionPane.showInputDialog("what's your name?");
            System.out.println(name);
            String number = JOptionPane.showInputDialog("room no: ");
            System.out.println(number);

            int kk = Integer.parseInt(number);
            int floorNo = kk / 100 - 1;
            int roomNo = kk % 100 - 1;
            if ((roomNo <= 10) && (floorNo <= 5)) {
                if (this.rooms[floorNo][roomNo].status == false) {
                    this.rooms[floorNo][roomNo].status = true;
                    JOptionPane.showMessageDialog(null, "房间预定成功");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null,"房间已经被预定");
                }

            } else {
                JOptionPane.showMessageDialog(null,"输入房号有误");
            }
        }
    }

    public void UnsubscribeRoom() {
        String number = JOptionPane.showInputDialog("退房房号: ");
        System.out.println(number);

        int kk = Integer.parseInt(number);
        int floorNo = kk / 100 - 1;
        int roomNo = kk % 100 - 1;
        this.rooms[floorNo][roomNo].status = false;
    }

    /**
     * [*][ ][*][ ]...
     * [*][ ][*][ ]...
     * [*][ ][*][ ]...
     * [*][ ][*][ ]...
     * [*][ ][*][ ]...
     */
    public void printRoomsList() {

        for (int i = 0; i < FLOOR; i++) {
            for (int j = 0; j < ROOM_NUMBER; j++) {
                int kk = ((i+1)*100) + j + 1;
                System.out.print(kk + ":");
                int type = this.rooms[i][j].type;
                System.out.print(this.rmType[type]);
                if (this.rooms[i][j].status) {
                    System.out.print("[*] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        String[] str = {"预订?","退订?", "退出系统"};

        while (true) {
            int num = JOptionPane.showInternalOptionDialog(null,
                    "无人前台",
                    "天上人间酒店系统",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    str, //Object[] options,
                    "预订?");
            hotel.printRoomsList();
//        System.out.println(num);
            if (0 == num) {
                hotel.makeRoomReservation();
                hotel.printRoomsList();
            } else if (1 == num) {
                hotel.UnsubscribeRoom();
                hotel.printRoomsList();
            } else {
                System.exit(0);
            }
        }
    }
}
