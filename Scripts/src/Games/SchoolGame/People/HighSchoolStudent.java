package Games.SchoolGame.People;

public class HighSchoolStudent extends Student {
    public static int numberOfStudents = 0;
    double gpa = 4.0;
    public HighSchoolStudent(String name, int gradeLevel, double gpa){
        super(name,gradeLevel);
        this.gpa = gpa;
    }
    public String gradeToString(){
        switch (gradeLevel){
            case 9:
                return "Freshman";
            case 10:
                return "Sophomore";
            case 11:
                return "Junior";
            case 12:
                return "Senior";
        }
        return "";
    }
    public static HighSchoolStudent generateHighSchoolStudent(){
        return new HighSchoolStudent(generateName(),generateGradeLevel(),generateGpa());
    }
    public static double generateGpa(){
        return Math.random() * 4.0;
    }
    @Override
    public String info(){
        return super.info() + " and is a " + gradeToString() + "in high school with a gpa of " + gpa;
    }
}
