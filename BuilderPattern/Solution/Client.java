package BuilderPattern.Solution;

public class Client {
    public static void main(String[] args) {
        Director d1 = new Director(new EngineeringStudentBuilder());
        Director d2 = new Director(new MBAStudentBuilder());

        Student engineeringStudent = d1.createStudent();
        Student mbaStudent = d2.createStudent();

        System.out.println(engineeringStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
