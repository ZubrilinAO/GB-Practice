package HW_5.models;

import HW_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить все столики
     * 
     * @return
     */
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

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
     * 
     * @param reservationDate Дата бронирования
     * @param tableNo         Номер столика
     * @param name            Имя клиента
     */
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                for (Reservation reservation : table.getReservations()) {
                    if (reservation.getId() == oldReservation) {
                        table.getReservations().remove(reservation);
                        int reservationId = reservationTable(reservationDate, tableNo, name);
                        return reservationId;
                    }
                }
                throw new RuntimeException("Некорректный идентификатор бронирования.");
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }
}
