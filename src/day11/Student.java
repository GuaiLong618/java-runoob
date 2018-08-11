package day11;


import java.util.Collection;

public class Student {
    private String name;
    private int age;
    private int score;

    public Student() {
        this.name = "无名";
        this.age = 99;
        this.score = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    void eat() {
        System.out.println("吃饭");
    }

    void study() {
        System.out.println("学习");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

//    public Student highestScore(Collection<Student> list) {
//        Student maxStu = null;
//        int max = 0;
//
//        for (Student stu : list) {
//            int score = stu.getScore();
//
//            if (score > max) {
//                max = score;
//                maxStu = stu;
//            }
//        }
//
//        return maxStu;
//    }
//
//    public void printStuTotalScoreAndAverageScore(Collection<Student> list) {
//        int average = 0;
//
//        for (Student stu : list) {
//            average += stu.getScore();
//        }
//
//        System.out.println("总成绩:" + average);
//        average = average / (list.size());
//        System.out.println("平均分:" + average);
//    }
//
//    public void printBadBoy(Collection<Student> list) {
//        int badBoyCnt = 0;
//
//        for (Student stu : list)
//            if (stu.getScore() < 60) {
//                badBoyCnt++;
//                System.out.println(stu.toString());
//            }
//
//        System.out.println(badBoyCnt);
//    }
}
