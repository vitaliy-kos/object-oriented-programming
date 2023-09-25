package Homework01;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product("ООО Источник", "_", -100);
        Product product2 = new Product();
        Product product3 = new Product("Бутылка с водой (3)", 50);

        Product bottleOfWater1 = new BottleOfWater("ООО Источник", "Бутылка с водой (5)", 150, 2, 15);

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (1)", 150, 2, 15);
        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (2)", 110, 1, 15);
        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (3)", 160, 2, 25);
        Product bottleOfMilk4 = new BottleOfMilk("ООО Источник", "Бутылка с молоком (4)", 170, 3, 35);

        Product chokolate1 = new Chokolate("ООО Нестле", "Шоколадный батончик Нестле", 70, 220);
        Product chokolate2 = new Chokolate("ООО Баунти", "Шоколадный батончик Баунти", 90, 390);


        ArrayList<Product> arrayList = new ArrayList<>();

        arrayList.add(bottleOfWater1);

        arrayList.add(bottleOfMilk1);
        arrayList.add(bottleOfMilk2);
        arrayList.add(bottleOfMilk3);
        arrayList.add(bottleOfMilk4);

        arrayList.add(chokolate1);
        arrayList.add(chokolate2);

        VendingMachine vendingMachine = new VendingMachine(arrayList);

        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком (3)", 2);
        if (bottleOfMilk != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с молоком нет в автомате.");
        }

        Chokolate chokolate = vendingMachine.getChokolate("Шоколадный батончик Нестле", 220);
        if (chokolate != null){
            System.out.println("Вы купили:");
            System.out.println(chokolate.displayInfo());
        }
        else {
            System.out.println("Такого шоколадного батончика нет в автомате.");
        }

    }
}