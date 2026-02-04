
// Inheriting from abstract class Shape
public class Circle extends Shape {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Must override abstract method
    @Override
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
