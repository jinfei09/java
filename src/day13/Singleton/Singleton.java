package day13.Singleton;

/**
 * Created by arika on 16/3/22.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    public Singleton() {
    }
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
