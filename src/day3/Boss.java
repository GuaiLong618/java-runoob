package day3;

import java.util.Arrays;

/**
 * @author ye
 * @super
 */
public class Boss extends Employee {
    private double bonus;

    public Boss(String name, int age) {

        super(name, age);
        this.bonus = 0;
    }

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getSalary() {
        //名字冲突,要指明调用的超类的方法 super.
        double salary = super.getSalary();
        return salary + this.bonus;
    }

    public static void main(String[] args) {

        Boss boss = new Boss("boss0",47);
        double salary = boss.getSalary();
        System.out.println("salary:" + salary);

        int[] staff = {4,6,7,0,4,7,2,1,9,0,8,3,5};

        Arrays.sort(staff);

        for (int i: staff) {
            System.out.print(staff[i] + " ");
        }

        for (int i=0; i<staff.length; i++)
        {
            System.out.print(staff[i] + " ");
        }

        Employee e = new Employee();
        e.hashCode();                 
    }
}

