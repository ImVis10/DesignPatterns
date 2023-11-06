package BuilderPattern.Solution;

import java.util.List;

public class Student {
    int rollNumber;
    int age;
    String name;
    String motherName;
    String fatherName;
    List<String> subjects;

    public Student(StudentBuilder sb) {
        this.rollNumber = sb.rollNumber;
        this.age = sb.age;
        this.name = sb.name;
        this.motherName = sb.motherName;
        this.fatherName = sb.fatherName;
        this.subjects = sb.subjects;
    }

    public String toString(){
        return ""+ " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " father name: " + this.fatherName +
                " mother name: " + this.motherName +
                " subjects: " + subjects.get(0) + "," + subjects.get(1) + "," + subjects.get(2);
    }
}
