public class GenericItem {
    private String name;
    private int quantity;
    private double price;

    public GenericItem() {
        this.name = "name has not been set";
        this.quantity = -1;
        this.price = -1.00;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public double getPrice() {
        return this.price;
    }

    public void printAll() {
        System.out.println(this.name + ": Quantity: " + this.quantity + ": $" + this.price);
    }

}
