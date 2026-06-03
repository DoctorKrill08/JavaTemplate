package Games.Casino;

public class Casino {
    public enum Game{
        COIN_TOSS,
        HORSE_RACE
    }
    Game game = Game.COIN_TOSS;
    CoinTossGame coinGame = new CoinTossGame();
    HorseRace horseRace = new HorseRace();
    public void setGame(Game newGame){
        System.out.println(newGame + " selected");
        game = newGame;
    }
    public Game getGame(){
        return game;
    }
    public int gamble(int money){
        switch (game){
            case COIN_TOSS:
                return coinGame.toss(money);
            case HORSE_RACE:
                return horseRace.betOnHorse(money);
        }
        return money;
    }








    public int monopolyMovement(){
        int dice1 = (int) (Math.random() * 6);
        int dice2 = (int) (Math.random() * 6);
        //Reroll on doubles
        if (dice1 == dice2) {
            dice1 = dice1 + (int) (Math.random() * 6);
            dice2 = dice2 + (int) (Math.random() * 6);
        }
        //Total tiles moved
        return dice1 + dice2;
    }
}
