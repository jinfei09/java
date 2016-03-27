package day13.RemoteControl;

/**
 * Created by arika on 16/3/22.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high(){
        speed = HIGH;
    }

    public void medium(){
        speed = MEDIUM;
    }
    public void low(){
        speed = LOW;
    }

    public void off(){
        speed = OFF;
    }
    public int getSpeed(){
        return speed;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
