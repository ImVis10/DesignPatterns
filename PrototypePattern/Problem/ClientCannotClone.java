package PrototypePattern.Problem;

public class ClientCannotClone {
    public static void main(String[] args) {
        Student obj = new Student("Leo", 21, 10);

        // cloning the object created above
        Student clone = new Student();
        clone.name = obj.name;
        clone.age = obj.age;
        clone.rollNumber = obj.rollNumber; // as you can see this gives issue as rollNumber is a private member of Student class and it is not visible outside of Student
    }
}
