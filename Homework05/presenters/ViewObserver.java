package Homework05.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    void onChangeReservationTable(int tableNoOld, Date orderDate, int tableNo, String name);

}
