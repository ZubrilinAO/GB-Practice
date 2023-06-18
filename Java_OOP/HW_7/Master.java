package HW_7;

public class Master extends Worker {
    public Master(String name, VacancyType vacancyType) {
        super(name, vacancyType);
        workerText = "Рабочий";
        minSalary = random.nextDouble(60000, 80000);
    }
}
