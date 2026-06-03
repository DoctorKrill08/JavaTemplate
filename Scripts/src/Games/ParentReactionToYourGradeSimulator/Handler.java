package Games.ParentReactionToYourGradeSimulator;

import java.util.Scanner;

public class Handler {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Code code = new Code();

       //Variables
       boolean playing = true;
       boolean validInput = false;

       //While playing do x. Playing var turned off when player decides after game ends
        while (playing){
            System.out.println("Select Your Parent Strictness:");
            System.out.println("ABSENT (1), MEDIUM (2), IRL (3)");
            //Promt the player to pick a number
            int intInput = scanner.nextInt();

            //Use a while loop to keep promting a player until they pick a valid number
            while (!validInput){
                validInput = true;
                switch (intInput){
                    case 1:
                        code.setParentStrictness(Code.ParentStrictness.ABSENT);
                        break;
                    case 2:
                        code.setParentStrictness(Code.ParentStrictness.MEDIUM);
                        break;
                    case 3:
                        code.setParentStrictness(Code.ParentStrictness.IRL);
                        break;
                    default:
                        validInput = false;
                        System.out.println("Invalid Input try again");
                        intInput = scanner.nextInt();
                        break;
                }
            }
            System.out.println(code.getParentStrictness() + " selected");
            System.out.println("Select your grade (0 to 100)");
            //Promt player to pick another number
            intInput = scanner.nextInt();
            if (intInput > 100){
                intInput = 100;
            }else if (intInput < 0){
                intInput = 0;
            }
            code.setGrade(intInput);

            System.out.println(code.getGrade() + " selected");

            System.out.println("Your Parent says: " + code.printResults());

            System.out.println("Do you want to play again? (Y or N)");
            String input = scanner.nextLine();
            input.toLowerCase();
            validInput = false;
            while (!validInput){
                if (input.equals("y")){
                    validInput = true;
                }else if (input.equals("n")){
                    validInput = true;
                    playing = false;
                }else{
                    if (!input.isEmpty()) {
                        System.out.println("Invalid Input" + input);
                    }
                    input = scanner.nextLine();
                }
            }
        }
    }

}
