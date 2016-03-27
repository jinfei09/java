package day13.OutWard;

/**
 * Created by arika on 16/3/22.
 */
public class Amplifier {
    private DvdPlayer dvd;
    private int volume;

    public void on() {

    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public DvdPlayer getDvd() {
        return dvd;
    }

    public void setSurroundSound() {

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void off() {

    }
}
