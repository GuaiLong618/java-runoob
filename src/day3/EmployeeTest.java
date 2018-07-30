package day3;  //将下述类放入 day3包中


import static java.lang.System.out;
import static java.lang.System.setOut;


public class EmployeeTest {

    public static void main(String[] args) {
        /* 使用构造器创建四个对象 */
        // 构造器 重载
        System.out.println("----------");
        Employee empZero = new Employee();
        empZero.printEmployee();
        System.out.println("----------");
        Employee empOne = new Employee("RUNOOB1");
        empOne.printEmployee();
        System.out.println("----------");
        Employee empTwo = new Employee("RUNOOB2");
        empTwo.printEmployee();
        System.out.println("----------");
        Employee empThree = new Employee("RUNOOB3", 29);
        empThree.printEmployee();
        System.out.println("----------");
        Employee empfour = new Employee();
        empfour.printEmployee();
        System.out.println("----------");

        // 调用这两个对象的成员方法
        empZero.empSetInfo(77);
        empZero.printEmployee();

        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();

        empThree.printEmployee();

        empfour.empSetInfo(32);
        empfour.empSetInfo("RUNOOB4", 35, "架构师", 17000.5);
        empfour.printEmployee();

        System.out.println("----------");
        int n = Employee.getID();
        System.out.println("累计人数:" + n);
        System.out.println("公司名:" + Employee.COMPANY_NAME);

        out.println("-------------------");


        int lin = 19;

        if (1 == lin%2) {

            int m = lin/2 + 1;
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<m-i-1; j++)
                {
                    System.out.print(" ");
                }

                for (int k=0; k<(i*2)+1; k++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }

            int N = lin/2;

            for (int i=0; i<N; i++)
            {
                for (int j=0; j<i+1; j++)
                {
                    System.out.print(" ");
                }

                for (int k=0; k<(N-i)*2-1; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            int m = lin/2;
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<m-i-1; j++)
                {
                    System.out.print(" ");
                }

                for (int k=0; k<((i+1)*2); k++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }

            int N = lin/2;

            for (int i=0; i<N; i++)
            {
                for (int j=0; j<i; j++)
                {
                    System.out.print(" ");
                }

                for (int k=0; k<(N-i)*2; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        } // if (lin%2 == 0)
    }
}



