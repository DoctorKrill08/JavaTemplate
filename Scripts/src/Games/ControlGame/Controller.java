package Games.ControlGame;

import Games.ControlGame.Systems.BangBang;
import Games.ControlGame.Systems.FeedForward;
import Games.ControlGame.Systems.PID;
import Games.ControlGame.Systems.Timer;

public class Controller {
    public PID pid = new PID();
    public FeedForward feedForward = new FeedForward();
    public boolean bangBang = false;
    public double target = 0;
    public double current = 0;
    public double power = 0;
    public double voltage = 12;
    public double error = 0;
    public final double POWER_TO_POSITION_MILIS = 1;
    public final double GRAVITY = .0001;
    public boolean done = false;

    private long startTime = 0;
    public Timer timer = new Timer();
    public void start(){
        startTime = System.currentTimeMillis();
        timer.go();
    }

    public long timePassed(){
        return System.currentTimeMillis() - startTime;
    }


    //Simulates how much the motor would have moved based on power,delta time, and voltage
    public void calculate(){
        double gravity = GRAVITY;
        if (current <= 0){
            gravity = 0;
        }
        if (voltage < 5) {
            voltage = 5;
        }
        error = target - current;
        power = pid.calculate(error,timePassed(),timer.getTimePassed()) + feedForward.calculate(target,voltage);
        if (bangBang) {
            power = power + BangBang.calculate(error);
        }
        if (power > 1) {
            power = 1;
        }
        if (power < -1){
            power = -1;
        }
        double actualPower = power * (voltage / FeedForward.defaultVoltage);

        System.out.println("Power: " + power);
        System.out.println("Error: " + error);
        System.out.println("Position: " + current);
        System.out.println("DeltaT: " + timer.getTimePassed());
        System.out.println("Time: " + timePassed());
        System.out.println("Gravity: " + gravity * current * timer.getTimePassed());

        current = current + (actualPower * timer.getTimePassed() * POWER_TO_POSITION_MILIS) - (gravity * current * timer.getTimePassed());
        timer.go();
    }
}
