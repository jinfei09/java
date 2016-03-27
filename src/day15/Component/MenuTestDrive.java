package day15.Component;

/**
 * Created by arika on 16/3/24.
 */
public class MenuTestDrive {
    public static void main(String args[]){
        MenuComponent pancakeHouseMenu = new Menu("Menu1", "breakfast");
        MenuComponent dinerMenu = new Menu("dinerMenu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert of course!");
        MenuComponent allMenus = new Menu("ALl Menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti", true, 3.89));
        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with flakey ", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
