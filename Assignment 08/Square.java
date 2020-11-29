package ssk3101_assignment8;

/**
 *
 * @author sinaa
 */
public class Square extends TwoDimensional {

    //Attributes
    private final double side;

    //Constructor
    public Square(double side) {
        this.side = side;
    }

    //Overriding the abstract calArea() method in the TwoDimensional class
    @Override
    double calArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString() + "\nShape: Square\nSide: " + side
                + "(cm)\nArea: " + calArea() + "(cm^2)";
    }
}
