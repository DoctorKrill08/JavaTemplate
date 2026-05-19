package Games.NumberGame;


import java.util.Scanner;

public class Handler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Guess a number 1-5 (any other # to quit)");
       int number = (int) (Math.random() * 5);
       boolean playing = true;
       while (playing){
           int input = scanner.nextInt();
           if (input < 1 || input > 5){
               playing = false;
               System.out.println("Quitting");
               return;
           }
           if (input == number){
               System.out.println("Correct! The number is " + number);
               playing = false;
           }else{
               System.out.println("Incorrect try again!");
           }
       }
    }
}
