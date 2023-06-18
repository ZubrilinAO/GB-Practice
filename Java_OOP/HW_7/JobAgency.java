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
            observer.receiveOffer(companyName, vacancy);
        }
    }
}

// public void checkVacancy(String vacancyType, Vacancy vacancy) {
// for (Observer observer : observers) {
// JobSeeker seeker = (JobSeeker) observer;
// if (seeker.vacancyType.equals(vacancyType)) {
// seeker.receiveOffer( vacancy );
// }
// }
// }

// public class JobAgency {

// public void registerSeeker(JobSeeker seeker) {
// // Регистрируем искателя работы
// }

// public void checkVacancy(String vacancyType, JobSeeker seeker){
// if (vacancyType.equals(seeker.vacancyType)){
// seeker.notify(vacancyType);
// }
// }
// }