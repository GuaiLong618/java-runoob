package day1;

import java.util.Random;

/**
 *
 * @author Ming
 */
public class Rand {

    public static void main(String[] args) {
        Random rand = new Random(3);  //无参
        int r = rand.nextInt(200);
        System.out.println(r);
        for (int i = 0; i < 200; i++) {
            int r3 = rand.nextInt(3);
            System.out.println(r3);
        }

        Random rand1 = new Random(904589603);
        int r1 = rand.nextInt(200);
        System.out.println(r1);

        Random rand2 = new Random(904589603);
        int r2 = rand.nextInt(200);
        System.out.println(r2);
    }
}
