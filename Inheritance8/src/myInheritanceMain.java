import java.util.ArrayList;
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
        // Using GenericItem Object for ArrayList
        ArrayList<GenericItem> inventoryList = new ArrayList<GenericItem>();
        int i;

        genItem1.printAll();

        produceItem1.printAll();

        inventoryList.add(genItem1);
        // Adding ProduceItem to GenericItem ArrayList. This is possible since the ProduceItem Class is derived
        // from the GenericItem Class. Uses runtime polymorphism to call the correct printAll() method in the
        // for loop later in code.
        inventoryList.add(produceItem1);


        /*
        For a given element, how does the program know whether to call GenericItem's printItem() or ProduceItem's
        printItem()? The Java virtual machine automatically performs runtime polymorphism, i.e., it dynamically
        determines the correct method to call based on the actual object type to which the variable (or element) refers.
         */
        System.out.println("Inventory List: ");
        for (i = 0; i < inventoryList.size(); i++) {
            inventoryList.get(i).printAll();
        }


    }
}
