package Homework;

import java.util.Comparator;

public class Salary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.salary,o2.salary);
    }
}
