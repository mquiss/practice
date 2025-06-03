package oop.inheritance.ten;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Programmer extends Developer { // same bonus
    private List<String> programmingLanguages;

    public Programmer(String name, String address, double salary, String jobTitle, Map<String, List<String>> techStack ) {
        super(name, address, salary, jobTitle, techStack);
        this.programmingLanguages = getTechStack().get("Languages");
    }

    @Override
    public String generateReport() {
        return "Programmer's report";
    }

    public void code() {
        System.out.println(getName() + " can code in " + programmingLanguages);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguages=" + programmingLanguages +
                '}';
    }
}
