package day15.Component;

/**
 * Created by arika on 16/3/24.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
