package HW_7;

public class Freelancer extends Worker {
    public Freelancer(String name, VacancyType vacancyType) {
        super(name, vacancyType);
        workerText = "Фрилансер";
        minSalary = random.nextDouble(2000, 4000);
    }
}