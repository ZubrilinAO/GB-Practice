package HW_3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };
        int salary = 0;
        int age = random.nextInt(20, 25);
        boolean isFreelancer = random.nextBoolean();

        if (isFreelancer) {
            int hoursWorked = random.nextInt(60, 120);
            salary = random.nextInt(500, 1000);

            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                    salary, hoursWorked, age);
        } else {
            salary = random.nextInt(20000, 80000);

            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                    salary, age);
        }
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[20];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        System.out.println("Сортировка по фамилии + имени:");
        Arrays.sort(employees, new LastNameFirstNameComparator());
        printEmployees(employees);

        System.out.println("\n\nСортировка по возрасту + уровню зп.:");
        Arrays.sort(employees, new AgeSalaryComparator());
        printEmployees(employees);
    }
}
