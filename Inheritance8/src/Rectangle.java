
// Inheriting from abstract class Shape
public class Rectangle extends Shape {
    private double length, height;

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    // Must override abstract method
    @Override
    public double computeArea() {
        return (this.length * this.height);
    }


}
