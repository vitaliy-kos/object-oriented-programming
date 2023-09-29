package Homework03;

/**
 * Рабочий (фулл-тайм)
 */
public class Worker extends Employee {

    private int age;
    
    public Worker(String surName, String name, double salary, int age) {
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
        return String.format("[Штатный] - %s %s - Среднемесячная з/п (фиксированная): %.2f (руб.), %d лет",
                surName, name, calculateSalary(), age);
    }
}
