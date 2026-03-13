package Games.CoinToss;

public class Player {
    public final int STARTING_MONEY = 100;
    private int money = STARTING_MONEY;
    public void restart(){
        money = STARTING_MONEY;
    }
    public int getMoney(){
        return money;
    }
    public void setMoney(int newMoney){
        money = newMoney;
    }
    public void spend(int amount){
        money = money - amount;
    }
    public void gain(int amount){
        money = money + amount;
    }
}
