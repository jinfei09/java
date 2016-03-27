package day7;

/**
 * Created by arika on 16/3/15.
 */
public class GC {
    public static GC doStuff(){
        GC newgC = new GC();
        doStuff2(newgC);
        return newgC;
    }

    private static void doStuff2(GC newgC) {
        GC localGC;

    }

    public static void main(String [] args){
        GC gc1;
        GC gc2 = new GC();
        GC gc3 = new GC();
        GC gc4 = gc3;
        gc1 = doStuff();
    }
}
