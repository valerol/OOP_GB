package ru.geekbrains.lesson5.models;

import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить все столики
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null)
        {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    public boolean removeReservationTable(int oldReservation, int tableNo){
        for (Table table: tables) {
            if (table.getNo() == tableNo){
                for(Reservation res: table.getReservations()) {
                    if (res.getId() == oldReservation) {
                        return table.getReservations().remove(res);
                    }
                }
            }
        }
        throw new RuntimeException("Некорректный номер столика или брони");
    }

    /**
     * TODO: Разработать самостоятельно в рамках домашней работы
     * Поменять бронь столика
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        removeReservationTable(oldReservation, tableNo);
        return reservationTable(reservationDate, tableNo, name);
    }

}
