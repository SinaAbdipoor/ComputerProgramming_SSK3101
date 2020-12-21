package ssk3101_assignment11;

/**
 *
 * @author sinaa
 */
class Employee {

    private String name;
    private int id;
    private double payRate, hoursWorked;

    Employee(String name, int id) {
        //Anything wrong with this approach?
        //Hint: broken state objects, what happens if this class is extended?
        setName(name);
        setId(id);
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    double getPayRate() {
        return payRate;
    }

    double getHoursWorked() {
        return hoursWorked;
    }

    void setName(String name) throws IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name is blank");
        }
        this.name = name;
    }

    void setId(int id) throws IllegalArgumentException {
        if (id < 1) {
            throw new IllegalArgumentException("ID cannot be 0 or negative");
        }
        this.id = id;
    }

    void setPayRate(double payRate) throws IllegalArgumentException {
        if (payRate < 0 || payRate > 25) {
            throw new IllegalArgumentException("Pay rate can only be between 0 "
                    + "and 25");
        }
        this.payRate = payRate;
    }

    void setHoursWorked(double hoursWorked) throws IllegalArgumentException {
        if (hoursWorked < 0 || hoursWorked > 84) {
            throw new IllegalArgumentException("Hours worked can only be "
                    + "between 0 and 84");
        }
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee\nName: " + name + "\nID: " + id + "\nPay rate: "
                + payRate + "\nHours worked: " + hoursWorked;
    }

    double calcGrossPay() {
        return hoursWorked * payRate;
    }
}
