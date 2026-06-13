package Games.PersonExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Hair hair = new Hair();
       long startTime = System.currentTimeMillis();
       System.out.println("INPUT SOMETHING:");
       String userInput = scanner.nextLine();
       long timePassed = System.currentTimeMillis() - startTime;
       double timePassedSeconds = timePassed / 1000.0;
        System.out.println(timePassed);
       hair.grow((int) timePassedSeconds);
       hair.haircut();
        System.out.println("HAIR: ");
       System.out.println(hair.length);
    }
}
