package PrototypePattern.Solution;

public class ClientCanClone {
    public static void main(String[] args) {
        Student obj = new Student("Leo", 21, 10);
        Student cloneObj = (Student) obj.clone();
    }
    
}
