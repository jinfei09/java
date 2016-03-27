package day9;

/**
 * Created by arika on 16/3/17.
 */
public class TestSplit {
    public static void main(String[] args){
        String toTest = "What is blue + yellow?/green";
        String[] result = toTest.split("/");
        for(String token:result){
            System.out.println(token);
        }
    }
}
