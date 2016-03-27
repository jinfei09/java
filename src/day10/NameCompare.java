package day10;

import java.util.Comparator;

/**
 * Created by arika on 16/3/18.
 */
public class NameCompare implements Comparator<Mountain> {
    @Override
    public int compare(Mountain o1, Mountain o2) {
        return o1.name.compareTo(o2.name);
    }
}
