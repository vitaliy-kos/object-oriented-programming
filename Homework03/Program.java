package Homework03;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();
    public static void main(String[] args) {

        Employee[] employees = generateEmployees(15);

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

    /**
     * Метод generateEmployees универсальный, возвращает несколько различных типов
     * @param count
     * @return
     */
    static Employee[] generateEmployees(int count){
        Employee[] array = new Employee[count];
        for (int i = 0; i < array.length; i++)
            array[i] = generateOneEmployee();
        return array;
    }

    static Employee generateOneEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(50000, 120000);
        int salary_fl = random.nextInt(500, 1000);
        int salary_p = random.nextInt(500000, 1000000);

        int age = random.nextInt(25, 60);

        int type = random.nextInt(3);

        String name = names[random.nextInt(names.length)];
        String surName = surNames[random.nextInt(surNames.length)];

        if (type == 0) {
            return new Worker(surName, name, salary, age);
        }
        else if (type == 1) {
            return new Freelancer(surName, name, salary_fl, age);
        }
        else {
            return new Partner(surName, name, salary_p, age);
        }

    }

}
