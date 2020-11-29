package ssk3101_assignment7;

/**
 *
 * @author sinaa
 */
public class Caravan extends Car {

    //Attributes
    private final int weight;

    //Constructor
    public Caravan(int speed, double regularPrice, String color, int weight) {
        //Parent constructor
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    //Calculating discount
    private double getDiscount() {
        if (weight > 2500) {
            return 7.5;
        }
        return 10;
    }

    @Override
    double salePrice() {
        return super.getRegularPrice() * (100 - getDiscount()) / 100;
    }

    //toString
    public String toString() {
        return super.toString() + "\nCar Type: Caravan\nWeight: " + weight
                + "\nDiscount: " + getDiscount() + "%";
    }
}
