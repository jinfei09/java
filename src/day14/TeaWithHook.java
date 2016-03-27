package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by arika on 16/3/23.
 */
public class TeaWithHook extends CoffeineBeverageWithHook{
    @Override
    protected void addCondiments() {
        System.out.println("Dripping tea through filter");
    }

    @Override
    protected void brew() {
        System.out.println("Adding Sugar and Milk");

    }
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        String ansser = null;
        System.out.println("Would you like milk and sugar with your tea (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            ansser = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IO error trying to read you answer");
        }
        if(ansser == null){
            return "no";
        }
        return ansser;
    }
}
