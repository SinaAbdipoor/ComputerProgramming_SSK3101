package ssk3101_assignment15;

/**
 *
 * @author sinaa
 */
public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final int staffNumber;

    public Employee(String firstName, String lastName, int staffNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.staffNumber = staffNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    @Override
    public String toString() {
        return "Employee [First name: " + firstName + ", Last name: "
                + lastName + ", Staff number: " + staffNumber + "]";
    }

    public abstract double earnings();
}
