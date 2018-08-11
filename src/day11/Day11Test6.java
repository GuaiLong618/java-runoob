package day11;

import java.util.ArrayList;
import java.util.Collection;

public class Day11Test6 {

    public Student highestScore(Collection<Student> list) {
        Student maxStu = null;
        int max = 0;

        for (Student stu : list) {
            int score = stu.getScore();

            if (score > max) {
                max = score;
                maxStu = stu;
            }
        }

        return maxStu;
    }

    public void printStuTotalScoreAndAverageScore(Collection<Student> list) {
        int average = 0;

        for (Student stu : list) {
            average += stu.getScore();
        }

        System.out.println("总成绩:" + average);
        average = average / (list.size());
        System.out.println("平均分:" + average);
    }

    public void printBadBoy(Collection<Student> list) {
        int badBoyCnt = 0;

        for (Student stu : list)
            if (stu.getScore() < 60) {
                badBoyCnt++;
                System.out.println(stu.toString());
            }

        System.out.println("不及格人数:" + badBoyCnt);
    }


    public static void main(String[] args) {
        Collection<Student> list = new ArrayList<>();

        Student stu0 = new Student("古力娜扎", 23, 59);
        Student stu1 = new Student("热依扎", 20, 66);
        Student stu2 = new Student("迪丽热巴", 22, 99);
        Student stu3 = new Student("佟丽娅", 36, 88);
        Student stu4 = new Student("马尔扎哈", 77, 33);
        Student stu5 = new Student("古力娜扎", 23, 59);
        Student stu6 = new Student("热依扎", 20, 66);
        Student stu7 = new Student("迪丽热巴", 22, 99);
        Student stu8 = new Student("佟丽娅", 36, 88);
        Student stu9 = new Student("马尔扎哈", 77, 33);

        ((ArrayList<Student>) list).add(0, stu0);
        ((ArrayList<Student>) list).add(1, stu1);
        ((ArrayList<Student>) list).add(2, stu2);
        ((ArrayList<Student>) list).add(3, stu3);
        ((ArrayList<Student>) list).add(4, stu4);
        ((ArrayList<Student>) list).add(5, stu5);
        ((ArrayList<Student>) list).add(6, stu6);
        ((ArrayList<Student>) list).add(7, stu7);
        ((ArrayList<Student>) list).add(8, stu8);
        ((ArrayList<Student>) list).add(9, stu9);

        System.out.println("总人数:" + list.size());

        Day11Test6 test = new Day11Test6();
        Student stu = test.highestScore(list);
        System.out.println(stu);
        test.printStuTotalScoreAndAverageScore(list);
        test.printBadBoy(list);


    }
}
