package Games.CoinToss;

public class HorseRace {
    public final int MONEY_MULTIPLIER = 2;
    public final int NUMBER_OF_HORSES = 5;
    public int betOnHorse(int money){
        double result = Math.random(); //Range from 0 to 1
        int placement = 1;
        //i goes from 1 to 5
        for (int i = 1; i <= NUMBER_OF_HORSES; i++){
            if (result < (double) i/NUMBER_OF_HORSES){
                result = (double) i/NUMBER_OF_HORSES;
                //1 -> 1/5 back
                //2 -> 2/5 back
                //3 -> 3/5 back
                //4 -> 4/5 back
                //5 -> 5/5 back
                placement = NUMBER_OF_HORSES - i + 1;
                break;
            }
        }
        System.out.println("Your horse placed at #" + placement + " out of " + NUMBER_OF_HORSES);
        if (placement == 1){
            return money * MONEY_MULTIPLIER;
        }
        return (int) (money * result * MONEY_MULTIPLIER);

    }

}
