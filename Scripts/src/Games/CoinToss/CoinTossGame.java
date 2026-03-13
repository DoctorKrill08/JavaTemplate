package Games.CoinToss;

public class CoinTossGame {
    public final double ODDS_OF_WINNING_COIN_TOSS = 0.5;
    public final double COIN_TOSS_REWARD = 2; //Double money!
    public int toss(int money){
        double result = Math.random(); //Range from 0 to 1
        if (result > ODDS_OF_WINNING_COIN_TOSS){
            System.out.println("YOU WON");
            return (int) (money * COIN_TOSS_REWARD);
        }else{
            System.out.println("YOU LOST");
            return 0;
        }

    }

}
