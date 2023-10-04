package Homework04;

import java.util.ArrayList;

public class Box<T extends Fruct> {

    ArrayList<T> fructs;
    String type;

    public Box(){
        this.fructs = new ArrayList<>();
    }

    public Boolean putFruit(T fruit) {

        if (fructs.size() == 0) setType(fruit);

        if (checkFructType(fruit)) {
            fructs.add(fruit);
            // System.out.println("Фрукт успежно уложен в ящик.");
            return true;
        }
        
        System.out.println("Невозможно положить, т.к. ящик уже заполнен другими фруктами.");
        return false;
        
    }

    public Boolean pourOverToBox(Box<T> box) {

        if (this.isFilledBox()) {

            if ( (box.isFilledBox() && checkFructType(box)) || !box.isFilledBox()) {
                this.moveFructsTo(box);
                this.clearBox();
                return true;
            }
            else {
                System.out.println("Пересыпать нельзя, в ящике другие фрукты.");
                return false;
            }
            
        } 
        else {
            System.out.println("Нечего пересыпать, т.к. ящик пуст.");
            return false;
        }
        
    }

    public void moveFructsTo(Box<T> box) {
        for (T fruct : this.fructs) {
            box.putFruit(fruct);
        }
    }

    public float getWeight() {

        if (isFilledBox())
            return fructs.get(0).getWeight() * fructs.size();

        return 0f;
    }

    public Boolean compare(Box<T> box) {
        return this.getWeight() == box.getWeight();
    }

    private Boolean isFilledBox() {
        return this.fructs.size() > 0;
    }

    private Boolean checkFructType(Box<T> box) {

        return checkFructType(box.fructs.get(0));
    }

    private Boolean checkFructType(T fruit) {

        if (fruit instanceof Apple) {
            if (this.type == "Apple")
                return true;
        }
        else if (fruit instanceof Orange) {
            if (this.type == "Orange")
                return true;
        }

        return false;
    }

    private void setType(T fruit) {

        if (fruit instanceof Apple) {
            this.type = "Apple";
        } 
        else if (fruit instanceof Orange) {
            this.type = "Orange";
        }

    }

    private void clearBox() {
        this.fructs = new ArrayList<>();
        this.type = "";
    }

    @Override
    public String toString() {
        if (isFilledBox()) {
            return String.format("[Box with %s] %d pcs.",  this.type, fructs.size());
        }
        else {
            return String.format("[Empty box]");
        }
        
    }

}
