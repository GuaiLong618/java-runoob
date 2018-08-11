package day12;

import java.util.*;

/**
 * ["tea", "toast", "bread", "coast", "bad", "cat"]
 * {"t"="teatoast","b"="breadbad","c"="coastcat"}
 */
public class Day13Test3 {

    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        Map<Character, String> map =new HashMap<>();

        l.add("tea");
        l.add("toast");
        l.add("bread");
        l.add("coast");
        l.add("bad");
        l.add("cat");

        for (String str : l) {

            char frist = str.charAt(0);
            boolean b = map.containsKey(frist);
            if (b) {
                String value = map.get(frist);
                value = value + str;//
                map.put(frist, value);
            } else {
                map.put(frist, str);
            }
        }

        System.out.println(map);
        System.out.println("--------------");
    }
}
