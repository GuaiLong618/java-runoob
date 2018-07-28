package day3;

public class Employee {

    private String name;
    private int age;
    private String designation;
    private double salary;

    private static final String company_name = "hell";
    private static int id;

    // 构造器
    public Employee() {
        this.name = "runoob";
        id++;
    }

    // Employee 类的构造器
    public Employee(String name) {
        this.name = name;
        this.age = 99;
        id++;
    }
    // 多个构造器
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        id++;
    }

    // 设置age的值
    void empAge(int empAge){
        age =  empAge;
    }
    /* 设置designation的值*/
    void empDesignation(String empDesig){
        designation = empDesig;
    }
    /* 设置salary的值*/
    void empSalary(double empSalary){
        salary = empSalary;
    }
    /* 打印信息 */
    void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
        System.out.println("ID:" + id);
    }
}
