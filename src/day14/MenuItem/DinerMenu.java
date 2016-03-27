package day14.MenuItem;

import java.util.ArrayList;

/**
 * Created by arika on 16/3/23.
 */
public class DinerMenu {
    static final int MAX_TIMES = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_TIMES];

        addItem("Vegetarian BLT", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("BLT", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Soup of the day", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Hotdog", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String s, String s1, boolean b, double v) {
        MenuItem menuItem = new MenuItem(s, s1, b, v);
        if(numberOfItems >= MAX_TIMES){
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
