package Games.SchoolGame.People;

public class Teacher extends Person{
    public enum Topic{MATH, SCIENCE, ENGLISH, SOCIAL_STUDIES}
    Topic topic;
    public static Topic generateTopic(){
        int randomNumber = (int) (Math.random() * Topic.values().length);
        return Topic.values()[randomNumber];
    }
    public static Teacher generate(){
        return new Teacher(generateName(),generateTopic());
    }
    public Teacher(String name, Topic topic){
        super(name);
        this.topic = topic;
    }
    @Override
    public String info(){
        return super.info() + " is a teacher and teaches " + topic;
    }
}
