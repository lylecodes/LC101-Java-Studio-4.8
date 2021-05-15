package restaurant;

public class Restaurant {
    public static void main(String [] args) {
        MenuItem fish = new MenuItem("Fish", 30.00, "Tasty Fish!", "Meats", true);
        MenuItem steak = new MenuItem("Steak", 35.00, "Juicy Steak", "Meats", true);
        MenuItem spaghetti = new MenuItem("Spaghetti", 25.00, "Oodles of noodles", "Pasta", true);
        MenuItem garlicBread = new MenuItem("Garlic bread", 10.00, "Crusty and garlic(y?)", "Bread", true);

        Menu.addItem(fish);
        Menu.addItem(steak);
        Menu.addItem(spaghetti);
        Menu.addItem(garlicBread);
        garlicBread.printItem();
        Menu.printMenu();
        Menu.removeItem(fish);
        Menu.printMenu();
    }
}
