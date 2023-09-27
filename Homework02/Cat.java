package Homework02;
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this(name, appetite, false);
    }

    public int getAppetite() {
        return this.appetite;
    }

    /*
    * Пункт 2 задания - добавлена возможность поесть и изменить состояние сытости, а также возвращен false, если корма в тарелке недостаточно.
    */
    public boolean eat(Plate plate) {
        int remains = plate.getFood() - this.getAppetite();

        if (remains >= 0) {
            plate.setFood(remains);
            this.satiety = true;
            System.out.printf("%s поел из тарелки \"%s\" и стал сытым. \n\n", this.name, plate.getName());
            return true;
        }
        
        System.out.printf("Коту по имени %s не хватает еды в тарелке \"%s\" и он остался голодным из-за того, что в тарелке осталось всего %d еды, а ему нужно %d. \n\n", this.name, plate.getName(), plate.getFood(), this.appetite);
        return false;
    }

    @Override
    public String toString() {
        return String.format("[Кот] %s - Сытость: %s - Аппетит: %d",
                this.name, this.satiety, this.appetite);
    }
}