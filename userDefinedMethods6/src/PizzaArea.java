public class PizzaArea {
    public static double calcPizzaArea(double pizza) {
        double pizzaDiameter;
        double pizzaRadius;
        double pizzaArea;
        double piVal = 3.14159265;


        pizzaRadius = pizza / 2.0;
        pizzaArea = piVal * pizzaRadius * pizzaRadius;
        return pizzaArea;
    }
}
