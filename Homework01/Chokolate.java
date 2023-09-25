package Homework01;

public class Chokolate extends Product {

    private int calories; // калории

    public int getСalories() {
        return calories;
    }

    public void setСalories(int calories) {
        this.calories = calories;
    }

    public Chokolate(String brand, String name, double price, int calories) {
        super(brand, name, price);
        this.calories = calories;

    }

    @Override
    public String displayInfo() {
        return String.format("[ШОКОЛАД] %s - %s - %.2f - калорийность: %d",
                brand, name, price, calories);
    }
}
