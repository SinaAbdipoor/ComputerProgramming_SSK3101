package ssk3101_assignment15;

/**
 *
 * @author sinaa
 */
public class HourlyEmployee extends Employee {

    private double wage;                                                        //Pay rate
    private double hours;                                                       //Hours worked

    public HourlyEmployee(String firstName, String lastName, int staffNumber,
            double wage, double hours) throws IllegalArgumentException {
        //Calling the constructor of the "Employee" class as this class extends it
        super(firstName, lastName, staffNumber);
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative");
        }
        this.wage = wage;
        if (hours < 0 || hours > 150) {
            throw new IllegalArgumentException("Hours worked can only be "
                    + "between 0 and 150");
        }
        this.hours = hours;
    }

    public void setWage(double wage) throws IllegalArgumentException {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage cannot be negative");
        }
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hours) throws IllegalArgumentException {
        if (hours < 0 || hours > 150) {
            throw new IllegalArgumentException("Hours worked can only be "
                    + "between 0 and 150");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Hourly [Wage: " + wage
                + ", Hours worked: " + hours + "]";
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        }
        return (40 * wage) + (1.5 * (hours - 40));
    }
}
