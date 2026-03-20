package Games.SchoolGame.People;

public class Student extends Person {
    public static int numberOfStudents = 0;
    public static final int MAX_GRADE = 12;
    int studentId;
    int gradeLevel;
    public static Student generate(){
        int gradeLevel = generateGradeLevel();
        if (gradeLevel >= 9) {
            return HighSchoolStudent.generateHighSchoolStudent(gradeLevel);
        }else{
            return new Student(generateName(),gradeLevel);
        }
    }
    public Student(String name, int gradeLevel){
        super(name);
        this.gradeLevel = gradeLevel;
        studentId = numberOfStudents;
        numberOfStudents++;
    }
    public static int generateGradeLevel(){
        return (int) (Math.random() * MAX_GRADE) + 1;
    }
    @Override
    public String info(){
        return super.info() + " is a student with an id of " + studentId + " and is in grade level " + gradeLevel;
    }
}
