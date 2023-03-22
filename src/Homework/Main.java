package Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 20, 500));
        employees.add(new Employee(2, "Olivia", 23, 900));
        employees.add(new Employee(3, "Tim", 25, 1000));
        employees.add(new Employee(4, "Jack", 23, 700));
        employees.add(new Employee(5, "Mary", 20, 200));
        employees.add(new Employee(6, "Emily", 23, 900));
        System.out.println("Before sorting : ");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("------------------Name sorting : ------------------");

        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("------------------Age sorting : ------------------");
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("------------------Salary sorting : ------------------");
        Collections.sort(employees, new Salary());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("------------------ID sorting : ------------------");
        Collections.sort(employees, new ID());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("------------------ageAndThenName sorting : ------------------");
        Collections.sort(employees, new ageAndThenName());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        /*Before sorting :
Employee{id=1, name='John', age=20, salary=500}
Employee{id=2, name='Olivia', age=23, salary=900}
Employee{id=3, name='Tim', age=25, salary=1000}
Employee{id=4, name='Jack', age=23, salary=700}
Employee{id=5, name='Mary', age=20, salary=200}
Employee{id=6, name='Emily', age=23, salary=900}
------------------Name sorting : ------------------
Employee{id=6, name='Emily', age=23, salary=900}
Employee{id=4, name='Jack', age=23, salary=700}
Employee{id=1, name='John', age=20, salary=500}
Employee{id=5, name='Mary', age=20, salary=200}
Employee{id=2, name='Olivia', age=23, salary=900}
Employee{id=3, name='Tim', age=25, salary=1000}
------------------Age sorting : ------------------
Employee{id=6, name='Emily', age=23, salary=900}
Employee{id=4, name='Jack', age=23, salary=700}
Employee{id=1, name='John', age=20, salary=500}
Employee{id=5, name='Mary', age=20, salary=200}
Employee{id=2, name='Olivia', age=23, salary=900}
Employee{id=3, name='Tim', age=25, salary=1000}
------------------Salary sorting : ------------------
Employee{id=5, name='Mary', age=20, salary=200}
Employee{id=1, name='John', age=20, salary=500}
Employee{id=4, name='Jack', age=23, salary=700}
Employee{id=6, name='Emily', age=23, salary=900}
Employee{id=2, name='Olivia', age=23, salary=900}
Employee{id=3, name='Tim', age=25, salary=1000}
------------------ID sorting : ------------------
Employee{id=1, name='John', age=20, salary=500}
Employee{id=2, name='Olivia', age=23, salary=900}
Employee{id=3, name='Tim', age=25, salary=1000}
Employee{id=4, name='Jack', age=23, salary=700}
Employee{id=5, name='Mary', age=20, salary=200}
Employee{id=6, name='Emily', age=23, salary=900}
------------------ageAndThenName sorting : ------------------
Employee{id=1, name='John', age=20, salary=500}
Employee{id=2, name='Olivia', age=23, salary=900}
Employee{id=3, name='Tim', age=25, salary=1000}
Employee{id=4, name='Jack', age=23, salary=700}
Employee{id=5, name='Mary', age=20, salary=200}
Employee{id=6, name='Emily', age=23, salary=900}*/
    }
}