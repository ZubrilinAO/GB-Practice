package HW_5.presenters;

import HW_5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * 
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
