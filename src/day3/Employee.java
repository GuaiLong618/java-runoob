package day3;

public class Employee {

    public static final String COMPANY_NAME = "hell";
    /* 属于类,只有一个,用于内部累加id,在各个对象中没有拷贝 */
    private static int nextid;

    private String name = "";
    private int age;
    private String designation;
    private double salary;
    private int id  = currentID();

    // 构造器
    public Employee() {
    }

    // Employee 类的构造器
    public Employee(String name) {
        this.name = name;
        this.age = 99;
    }

    // 多个构造器
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private static int currentID() {
        int ret = nextid;
        nextid++;
        return ret;
    }

    // 设置age的值
    void empAge(int empAge) {
        age = empAge;
    }

    /* 设置designation的值*/
    void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* 设置salary的值*/
    void empSalary(double empSalary) {
        salary = empSalary;
    }

    // 没有定义private,public,可以被包中其他方法访问
    void empSetInfo(int age) {
        this.age = age;
    }

    // 方法重载,方法的签名不包括放回值
    void empSetInfo(String name,
                    int age,
                    String designation,
                    double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    /* 打印信息 */
    void printEmployee() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
        System.out.println("ID:" + id);
    }

    // 静态方法
    public static int getID() {
        return nextid;
    }

    /**
     * @brief 用于单元测试,单元测试时会运行,非单元测试时候不运行
     * @param args
     */
    public static void main(String[] args) {
        Employee empZero = new Employee();
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");
        Employee empThree = new Employee("RUNOOB3", 29);

        System.out.println("----------\r");
        empZero.printEmployee();
        empOne.printEmployee();
        empTwo.printEmployee();
        empThree.printEmployee();
        System.out.println("----------\r");
    }
}
