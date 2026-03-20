package Games.SchoolGame.People;

public class HighSchoolStudent extends Student {
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
    public static HighSchoolStudent generateHighSchoolStudent(int gradeLevel){
        return new HighSchoolStudent(generateName(),gradeLevel,generateGpa());
    }
    public static double generateGpa(){
        return Math.random() * 4.0;
    }
    public static int generateGradeLevel(){
        return (int) (9 + Math.random() * 4);
    }
    @Override
    public String info(){
        return super.info() + " and is a " + gradeToString() + " in high school with a gpa of " + gpa;
    }
}
