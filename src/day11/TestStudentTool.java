package day11;



public class TestStudentTool {

    public static void main(String[] args) {
        Student[] stu = new Student[5];

        stu[0] = new Student("古力娜扎", 23, 59);
        stu[1] = new Student("热依扎", 20, 66);
        stu[2] = new Student("迪丽热巴", 22, 99);
        stu[3] = new Student("佟丽娅", 36, 88);
        stu[4] = new Student("马尔扎哈", 77, 33);

        StudentsTool t = new StudentsTool();

        t.listStudent(stu);
        System.out.println("----------");
        System.out.print(t.getMaxStudent(stu).getName() + ":");
        System.out.println(t.getMaxScore(stu));
        System.out.println(t.getAverageScore(stu));
        System.out.println(t.getCount(stu));
    }
}
