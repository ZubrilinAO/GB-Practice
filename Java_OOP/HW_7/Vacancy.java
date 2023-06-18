package HW_7;

public class Vacancy {
    private String title;
    private VacancyType type;

    private double salary;

    public Vacancy(String title, VacancyType type, double salary) {
        this.title = title;
        this.type = type;
        this.salary = salary;
    }

    public Vacancy(String title, VacancyType type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public VacancyType getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }

}