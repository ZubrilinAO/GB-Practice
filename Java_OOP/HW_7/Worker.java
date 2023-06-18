package HW_7;

import java.util.Random;

public class Worker implements Observer {
    protected static Random random = new Random();

    protected String name;
    protected VacancyType vacancyType;
    protected double minSalary;
    protected String workerText;

    protected boolean isMatched = false;
    protected Vacancy matchedJob;

    public Worker(String name, VacancyType vacancyType) {
        this.name = name;
        this.vacancyType = vacancyType;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public Vacancy getMatchedJob() {
        return matchedJob;
    }

    public boolean isMatched() {
        return isMatched;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()) {
            System.out.printf("%s(%s) %s (%.3f) >>> Мне нужна эта работа! [%s, %s(%s) - %.3f]\n",
                    workerText, vacancyType, name, minSalary, companyName, vacancy.getTitle(), vacancy.getType(),
                    vacancy.getSalary());
            isMatched = true;
            matchedJob = vacancy;
        } else {
            System.out.printf("%s(%s) %s >>> Я найду работу получше (%.3f)! [%s %s(%s) - %.3f]\n",
                    workerText, vacancyType, name, minSalary, companyName, vacancy.getTitle(), vacancy.getType(),
                    vacancy.getSalary());
        }
    }
}
