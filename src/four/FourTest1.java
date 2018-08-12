package four;


import java.util.Arrays;

/**
 *  4.
 *  定义一个静态方法 void comp(int[] arr),输出该数组中最大值和最小值，
 *  在main方法中定义一个int型数组，数组元素有{2,3,-5,1,9,2}，并将该数组传入comp方法中，调用测试。
 *
 *  示例如下：
 *  最大值:9
 *  最小值:-5
 */
public class FourTest1 {

    static void comp(int[] arr) {
        Arrays.sort(arr);

        System.out.println("最大值: " + arr[0]);
        System.out.println("最小值: " + arr[arr.length-1]);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -5, 1, 9, 2};
        comp(arr);
    }
}
