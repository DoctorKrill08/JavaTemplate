package Games.ControlGame.Systems;

public class BangBang {
    public static double calculate(double error){
        if (error > 0){
            return 1;
        }
        return 0;
    }
}
