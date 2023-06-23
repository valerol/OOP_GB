package ru.geekbrains.lesson5.views;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    @Override
    public void printReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
    }

    @Override
    public void printReservationTableError(String errorMessage) {
        System.out.printf("Невозможно забронировать столик. \n%s\n", errorMessage);
    }

    @Override
    public void printRemoveReservationTableResult(int reservationNo) {
        System.out.printf("Бронь #%d успешно отменена\n", reservationNo);
    }

    @Override
    public void printRemoveReservationTableError(String errorMessage) {
        System.out.printf("Невозможно отменить бронь. \n%s\n", errorMessage);
    }

    @Override
    public void printChangeReservationTableResult(int oldReservationNo, int newReservationNo) {
        System.out.printf("Бронь #%d успешно изменена на #%d\n", oldReservationNo, newReservationNo);
    }

    @Override
    public void printChangeReservationTableError(String errorMessage) {
        System.out.printf("Невозможно изменить бронь. \n%s\n", errorMessage);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
            if (table.getReservations().size() > 0) {
                System.out.println(table.getReservations());
            };
        }
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * TODO: реализовать функционал изменения бронирования столика самостоятельно в рамках домашнего задания
     * Действие клиента (пользователь нажал на кнопку изменения бронирования столика)
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */

    public void removeReservationTable(int oldReservation, int tableNo){
        observer.onRemoveReservationTable(oldReservation, tableNo);
    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}
