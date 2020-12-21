package ssk3101_assignment12;

/**
 *
 * @author sinaa
 */
class HealthRisk {

    private String name;
    private double waistSize = 50;
    private char gender = 'F';

    HealthRisk() {
    }

    //Does it have to be this complicated?
    //Is this the solution to the issue of the previous assignment?
    HealthRisk(String name, double waistSize, char gender) throws
            IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name is blank");
        }
        this.name = name;
        if (waistSize < 0) {
            throw new IllegalArgumentException("You might be fit, but not this "
                    + "much");
        }
        this.waistSize = waistSize;
        if (!(gender == 'F' || gender == 'M')) {
            throw new IllegalArgumentException("Uhh... No offence, but you can "
                    + "only choose either 'F' or 'M'");
        }
        this.gender = gender;
    }

    String getName() {
        return name;
    }

    double getWaistSize() {
        return waistSize;
    }

    char getGender() {
        return gender;
    }

    void setName(String name) throws IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name is blank");
        }
        this.name = name;
    }

    void setWaistSize(double waistSize) throws IllegalArgumentException {
        if (waistSize < 0) {
            throw new IllegalArgumentException("You might be fit, but not this "
                    + "much");
        }
        this.waistSize = waistSize;
    }

    void setGender(char gender) throws IllegalArgumentException {
        if (!(gender == 'F' || gender == 'M')) {
            throw new IllegalArgumentException("Uhh... No offence, but you can "
                    + "only choose either 'F' or 'M'");
        }
        this.gender = gender;
    }

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
                + "the health status is: " + calcHealthRisk();
    }
}
