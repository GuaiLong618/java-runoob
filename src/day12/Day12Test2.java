package day12;

import day11.Student;

import java.util.HashMap;
import java.util.Map;

public class Day12Test2 {


    public static void main(String[] args) {
        Map<String, Student> map = new HashMap();

        Student student0 = new Student();
        Student student1 = new Student("迪丽热巴", 21);
        Student student2 = new Student("古力娜扎", 26);
        Student student3 = new Student("热依娜", 23);

        map.put("001", student0);
        map.put("002", student1);
        map.put("003", student2);
        map.put("004", student3);
        map.put("005", student2);

        System.out.println(map);
        System.out.println("--------------");

        
    }
}
