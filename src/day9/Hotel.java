package day9;


import javax.swing.JOptionPane;
import java.util.Random;

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

    public Hotel() {

        for (int i = 0; i < FLOOR; i++) {
            for (int j = 0; j < ROOM_NUMBER; j++) {
                this.rooms[i][j].status = false;
                this.rooms[i][j].type = 3;
                int kk = i*100 + j;
                this.rooms[i][j].no = kk;
            }
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
            int floorNo = kk / 100;
            int roomNo = kk % 100;
            if ((roomNo <= 10) && (floorNo <= 5)) {
                if (this.rooms[floorNo][roomNo].status == false) {
                    this.rooms[floorNo][roomNo].status = true;
                    JOptionPane.showMessageDialog(null, "房间预定成功");
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
        int floorNo = kk / 100;
        int roomNo = kk % 100;
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
                if (this.rooms[i][j].status) {
                    System.out.print("[*]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.printRoomsList();
    }
}
