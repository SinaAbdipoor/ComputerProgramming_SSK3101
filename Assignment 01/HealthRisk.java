package ssk3101_assignment1;

/**
 *
 * @author sinaa
 */
public class HealthRisk {

    //Data fields
    private String name;
    private char gender;
    private double waistSize;

    //No-arg constructor
    public HealthRisk() {
        //Setting default values
        gender = 'F';
        waistSize = 50;
    }

    //Constructor with args
    public HealthRisk(String name, char gender, double waistSize) {
        //Setting values
        this.name = name;
        this.gender = gender;
        this.waistSize = waistSize;
    }

    //Calculating health status based on gender and waist size
    private String getHealthStatus() {
        //If gender = F
        if (gender == 'F') {
            //Checking waist size
            if (waistSize <= 80) {
                return "Low risk";
            }
            if (waistSize <= 85) {
                return "Moderate risk";
            }
            return "High risk";
        } else if (gender == 'M') {
            //Checking waist size
            if (waistSize <= 95) {
                return "Low risk";
            }
            if (waistSize <= 100) {
                return "Moderate risk";
            }
            return "High risk";
        }
        //If gender is not F or M
        return "ERROR: Health risk could not be calculated due to undefined "
                + "gender";
    }

    public String toString() {
        return name + "'s (" + gender + ") waist size is " + waistSize + ", so "
                + "the health status is " + getHealthStatus();
    }
}
