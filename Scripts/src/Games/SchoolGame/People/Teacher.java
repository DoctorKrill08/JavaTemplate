package Games.SchoolGame.People;

public class Teacher extends Person{
    public enum Topic{
        MATH,
        SCIENCE,
        ENGLISH,
        SOCIAL_STUDIES
    }
    Topic topic;
    public Teacher(String name, Topic topic){
        super(name);
        this.topic = topic;
    }
    public static Topic generateTopic(){
        int randomNumber = (int) (Math.random() * Topic.values().length);
        return Topic.values()[randomNumber];
    }
    @Override
    public String info(){
        return super.info() + " is a teacher and teaches " + topic;
    }
}
