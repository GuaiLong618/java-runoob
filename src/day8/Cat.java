package day8;


/**
 * @author ye
 */
public class Cat extends Animal implements Fuck {
    private String typeName = "未知品种";
    private String nickName = "未有昵称";


    public Cat() {
        this.nickName = "小明";
    }

    public String getNickName(String name) {
        this.nickName = name;

        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTypeName(String name) {
        this.typeName = name;

        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public int getYSize(int size) {
        return size;
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void papapa() {
        System.out.println("喵在啪啪啪!!!");
    }
}
