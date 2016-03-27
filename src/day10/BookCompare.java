package day10;

import java.util.Comparator;

/**
 * Created by arika on 16/3/18.
 */
public class BookCompare implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return (o1.title.compareTo(o2.title));
    }
}
