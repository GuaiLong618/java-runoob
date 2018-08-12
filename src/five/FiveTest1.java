package five;

/**
 * 5.
 * 根据要求完成以下功能：
 *
 * ① 定义接口Bluetooth，要求如下：
 * 定义抽象方法： void btFunction()
 *         定义默认方法： void connecting()，要求：输出"可以连接蓝牙"
 *
 * ② 定义抽象类Phone，要求如下：
 *   包含空参、满参构造和以下成员变量
 *
 * 名称name（ String 型）
 *         生成所有成员变量set/get方法
 *         定义抽象方法：void playMusic(Song song)
 *
 * ③定义类Song
 *
 *        包含空参、满参构造和以下成员变量
 *
 * 歌手 singer（String 型）
 * 歌名 name（ String 型）
 *         生成所有成员变量set/get方法
 *
 * ④ 定义类IPhone，要求如下：
 * 继承抽象类 Phone，实现接口 Bluetooth
 *   构造方法包括：空参构造和满参构造方法(String)
 *   重写抽象方法：
 *      void btFunction()，要求：输出”支持蓝牙功能”
 *      void playMusic(Song song)，要求：输出打印"XXX手机正在播放YYY唱的ZZZZ
 *  PS:XXX是Phone类中的name属性, YYY是Song类中的singer属性值, ZZZ是Song类中的name属性值
 *
 * ⑤ 定义测试类Test，在main方法实现以下功能：
 * 创建并初始化一个IPhone 对象phone和一个Song 对象s，
 * 调用phone的 btFunction()、connecting()和playMusic(Song song)方法
 *
 * 示例如下:
 * 支持蓝牙功能
 * 可以连接蓝牙
 * iPhone8
 * iPhone8手机正在播放于文文唱的体面
 *
 */
public class FiveTest1 {

    public static void main(String[] args) {
        Phone iphone = new IPhone("iPhone8");
        Song song = new Song("于文文", "体面");

        iphone.btFunction();
        iphone.connecting();
        iphone.playMusic(song);
    }
}
