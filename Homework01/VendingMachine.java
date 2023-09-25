package Homework01;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(String name, int volume) {
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume)
                    return bottleOfMilk;
            }
        }
        return null;
    }

    public Chokolate getChokolate(String name, int calories) {
        for (Product product : products){
            if (product instanceof Chokolate){
                Chokolate chokolate = (Chokolate)product;
                if (chokolate.getName().equals(name) && chokolate.getСalories() == calories)
                    return chokolate;
            }
        }
        return null;
    }


}
