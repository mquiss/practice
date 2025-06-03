package oop.inheritance.four;

import java.util.ArrayList;
import java.util.List;

public class HRManager extends Employee {
    private List<Employee> employeeList;

    public HRManager(double salary) {
        super(salary);
        this.employeeList = new ArrayList<>();
    }

    @Override
    public void work() {
        System.out.println("Managing employees");
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "employeeList=" + employeeList +
                '}';
    }
}
