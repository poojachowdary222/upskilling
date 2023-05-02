package oopcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
    }
}

