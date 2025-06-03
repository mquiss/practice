package oop.inheritance.ten;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> subordinateList;

    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
        this.subordinateList = new ArrayList<>();
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public String generateReport() {
        return "Manager's report";
    }

    public void managingProject() {
        System.out.println("Managing a project");
    }

    public void addSubordinate(Employee employee) {
        subordinateList.add(employee);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "subordinateList=" + subordinateList +
                '}';
    }
}
