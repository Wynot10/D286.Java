public class ProduceItem extends GenericItem{
    private String expirationDate;

    ProduceItem() {
        this.expirationDate = "N/A";
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    // Overriding printAll() method that is inherited from GenericItem Class
    @Override
    public void printAll() {
        // outputting printAll() from GenericItem class using super keyword
        super.printAll();
        System.out.println("Expiration date: " + this.expirationDate);
    }
}
