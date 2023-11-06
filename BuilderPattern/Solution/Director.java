package BuilderPattern.Solution;

public class Director {

    StudentBuilder sb;

    Director(StudentBuilder sb) {
        this.sb = sb;
    }

    public Student createStudent() {
        if (sb instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (sb instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return sb.setRollNumber(1).setAge(22).setName("sj").setSubjects().build();
    }

    private Student createMBAStudent(){
        return sb.setRollNumber(1).setAge(21).setName("Leo Das").setFatherName("Anthony Das").setMotherName("Jane Das").setSubjects().build();
    }
}
