package ssk3101_assignment8;

/**
 *
 * @author sinaa
 */
public class Cube extends ThreeDimensional {

    //Attributes
    private final double edge;

    //Constructor
    public Cube(double edge) {
        this.edge = edge;
    }

    //Overriding the abstract calArea() method in the ThreeDimensional class
    @Override
    double calArea() {
        return 6 * edge * edge;
    }

    //Overriding the abstract calVolume() method in the ThreeDimensional class
    @Override
    double calVolume() {
        return edge * edge * edge;
    }

    @Override
    public String toString() {
        return super.toString() + "\nShape: Cube\nEdge: " + edge + "(cm)\n"
                + "Area: " + calArea() + "(cm^2)\nVolume: " + calVolume()
                + "(cm^3)";
    }
}
