package ssk3101_assignment7;

/**
 *
 * @author sinaa
 */
public class MPV extends Car {

    //Attributes
    private final int length;

    //Constructor
    public MPV(int speed, double regularPrice, String color, int length) {
        //Parent constructor
        super(speed, regularPrice, color);
        this.length = length;
    }

    //Calculating discount
    private double getDiscount() {
        if (length > 15) {
            return 2.5;
        }
        return 5;
    }

    @Override
    double salePrice() {
        return super.getRegularPrice() * (100 - getDiscount()) / 100;
    }

    //toString
    public String toString() {
        return super.toString() + "\nCar Type: MPV\nLength: " + length
                + "\nDiscount: " + getDiscount();
    }
}
