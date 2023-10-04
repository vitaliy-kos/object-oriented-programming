package Homework04;

public class Program {

    /*
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.
        * */
    public static void main(String[] args) {

        Box<Fruct> box1 = generateBoxWithFructs(9, "Apple");
        Box<Fruct> box2 = generateBoxWithFructs(6, "Orange");
        Box<Fruct> box3 = generateBoxWithFructs(0, "");

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        box1.pourOverToBox(box2); // пересыпать невозможно 
        System.out.println(box1.compare(box2)); // сравнение веса первого и второго бокса

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        box1.pourOverToBox(box3); // пересыпать возможно 

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

    }

    static Box<Fruct> generateBoxWithFructs(int count, String type){

        Box<Fruct> box = new Box<>();

        for (int i = 0; i < count; i++)
            box.putFruit(generateOneFruct(type));

        return box;
    }

    static Fruct generateOneFruct(String type) {

        Fruct fruct;

        if (type == "Apple") {
            fruct = new Apple();
        }
        else {
            fruct = new Orange();
        }

        return fruct;
    }

}
