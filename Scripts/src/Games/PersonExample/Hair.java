package Games.PersonExample;

public class Hair {
    double length = 10;
    public void grow(int amount){
        length = length + amount;
    }
    public void haircut(){
        double rnd = Math.random();
        int amountOfHairCut = (int) (rnd * 10);
        length = length - amountOfHairCut;
        if (length < 0){
            length = 0;
        }
    }
}
