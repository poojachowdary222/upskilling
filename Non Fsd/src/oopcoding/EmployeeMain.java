package oopcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("John", 1001, 50000));
        employees.add(new Employee("Jane", 1002, 75000));
        employees.add(new Employee("Peter", 1003, 100000));
        employees.add(new Employee("Susan", 1004, 90000));
        employees.add(new Employee("David", 1005, 80000));

        // Sort employees by salary in descending order
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        });

        // Display the top 3 highest-paid employees
        System.out.println("Top 3 highest-paid employees:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + employees.get(i));
        }
    }
}
