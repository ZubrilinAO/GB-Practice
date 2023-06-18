package HW_7;

public class Student extends Worker {
    public Student(String name, VacancyType vacancyType) {
        super(name, vacancyType);
        minSalary = random.nextDouble(3500, 5000);
        workerText = "Студент";
    }
}
