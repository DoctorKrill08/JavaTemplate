package Games.ControlGame;

import java.util.Scanner;

public class Handler {
    public static final double iterationTime = 100;
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        System.out.println("P:");
        controller.pid.kP = scanner.nextDouble();
        System.out.println("I:");
        controller.pid.kI = scanner.nextDouble();
        System.out.println("D:");
        controller.pid.kD = scanner.nextDouble();
        System.out.println("F:");
        controller.feedForward.kF = scanner.nextDouble();
        System.out.println("Bang bang (true or false):");
        controller.bangBang = scanner.nextBoolean();
        System.out.println("Set Target:");
        controller.target = scanner.nextDouble();
        System.out.println("Set Voltage (default is 12):");
        controller.voltage = scanner.nextDouble();
        System.out.println("Voltage normalization (true or false)");
        controller.feedForward.voltageNormalization = scanner.nextBoolean();
        controller.start();
        for (int i = 0; i < 50;){
            if (controller.timer.getTimePassed() >= iterationTime){
                controller.calculate();
                i++;
            }
        }
    }
}
