package day3;

//import day3.Employee;

public class EmployeeTest{

    public static void main(String []args){
        /* 使用构造器创建两个对象 */
        Employee empZero = new Employee();
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");
        Employee empThree = new Employee("RUNOOB3", 29);

        System.out.println("----------\r");
        empZero.printEmployee();
        ,

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();

        System.out.println("");
        empThree.printEmployee();


    }
}
