package Games.SchoolGame;

import java.util.Scanner;

public class Handler {
    public static void main(String[] args) {
        School nw = new School("Northwest",20,5);
        School sw = new School("Southwest",15,3);
        nw.status();
        sw.status();
    }
}
