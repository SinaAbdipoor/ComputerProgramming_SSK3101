package ssk3101_assignment7;

/**
 *
 * @author sinaa
 */
public class Sedan extends Car {

    //Attributes
    private final int year;
    private int manufacturerDiscount;

    //Constructor
    Sedan(int speed, double regularPrice, String color, int year,
            int manufacturerDiscount) {
        //Parent constructor
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    //Implementing the abstract method of the parent class
    @Override
    double salePrice() {
        return super.getRegularPrice() * (100 - manufacturerDiscount) / 100;
    }

    //Setters
    void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    //Getters
    double getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    //toString
    public String toString() {
        return super.toString() + "\nCar Type: Sedan\nYear: " + year
                + "\nManufacturer Discount: " + manufacturerDiscount + "%";
    }
}
