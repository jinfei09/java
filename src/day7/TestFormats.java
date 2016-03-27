package day7;

/**
 * Created by arika on 16/3/15.
 */
public class TestFormats {
    public static void main(String [] args){
        String s = String.format("%, d", 100000000);
        System.out.println(s);
        System.out.println(String.format("I hava %.2f bugs to fix", 123.45677));
    }
}
