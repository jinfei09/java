package day5;

/**
 * Created by arika on 16/3/11.
 */
public class Dog {
    int size;
    String name;
    void bark(){
        if(size > 60){
            System.out.println("Woof! Woof!");
        } else if(size > 14){
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
