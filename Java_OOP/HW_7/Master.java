package HW_7;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;
    private VacancyType vacancyType;

    private double minSalary;

    public Master(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
        minSalary = random.nextDouble(60000, 80000);
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()) {
            System.out.printf("Рабочий(%s) %s (%.3f) >>> Мне нужна эта работа! [%s, %s(%s) - %.3f]\n",
                    vacancyType, name, minSalary, companyName, vacancy.getTitle(), vacancy.getType(),
                    vacancy.getSalary());
        } else {
            System.out.printf("Рабочий(%s) %s >>> Я найду работу получше (%f)! [%s %s(%s) - %f]\n",
                    vacancyType, name, minSalary, companyName, vacancy.getTitle(), vacancy.getType(),
                    vacancy.getSalary());
        }
    }
}
