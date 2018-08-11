package day11;


import java.util.Collection;
import java.util.LinkedList;

/**
 * 题1:
 * 	需求说明：自定义一个学生类，给出成员变量name和age，使用Collection集合存储自定义对象并遍历，遍历集合的时候，
 * 	在控制台输出学生对象的成员变量值。
 *
 * 	1.2．操作步骤描述
 * 	1.创建学生类。
 * 	2.创建集合对象。
 * 	3.创建元素对象。
 * 	4.把元素添加到集合。
 * 	5.遍历集合。
 *
 */
public class Day11Test2 {
    public static void main(String[] args) {
        LinkedList<Student> e = new LinkedList<>();
        Student student0 = new Student();
        Student student1 = new Student("迪丽热巴", 21);
        Student student2 = new Student("古力娜扎", 26);
        Student student3 = new Student("热依娜", 23);

        e.addLast(student0);
        e.addLast(student1);
        e.addLast(student2);
        e.addLast(student3);

        int size = e.size();

        for (int i = 0; i < size; i++) {
            Student student = e.get(i);
            System.out.print(student.getName() + " ");
            System.out.println(student.getAge());
        }

        e.addFirst(student0);
        e.addFirst(student1);
        e.addFirst(student2);
        e.addFirst(student3);

        System.out.println("--------------------");
        for (Student student : e) {
            System.out.print(student.getName() + " ");
            System.out.println(student.getAge());
        }
    }
}
