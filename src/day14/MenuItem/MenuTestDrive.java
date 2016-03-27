package day14.MenuItem;

/**
 * Created by arika on 16/3/23.
 */
public class MenuTestDrive {
    public static void main(String[] args){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
