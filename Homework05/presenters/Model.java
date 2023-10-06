package Homework05.presenters;

import Homework05.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    void printAllReservation();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int tableNoOld, Date reservationDate, int tableNo, String name);

}
