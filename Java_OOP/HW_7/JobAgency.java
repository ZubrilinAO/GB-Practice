package HW_7;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, Vacancy vacancy) {
        for (Observer observer : observers) {
            Worker worker = (Worker) observer;
            if (worker.vacancyType.equals(vacancy.getType())) {
                observer.receiveOffer(companyName, vacancy);
            }

        }
    }
}
