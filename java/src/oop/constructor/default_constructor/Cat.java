package oop.constructor.default_constructor;

public class Cat {
    private String name;
    private int age;

    public Cat(){
        this.name = "Unknown";
        this.age = 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
