package Games.Casino;

import java.util.Scanner;

public class Handler {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Casino casino = new Casino();

        boolean playing = true;
        while (playing){
            System.out.println("What game would you like to gamble in (1 - Coin Toss), (2 - Horse Race), (Any other # - Quit)");
            int input = scanner.nextInt();
            if (input != 1 && input != 2){
                playing = false;
                break;
            }
            if (input == 1){
                casino.setGame(Casino.Game.COIN_TOSS);
            }else{
                casino.setGame(Casino.Game.HORSE_RACE);
            }
            System.out.println("How much money would you like to invest");
            System.out.println("You have " + player.getMoney() + " dollars");
            input = scanner.nextInt();

            if (input > player.getMoney()){
                input = player.getMoney();
            }
            if (input <= 0){
                System.out.println("YOU'RE BROKE!!!");
                playing = false;
                break;
            }

            player.spend(input);
            player.gain(casino.gamble(input));

            System.out.println("You have " + player.getMoney() + " dollars");
        }


    }
}
