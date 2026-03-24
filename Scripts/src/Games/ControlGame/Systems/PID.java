package Games.ControlGame.Systems;

import java.awt.SystemTray;

public class PID {
    public double kP = 0;
    public double kI = 0;
    public double kD = 0;
    public double P(double error){
        return error * kP;
    }

    //Generally dont use I
    public double I(double error, double totalTimePassed){
        return error * totalTimePassed * kI;
    }
    public double D(double deltaTime){
        return (deltaError / deltaTime) * kD;
    }
    double previousError = 0;
    long previousTime = 0;
    double deltaError = 0;
    public double calculate(double error, double totalTimePassed, double deltaTime){
        deltaError = error - previousError;
        previousError = error;
        previousTime = System.currentTimeMillis();
        System.out.println("P: " + P(error) +" I: " + I(error,totalTimePassed) + " D: " + D(deltaTime));
        return P(error) + I(error,totalTimePassed) + D(deltaTime);
    }
}
