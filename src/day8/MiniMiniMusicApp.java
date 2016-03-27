//package day8;
//
//import javax.sound.midi.MidiEvent;
//import javax.sound.midi.MidiSystem;
//import javax.sound.midi.MidiUnavailableException;
//import javax.sound.midi.Sequence;
//import javax.sound.midi.Sequencer;
//import javax.sound.midi.ShortMessage;
//import javax.sound.midi.Track;
//
///**
// * Created by arika on 16/3/16.
// */
//public class MiniMiniMusicApp {
//    public void play(){
//        try {
//            Sequencer player = MidiSystem.getSequencer();
//            player.open();
//
//            Sequencer seq = new Sequencer(Sequence.PPQ, 4);
//            Track track = seq.createTrack();
//
//            ShortMessage a = new ShortMessage();
//            a.setMessage(144, 1, 44, 100);
//            MidiEvent noteOn = new MidiEvent(a, 1);
//            track.add(noteOn);
//
//            ShortMessage b = new ShortMessage();
//            b.setMessage(128, 1, 44, 100);
//            MidiEvent noteOff = new MidiEvent(b, 16);
//            track.add(noteOff);
//
//            player.setSequence(seq);
//            player.start();
//        } catch (MidiUnavailableException e) {
//            e.printStackTrace();
//        }
//    }
//}
