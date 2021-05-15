package restaurant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public static ArrayList<MenuItem> menuItems = new ArrayList<>();
    Date lastUpdated = parseDate("2021-05-12");

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
    public static void addItem(MenuItem item) {
        if (menuItems.contains(item)) {
            System.out.println("Item already in menu!");
            return;
        }
        menuItems.add(item);
    }
    public static void removeItem(MenuItem item) {
        menuItems.remove(item);
    }
    public static void printMenu() {
        System.out.println("Here's the menu:\n");
        for (MenuItem item : menuItems) {
            item.printItem();
            System.out.println("\n");
        }
    }
}
