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

    void playMusic(Song song) {

    }
}
