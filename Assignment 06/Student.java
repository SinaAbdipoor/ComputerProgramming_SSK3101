package ssk3101_assignment6;

/**
 *
 * @author sinaa
 */
public abstract class Student extends Person {

    //Attributes
    private String matricNumber;
    private String degreeType;
    private int creditHours;
    private final int DEGREE_FEE_RATE = 100;
    private final int MASTER_FEE_RATE = 200;
    private final int PHD_FEE_RATE = 300;

    //Constructor
    public Student(String name, String matricNumber, String degreeType,
            int creditHours) {
        //Parent class constructor
        super(name);
        this.matricNumber = matricNumber;
        this.degreeType = degreeType;
        this.creditHours = creditHours;
    }

    //Calculating fees
    public int calFees() {
        if (degreeType == "Bachelor") {
            return DEGREE_FEE_RATE * creditHours;
        }
        if (degreeType == "Master") {
            return MASTER_FEE_RATE * creditHours;
        }
        if (degreeType == "Ph.D.") {
            return PHD_FEE_RATE * creditHours;
        }
        //Undefined degree type
        System.out.println("ERROR: Degree type can only be 'Degree', 'Master',"
                + " or 'Ph.D.'");
        return -1;
    }

    //toString
    public String toString() {
        return super.toString() + "\nMatric Number: " + matricNumber + "\n"
                + "Degree Type: " + degreeType + "\nCredit Hours: "
                + creditHours + "\nTotal Fees: RM" + calFees();
    }
}
