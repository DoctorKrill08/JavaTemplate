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
            "HelpMeHelpmeHelpme",
            "camelCase",
            "words fr"
    };
    String name;
    public Person(String name){
        this.name = name;
    }
    public String info(){
        return "Person " + name;
    }
    public static String generateName(){
        int randomNumber = (int) (Math.random() * NAMES.length);
        return NAMES[randomNumber];
    }
}
