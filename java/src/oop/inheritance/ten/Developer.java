package oop.inheritance.ten;

import java.util.List;
import java.util.Map;

public class Developer extends Employee {
    private Map<String, List<String>> techStack;

    public Developer(String name, String address, double salary, String jobTitle, Map<String, List<String>> techStack) {
        super(name, address, salary, jobTitle);
        this.techStack = techStack;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public String generateReport() {
        return "Developer's report";
    }

    public Map<String, List<String>> getTechStack() {
        return techStack;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "techStack=" + techStack.keySet() + techStack.values() +
                '}';
    }
}
