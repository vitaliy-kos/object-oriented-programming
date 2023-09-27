package Homework02;
public class Plate {
    private String name;
    private int food;

    public Plate(String name, int food) {
        this.name = name;
        this.food = food;
    }

    public void info() {
        System.out.printf("%s: остаток еды - %d \n", this.name, this.food);
    }

    public String getName() {
        return this.name;
    }

    public int getFood() {
        return this.food;
    }
    
    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        }
        /*
         * По пункту 1 задачи необходимо сделать так, чтобы значение оставшейся еды в тарелке было неотрицательным.
         */
        else {
            this.food = 0;
        }
    }

    public void addFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return String.format("[Тарелка] %s - Остаток еды: %d",
                this.name, this.food);
    }
}