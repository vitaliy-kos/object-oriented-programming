package Homework05.views;

import Homework05.models.Table;
import Homework05.presenters.View;
import Homework05.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationId) {
        if (reservationId > 0){
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationId);
        }
        else {
            System.out.println("Не удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }

    @Override
    public void showChangeReservationResult(int oldReservationId, int newReservationId) {
        System.out.printf("Бронирование #%d успешно отменено. Номер нового бронирования #%d.\n", oldReservationId, newReservationId);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void reservationTable(Date orderDate, int tableNo, String name){
        observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * Действие клиента (пользователь нажал на кнопку отмены бронирования)
     * Отменить резерв столика, забронировать на другое время
     * @param oldReservation старый номер брони
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, orderDate, tableNo, name);
    }

}
