package day12;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import day11.Student;

public class Day12Test1 {


    public static void main(String[] args) {
        //Collection<Student> e = new HashSet<>();
        Set<Student> e = new HashSet<>();

        Student student0 = new Student();
        Student student1 = new Student("迪丽热巴", 21);
        Student student2 = new Student("古力娜扎", 26);
        Student student3 = new Student("热依娜", 23);

        e.add(student0);
        e.add(student1);
        e.add(student2);
        e.add(student3);
        e.add(student1);
        e.add(student1);
        e.add(student1);

        System.out.println(e);
        System.out.println("-----");

        for (Student stu: e) {
            System.out.println(stu.getName());
        }
    }
}
