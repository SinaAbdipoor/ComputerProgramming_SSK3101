package ssk3101_assignment8;

/**
 *
 * @author sinaa
 */
public class Circle extends TwoDimensional {

    //Attributes
    private final double radius;
    private static final double PI = 3.14;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Overriding the abstract calArea() method in the TwoDimensional class
    @Override
    double calArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nShape: Circle\nRadius: " + radius
                + "(cm)\nArea: " + calArea() + "(cm^2)";
    }
}
