package day11;

public class StudentsTool {

    /**
     * 遍历打印学生信息
     * @param arr
     */
    public void listStudent(Student[] arr) {
        for (Student stu: arr
             ) {
            System.out.println(stu.getName());
            System.out.println(stu.getAge());
            System.out.println(stu.getScore());
        }
    }

    /**
     * 获取学生成绩的最高分
     * @param arr
     * @return
     */
    public int getMaxScore(Student[] arr) {
        int max = 0;
        for (Student stu : arr) {
            int score = stu.getScore();
            if (score > max) {
                max = score;
            } else {
                ;
            }
        }

        return max;
    }

    /**
     * 获取成绩最高的学员
     * @param arr
     * @return
     */
    public Student getMaxStudent(Student[] arr) {
        Student maxStu = null;
        int max = 0;

        for (Student stu : arr) {
            int score = stu.getScore();

            if (score > max) {
                max = score;
                maxStu = stu;
            } else {
                ;
            }
        }

        return maxStu;
    }

    /**
     * 获取学生成绩的平均值
     */
    public int getAverageScore(Student[] arr) {
        int average = 0;

        for (Student stu : arr) {
            average += stu.getScore();
        }

        average = average / (arr.length);
        return average;
    }

    /**
     * 获取不及格的学员数量
     * @param arr
     * @return
     */
    public int getCount(Student[] arr) {
        int badBoyCnt = 0;

        for (Student stu : arr) {
             if (stu.getScore() < 60) {
                 badBoyCnt++;
             }
        }

        return badBoyCnt;
    }
}
