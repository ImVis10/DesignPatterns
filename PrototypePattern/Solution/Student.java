package PrototypePattern.Solution;

public class Student implements Prototype {
    String name;
    int age;
    private int rollNumber;

    Student() {

    }

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public Prototype clone() {
        return new Student(name, age, rollNumber);
    }
}
