package Homework;

import java.util.Comparator;

public class ageAndThenName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o2.getAge() == o1.getAge()){
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getAge()-o2.getAge();


    }
}
