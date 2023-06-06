package HW_3;

import java.util.Comparator;

public class LastNameFirstNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int lastNameComparison = o1.getSurname().compareTo(o2.getSurname());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}

