package ssk3101_assignment6;

/**
 *
 * @author sinaa
 */
public abstract class Staff extends Person {

    //Attributes
    private String staffID;
    private int salary;
    private boolean promotionStatus = false;

    //Constructor
    public Staff(String name, int age, String staffID) {
        //Parent class constructor
        super(name);
        super.setAge(age);
        this.staffID = staffID;
    }

    //Checking if eligible for promotion
    public boolean getPromotionEligibility() {
        if (super.getAge() >= 45) {
            return true;
        }
        return false;
    }

    //Setters
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Getters
    public int getSalary() {
        return salary;
    }

    //toString
    public String toString() {
        String promotionMessage;
        if (getPromotionEligibility()) {
            promotionMessage = "You can get a promotion you old fart. You will"
                    + " need it for your pills!";
        } else {
            promotionMessage = "Weeee. Your promotion request has been ........"
                    + "........... REJECTED :p";
        }
        return super.toString() + "\nStaff ID: " + staffID + "\nAge: "
                + super.getAge() + "\nPromotion: " + promotionMessage;
    }
}
