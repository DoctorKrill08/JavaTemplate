package Games.CoffeeExample;

public class Coffee {
    final int MAX_COFFEE = 5;
    int coffee = MAX_COFFEE;
    public void drink(){
        System.out.println("DRINK");
        if (coffee > 0){
            coffee = coffee - 1;
        }else{
            System.out.println("EMPTY");
        }
        System.out.println(coffee + " sips left");
    }
    public void refill(){
        coffee = MAX_COFFEE;
        System.out.println("REFILL");
        System.out.println(coffee + " sips left");
    }
}
