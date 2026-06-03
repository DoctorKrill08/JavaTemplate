package Games.ControlGame.Systems;

public class Timer {
    long timeSnapshot;
    public void go(){
        timeSnapshot = System.currentTimeMillis();
    }
    public long getTimePassed(){
        return  System.currentTimeMillis() - timeSnapshot;
    }
}
