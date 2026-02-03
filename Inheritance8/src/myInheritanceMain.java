public class myInheritanceMain {
    public static void main(String[] args) {
        GenericItem genItem1 = new GenericItem();
        ProduceItem produceItem1 = new ProduceItem();
        genItem1.setName("Teddy Bear");
        genItem1.setQuantity(100);
        genItem1.setPrice(10.99);
        produceItem1.setName("Milk");
        produceItem1.setQuantity(10);
        produceItem1.setPrice(6.99);
        produceItem1.setExpirationDate("2/25/2026");

        genItem1.printAll();

        produceItem1.printAll();


    }
}
