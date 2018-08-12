package five;

public interface Bluetooth {
    void btFunction();
    default void connecting() {
        System.out.println("可以连接蓝牙");
    }
}

