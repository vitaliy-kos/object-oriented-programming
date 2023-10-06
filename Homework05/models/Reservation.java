package Homework05.models;

import java.util.Date;

public class Reservation {

    private Date date;

    private String name;

    private static int counter = 1000;

    private final int id;

    {
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("[Бронирование]%d - %s - %s", id, name, date);
    }
}
