package day13.RemoteControl;

/**
 * Created by arika on 16/3/22.
 */
public class Light {
    private String position;
    public Light(String s) {
        this.position = s;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void off() {
        System.out.println("Light off " + position);
    }

    public void on() {

    }
}
