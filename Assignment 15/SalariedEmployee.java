package ssk3101_assignment15;

/**
 *
 * @author sinaa
 */
public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, int staffNumber,
            double weeklySalary) throws IllegalArgumentException {
        super(firstName, lastName, staffNumber);
        if (weeklySalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary)
            throws IllegalArgumentException {
        if (weeklySalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Salaried [Weekly salary: "
                + weeklySalary + "]";
    }

    @Override
    public double earnings() {
        return 4 * weeklySalary;
    }
}
