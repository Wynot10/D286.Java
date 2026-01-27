public class MyCars {
    public static void main(String[] args) {
        Cars car1 = new Cars();


        car1.setMake("GMC");
        car1.setModel("Acadia");
        car1.setColor("Red");
        car1.setYear(2025);

       System.out.println(car1.printCars());
    }
}
