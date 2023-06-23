package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model tableModel;
    private final View bookingView;
    public BookingPresenter(Model tableModel, View bookingView){
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.showTables(loadTables());
    }

    public void printReservationTableResult(int reservationId){
        bookingView.printReservationTableResult(reservationId);
    }

    public void printReservationTableError(String errorMessage){
        bookingView.printReservationTableError(errorMessage);
    }

    public void printRemoveReservationTableResult(int oldReservationId){
        bookingView.printRemoveReservationTableResult(oldReservationId);
    }

    public void printRemoveReservationTableError(String errorMessage){
        bookingView.printRemoveReservationTableError(errorMessage);
    }

    public void printChangeReservationTableResult(int oldReservationId, int newReservationId){
        bookingView.printChangeReservationTableResult(oldReservationId, newReservationId);
    }

    public void printChangeReservationTableError(String errorMessage){
        bookingView.printChangeReservationTableError(errorMessage);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.reservationTable(orderDate, tableNo, name);
            printReservationTableResult(reservationId);
        }
        catch (RuntimeException e){
            printReservationTableError(e.getMessage());
        }
    }

    @Override
    public void onRemoveReservationTable(int oldReservation, int tableNo) {
        try
        {
            tableModel.removeReservationTable(oldReservation, tableNo);
            printRemoveReservationTableResult(oldReservation);
        }
        catch (RuntimeException e){
            printRemoveReservationTableError(e.getMessage());
        }
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.changeReservationTable(oldReservation, orderDate, tableNo, name);
            printChangeReservationTableResult(oldReservation, reservationId);
        }
        catch (RuntimeException e){
            printChangeReservationTableError(e.getMessage());
        }
    }


}
