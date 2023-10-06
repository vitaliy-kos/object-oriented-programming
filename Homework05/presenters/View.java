package Homework05.presenters;

import Homework05.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     */
    void showReservationTableResult(int reservationId);

    /**
     * Отобразить результат отмены бронирования столика и создания новой брони
     * @param reservationId номер брони для отмены
     */
    void showChangeReservationResult(int oldReservationId, int newReservationId);

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    void reservationTable(Date orderDate, int tableNo, String name);

    /**
     * Действие клиента (пользователь нажал на кнопку изменения бронирования), внесение изменений в бронирование столика
     * @param tableNoOld старый номер столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    void changeReservationTable(int tableNoOld, Date orderDate, int tableNo, String name);

    /**
     * Установить наблюдателя для представления
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

}
