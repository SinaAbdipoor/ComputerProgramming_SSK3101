package ssk3101_assignment8;

/**
 *
 * @author sinaa
 */
public class Triangle extends TwoDimensional {

    //Attributes
    private final double height;
    private final double base;

    //Constructor
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    //Overriding the abstract calArea() method in the TwoDimensional class
    @Override
    double calArea() {
        return (height * base) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nShape: Triangle\nHeight: " + height
                + "(cm)\nBase: " + base + "(cm)\nArea: " + calArea() + "(cm^2)";
    }
}
