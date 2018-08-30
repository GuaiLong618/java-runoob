package five;

public class IPhone extends Phone {

    public IPhone() {
    }

    public IPhone(String name) {
        super(name);
    }


    @Override
    public void btFunction() {
        System.out.println("支持蓝牙功能");
    }

    @Override
    void playMusic(Song song) {
        String name = super.getName();
        System.out.print(name);
        System.out.print("手机正在播放");
        System.out.print(song.getSinger());
        System.out.print("唱的");
        System.out.println(song.getName());
    }
}
