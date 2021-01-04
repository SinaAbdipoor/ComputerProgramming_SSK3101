package ssk3101_assignment13;

/**
 *
 * @author sinaa
 */
class HealthRisk {

    //Data fields
    private String name;
    private char gender;
    private double waistSize;

    //No-arg constructor setting the default values
    HealthRisk() {
        gender = 'F';
        waistSize = 50;
    }

    //Constructor
    HealthRisk(String name, char gender, double waistSize) throws
            IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name is blank");
        }
        this.name = name;
        if (!(gender == 'F' || gender == 'M')) {
            throw new IllegalArgumentException("Gender can only be 'F' or 'M'");
        }
        this.gender = gender;
        if (waistSize < 1) {
            throw new IllegalArgumentException("Waist size must be greater than"
                    + " 0");
        }
        this.waistSize = waistSize;
    }

    //Getters
    String getName() {
        return name;
    }

    char getGender() {
        return gender;
    }

    double getWaistSize() {
        return waistSize;
    }

    //Setters
    void setName(String name) throws IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name is blank");
        }
        this.name = name;
    }

    void setGender(char gender) throws IllegalArgumentException {
        if (!(gender == 'F' || gender == 'M')) {
            throw new IllegalArgumentException("Gender can only be 'F' or 'M'");
        }
        this.gender = gender;
    }

    void setWaistSize(double waistSize) throws IllegalArgumentException {
        if (waistSize < 1) {
            throw new IllegalArgumentException("Waist size must be greater than"
                    + " 0");
        }
        this.waistSize = waistSize;
    }

    //Calculating the health risk based on gender and waist size
    String calcHealthRisk() {
        if (gender == 'F') {
            if (waistSize <= 80) {
                return "Low risk";
            }
            if (waistSize <= 85) {
                return "Moderate risk";
            }
            return "High risk";
        }
        //If gender = M
        if (waistSize <= 95) {
            return "Low risk";
        }
        if (waistSize <= 100) {
            return "Moderate risk";
        }
        return "High risk";
    }

    @Override
    public String toString() {
        return name + "'s (" + gender + ") waist size is " + waistSize + ", so "
                + "the health status is " + calcHealthRisk();
    }
}
