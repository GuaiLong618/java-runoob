package day10;

import java.util.Arrays;

public class Day10Test1 {

    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};

        System.out.println("未排序前:"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后:"+Arrays.toString(arr));
    }
}
