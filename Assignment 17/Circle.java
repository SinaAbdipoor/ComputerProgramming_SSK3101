package ssk3101_assignment17;

/**
 *
 * @author sinaa
 */
public class Circle implements GeometricObject {

    protected double radius = 1;

    public Circle(double radius) {
        this.radius = radius;
        //Then why did we need to set a default value for radius???
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
