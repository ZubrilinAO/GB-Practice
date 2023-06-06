package HW_3;

public class Freelancer extends Employee {

    private int hoursWorked;

    public Freelancer(String name, String surname, double salary, int hoursWorked, int age) {
        super(name, surname, salary, age);

        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return salary * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s; Возраст: %d; Фрилансер; Среднемесячная заработная плата (почасовая оплата): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}