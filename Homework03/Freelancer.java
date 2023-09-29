package Homework03;

/**
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {

    private int age;

    /*
     * salary - почасовая ставка фрилансера
     */
    public Freelancer(String surName, String name, double salary, int age) {
        super(surName, name, salary);
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("[Фрилансер] - %s %s - Среднемесячная з/п (за отработанные часы): %.2f (руб.), %d лет",
                surName, name, calculateSalary(), age);
    }
}
