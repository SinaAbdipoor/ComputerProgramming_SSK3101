package ssk3101_assignment6;

/**
 *
 * @author sinaa
 */
public class Supporter extends Staff {

    //Attributes
    private int overtimeHours;

    //Constructor
    public Supporter(String name, int age, String staffID) {
        //Parent class constructor
        super(name, age, staffID);
    }

    //Setters
    public void setOvertimeHour(int overtimeHour) {
        this.overtimeHours = overtimeHour;
    }

    //Getters
    public int getOvertimeHour() {
        return overtimeHours;
    }

    //toString
    public String toString() {
        return super.toString();
    }
}
