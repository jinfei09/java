package day6;

/**
 * Created by arika on 16/3/14.
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){
        System.out.println("Making an Animal");
    }
    public Animal(String theName){
        name = theName;
    }
}
