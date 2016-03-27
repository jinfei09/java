package day8;

        import java.io.FileWriter;
        import java.io.IOException;

/**
 * Created by arika on 16/3/16.
 */
public class WriteAFile {
    public static void main(String [] args){
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("hello foo!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
