package Homework02;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5);
        Cat cat2 = new Cat("Пушок", 10);
        Cat cat3 = new Cat("Цезарь", 15);
        Cat cat4 = new Cat("Бакс", 5);
        Cat cat5 = new Cat("Мурзик", 20);

        /*
         * Пункт 3 задания - добавлен массив котов и всех попросили поесть.
         */
        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        Plate plate1 = new Plate("Тарелка 1", 21);
        Plate plate2 = new Plate("Тарелка 2", 18);

        /*
         * Немного усложнил и дал возможность поесть из второй тарелки, если в первой не хватает)))
         */

        for (Cat cat : cats) {
            boolean isEaten = cat.eat(plate1);
            if (!isEaten) {
                cat.eat(plate2);
            }
        }

        System.out.println(cats);

        /*
         * Пункт 4 задания - добавлена возможность добавления корма в тарелку.
         */
        System.out.println(plate1);

        if (plate1.getFood() < 5) plate1.addFood(5);

        System.out.println(plate1);
    }
}
