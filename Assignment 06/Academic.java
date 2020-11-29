package ssk3101_assignment6;

/**
 *
 * @author sinaa
 */
public class Academic extends Staff {

    //Attributes
    private String departmentName;

    //Constructor
    public Academic(String name, int age, String staffID) {
        //Parent class constructor
        super(name, age, staffID);
    }

    //Setters
    public void setDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    //Getters
    public String getDepartment() {
        return departmentName;
    }

    //toString
    public String toString() {
        return super.toString();
    }
}
