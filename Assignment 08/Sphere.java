package ssk3101_assignment8;

/**
 *
 * @author sinaa
 */
public class Sphere extends ThreeDimensional {

    //Attributes
    private final double radius;
    private static final double PI = 3.14;

    //Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    //Overriding the abstract calArea() method in the ThreeDimensional class
    @Override
    double calArea() {
        return 4 * PI * radius * radius;
    }

    //Overriding the abstract calVolume() method in the ThreeDimensional class
    @Override
    double calVolume() {
        return (4 / 3) * PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nShape: Sphere\nRadius: " + radius
                + "(cm)\nArea: " + calArea() + "(cm^2)\nVolume: " + calVolume()
                + "(cm^3)";
    }
}
