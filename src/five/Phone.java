package five;

public abstract class Phone implements Bluetooth {
    private String name;

    public Phone() {

    }

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void playMusic(Song song);  // 抽象方法
}
