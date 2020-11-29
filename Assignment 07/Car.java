package ssk3101_assignment7;

/**
 *
 * @author sinaa
 */
abstract class Car {

    //Attributes
    private final int speed;
    private double regularPrice;
    private final String color;

    //Constructor
    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    //Abstract method to be implemented in children classes
    abstract double salePrice();

    //Setters
    void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    //Getters
    double getRegularPrice() {
        return regularPrice;
    }

    //toString
    public String toString() {
        return "Car's info:\nSpeed: " + speed + "\nRegular Price: RM"
                + regularPrice + "\nColor: " + color + "\nSale Price: RM"
                + Math.round(salePrice() * 100) / 100;
    }
}
