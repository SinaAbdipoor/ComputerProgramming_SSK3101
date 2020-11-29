package ssk3101_assignment8;

/**
 *
 * @author sinaa
 */
abstract class ThreeDimensional extends Shape {

    abstract double calArea();

    abstract double calVolume();

    @Override
    public String toString() {
        return "Three dimensional shape";
    }
}
