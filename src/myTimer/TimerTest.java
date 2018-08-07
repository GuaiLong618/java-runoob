package myTimer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;


/**
 * @version 1.01 18-8-7
 * @author hell
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        // construct a timer that calls the listener
        // one every x seconds
        Timer t = new Timer(10000, listener);
        t.start();
        // 对话框阻塞等待 点击确定break
        JOptionPane.showMessageDialog(null, "Quit?");
        System.out.println("---");
        System.exit(0);
    }
}
