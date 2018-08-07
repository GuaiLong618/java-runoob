package day8;


/**
 * 交配
 *
 * @author ye
 */
public interface Fuck {
    int ySize = 20;


    /**
     * 接口默认方法
     *
     * @return boolean
     */
    default boolean erection() {
        return true;
    }

    int getYSize(int size);

    default boolean isShort(int size) {
        return getYSize(size) >= 5;
    }
    /**
     * 动物交配的抽象方法
     */
    void papapa();
}
