package day8;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by arika on 16/3/16.
 */
public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successful got a sequencer");
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
            System.out.println("Bummer");
        }
        System.out.println("We got a sequencer");
    }

    public static void main(String [] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
