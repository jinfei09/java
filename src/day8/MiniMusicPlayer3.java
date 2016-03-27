package day8;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.*;

/**
 * Created by arika on 16/3/16.
 */
public class MiniMusicPlayer3 {
    static JFrame f = new JFrame("My First Music Video");
    static MyDrawPanel m1;
    public static void main(String [] args){
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }

    public void go() {
        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(m1, new int[]{127});

            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();

            int r = 0;
            for(int i = 0; i<60; i+=4){
                r = (int)((Math.random()*50)+1);
                track.add(makeEvent(144,1,r,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,r,100,i+2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    public MidiEvent makeEvent(int i, int i1, int r, int i2, int i3) {
        MidiEvent event = null;
        ShortMessage a = new ShortMessage();
        try {
            a.setMessage(i, i1, r, i2);
            event = new MidiEvent(a,i3);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        return event;
    }

    private void setUpGui() {
        m1 = new MyDrawPanel();
        f.setContentPane(m1);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }

}
