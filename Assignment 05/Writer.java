package ssk3101_assignment5;

/**
 *
 * @author sinaa
 */
public class Writer {

    //Attributes
    private String firstName;
    private String lastName;

    //No-arg constructor
    public Writer() {

    }

    //Constructor
    public Writer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //toString
    public String toString() {
        return firstName + " " + lastName;
    }
}
