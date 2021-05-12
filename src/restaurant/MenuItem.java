package restaurant;

public class MenuItem {

    // Fields
    private String name;
    private float price;
    private String description;
    private String category;
    private boolean isNew;

    // Constructor
    public MenuItem(String name, float price, String description,
                    String category, boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    // Setters
    private void setName(String aName) {
        this.name = aName;
    }
    private void setPrice(float aPrice) {
        this.price = aPrice;
    }
    private void setDescription(String aDescription) {
        this.description = aDescription;
    }
    private void setCategory(String aCategory) {
        this.category = aCategory;
    }
    private void isNew(boolean aIsNew) {
        this.isNew = aIsNew;
    }

    // Getters
    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public String getCategory() {
        return this.category;
    }
    public boolean getIsNew() {
        return this.isNew;
    }
}
