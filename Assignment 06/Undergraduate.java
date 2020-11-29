package ssk3101_assignment6;

/**
 *
 * @author sinaa
 */
public class Undergraduate extends Student {

    //Attributes
    private String classificationStatus;

    //Constructor
    public Undergraduate(String name, int matricNumber, int creditHours,
            String classificationStatus) {
        //Parent class constructor
        super(name, Integer.toString(matricNumber), "Bachelor", creditHours);
        this.classificationStatus = classificationStatus;
    }

    //toString
    public String toString() {
        return super.toString() + "\nClassification: " + classificationStatus;
    }
}
