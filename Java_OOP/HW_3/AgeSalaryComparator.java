package HW_3;

import java.util.Comparator;

public class AgeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int ageComparison = Integer.compare(o1.getAge(), o2.getAge());
        if (ageComparison != 0) {
            return ageComparison;
        } else {
            return Double.compare(o1.calculateSalary(), o2.calculateSalary());
        }
    }
}