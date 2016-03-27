package day14.MenuItem;

import java.util.ArrayList;

/**
 * Created by arika on 16/3/23.
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("K&B's pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String s, String s1, boolean b, double v) {
        MenuItem menuItem = new MenuItem(s, s1, b, v);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator() {
//        return new DinerMenuIterator(menuItems);
        return null;
    }
}
