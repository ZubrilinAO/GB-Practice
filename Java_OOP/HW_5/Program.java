package HW_5;

import HW_5.models.TableModel;
import HW_5.presenters.BookingPresenter;
import HW_5.presenters.Model;
import HW_5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     * 
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()
        bookingView.reservationTable(new Date(), 1103, "Станислав");

        bookingView.reservationTable(new Date(), 102, "Станислав");
        bookingView.reservationTable(new Date(), 103, "Александр");

        // несуществующий id резерва
        bookingView.changeReservationTable(9004, new Date(), 103, "Александр");

        //корректный id резерва
        bookingView.changeReservationTable(9002, new Date(), 103, "Александр");

    }

}
