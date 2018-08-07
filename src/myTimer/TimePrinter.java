package myTimer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


/**
 * 定时输出当前时间,并且蜂鸣
 *
 * @author ye
 */
public class TimePrinter implements ActionListener {

    /**
     * callback
     * @param e 动作时间对象
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("time is: " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
