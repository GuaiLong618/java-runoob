package day1;

/**
 * 在控制台打印输出一句话,比如"键盘敲烂月薪过万"
 *
 * @author Ming
 */
public class Day1Test3 {
    private String oath = "键盘敲烂月薪过万";

    public String getOath() {
        return this.oath;
    }

    public static void main(String[] args) {
        Day1Test3 test = new Day1Test3();
        String oath = test.getOath();
        System.out.println(oath);
    }
}
