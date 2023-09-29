package Homework03;

/**
 * Фрилансер (работник с почасовой оплатой)
 */
public class Partner extends Employee {

    private int age;
    
    public Partner(String surName, String name, double salary, int age) {
        super(surName, name, salary);
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("[Партнер] - %s %s - Среднемесячная з/п (процент от продаж): %.2f (руб.), %d лет",
                surName, name, calculateSalary(), age);
    }
}
