package day9;

import java.util.Comparator;

/**
 * Created by arika on 16/3/17.
 */
public class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    public String toString(){
        return title;
    }

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }

    @Override
    public boolean equals(Object obj) {
        Song s = (Song)obj;
        return getTitle().equals(s.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
