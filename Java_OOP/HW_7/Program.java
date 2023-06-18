package HW_7;

import java.util.Random;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования
     * Observer,
     * добавить свой собственный тип/типы соискателя.
     * 2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * 3**. Предусмотреть тип вакансии (enum)
     * 
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        Master ivanov = new Master("Ivanov", VacancyType.FULL_TIME);
        Master petrov = new Master("Petrov", VacancyType.FULL_TIME);
        Student sidorov = new Student("Sidorov", VacancyType.INTERSHIP);
        Freelancer gordeev = new Freelancer("Gordeev", VacancyType.PART_TIME);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(gordeev);

        for (int i = 0; i < 10; i++) {
            geekBrains.needEmployee("DevOps Engineer", VacancyType.FULL_TIME, random.nextDouble(3000, 70000));
            google.needEmployee("Mobile Developer", VacancyType.PRACTICE, random.nextDouble(3000, 100000));
            yandex.needEmployee("DevOps Engineer", VacancyType.INTERSHIP, random.nextDouble(3000, 120000));
        }
    }
}
