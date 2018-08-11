package day11;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Day11Test1 {

    public static void main(String[] args) {
        Collection<Student> e = new LinkedList<>();
        Student student0 = new Student();
        Student student1 = new Student("迪丽热巴", 21);
        Student student2 = new Student("古力娜扎", 26);
        Student student3 = new Student("热依娜", 23);

        ((LinkedList<Student>) e).addLast(student0);
        ((LinkedList<Student>) e).addLast(student1);
        ((LinkedList<Student>) e).addLast(student2);
        ((LinkedList<Student>) e).addLast(student3);

        int size = e.size();

        System.out.println(e.contains(student0));
        System.out.println("-------------------------");

        System.out.println("for");
        for (int i = 0; i < size; i++) {
            Student student = ((LinkedList<Student>) e).get(i);
            System.out.print(student.getName() + " ");
            System.out.println(student.getAge());
        }

        ((LinkedList<Student>) e).addFirst(student0);
        ((LinkedList<Student>) e).addFirst(student1);
        ((LinkedList<Student>) e).addFirst(student2);
        ((LinkedList<Student>) e).addFirst(student3);

        System.out.println("--------------------");
        System.out.println("增强型for");
        for (Student student : e) {
            System.out.print(student.getName() + " ");
            System.out.println(student.getAge());
        }

        System.out.println("----------------------");
        System.out.println("iterator:");
        Iterator<Student> it = e.iterator();

        while (true) {
            if (it.hasNext()) {
                System.out.println(it.next().getName());
                System.out.println(it.next().getAge());
            } else {
                break;
            }
        }
    }
}
