package day13.RemoteControl;

/**
 * Created by arika on 16/3/22.
 */
public class Stereo {
    private int volume;
    private int cd;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public void setCD(){
        System.out.println("Stereo set CD");
    }
    public void on() {
        System.out.println("Stereo on");
    }
}
