public class MyCars {
    public static void main(String[] args) {
        Cars car1 = new Cars(); // Calling the constructor
        Cars car2 = new Cars(2020 ); // Calling defined 1 argument constructor

        System.out.println("Default Cars Values Printed ");
        System.out.println(car1.printCars());

        car1.setMake("GMC");
        car1.setModel("Acadia");
        car1.setColor("Red");
        car1.setYear(2025);

       System.out.println(car1.printCars());

       System.out.println(car2.printCars());
    }
}
