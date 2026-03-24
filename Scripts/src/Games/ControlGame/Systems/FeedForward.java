package Games.ControlGame.Systems;

public class FeedForward {
    public static final double defaultVoltage = 12;
    public double kF = 0;
    public boolean voltageNormalization = false;
    public double calculate(double target, double voltage){
        if (voltageNormalization) {
            System.out.println("FF: " + (target * kF * (defaultVoltage / voltage)));
            return (target * kF) * (defaultVoltage / voltage);
        }
        System.out.println("FF: " + (target * kF));
        return (target * kF);
    }
}
