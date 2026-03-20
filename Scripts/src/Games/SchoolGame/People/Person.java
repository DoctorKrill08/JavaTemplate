package Games.SchoolGame.People;

public class Person {
    static final String NAMES[] = new String[]{
            "BOB",
            "BILL",
            "TIMMY",
            "ALEX",
            "SAM",
            "LING LONG",
            "FURY v2",
            "qelnweflkwn",
            "Alicia",
            "Sally",
            "HelpMeHelpmeHelpme"
    };
    public static Person generate(){
        return new Person(generateName());
    }
    public static String generateName(){
        int randomNumber = (int) (Math.random() * NAMES.length);
        return NAMES[randomNumber];
    }
    String name;
    public Person(String name){
        this.name = name;
    }
    public String info(){
        return "Person " + name;
    }
}
