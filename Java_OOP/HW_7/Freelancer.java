package HW_7;

import java.util.Random;

public class Freelancer implements Observer {

    private static Random random = new Random();
    private String name;
    private VacancyType vacancyType;
    private double minSalary;

    public Freelancer(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
        minSalary = random.nextDouble(2000, 4000);
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()) {
            System.out.printf("Фрилансер(%s) %s (%.3f) >>> Мне нужна эта работа! [%s, %s(%s) - %.3f]\n",
                    vacancyType, name, minSalary, companyName, vacancy.getTitle(), vacancy.getType(),
                    vacancy.getSalary());
        } else {
            System.out.printf("Фрилансер(%s) %s >>> Я найду работу получше (%f)! [%s %s(%s) - %f]\n",
                    vacancyType, name, minSalary, companyName, vacancy.getTitle(), vacancy.getType(),
                    vacancy.getSalary());
        }
    }
}