package Games.ParentReactionToYourGradeSimulator;

public class Code {
    public enum ParentStrictness{
        ABSENT,
        MEDIUM,
        IRL
    }
    private ParentStrictness parentStrictness = ParentStrictness.MEDIUM;
    private int grade = 0;
    public void setParentStrictness(ParentStrictness newParentStrictness){
        parentStrictness = newParentStrictness;
    }
    public void setGrade(int newGrade){
        grade = newGrade;
    }
    public ParentStrictness getParentStrictness(){
        return parentStrictness;
    }
    public int getGrade(){
        return grade;
    }
    public String printResults(){
        //Absent Parent
        if (parentStrictness == ParentStrictness.ABSENT){
            return "... (They are absent they can't say anything)";
        }

        //Strict Parent
        if (parentStrictness == ParentStrictness.IRL){
            if (grade < 80){
                return "Terrible. (Beating incoming...)";
            }
            if (grade < 90){
                return "Not good enough you are failure";
            }
            return "Your cousin Timmy got into harvard at the age of 5";
        }

        //At this point this must be medium strictness
        if (grade >= 90){
            return "GOOD JOB YOU GOT AN A!!!";
        }
        if (grade >= 80){
            return "Okay a B";
        }
        //At this point the grade must be below a B
        return "Get your grade up little bro";
    }

}
