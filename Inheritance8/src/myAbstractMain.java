public class myAbstractMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(10.0);
        rectangle1.setLength(30.0);
        Circle circle1 = new Circle();
        circle1.setRadius(10.0);

        System.out.println("Area of rectangle is: " + rectangle1.computeArea());
        System.out.print("Area of circle is: ");
        System.out.printf("%.2f\n", circle1.computeArea());
    }
}
