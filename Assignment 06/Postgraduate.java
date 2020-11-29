package ssk3101_assignment6;

/**
 *
 * @author sinaa
 */
public class Postgraduate extends Student {

    //Attributes
    private String researchTitle;

    //Constructor
    public Postgraduate(String name, String matricNumber, String degreeType,
            int creditHours, String researchTitle) {
        //Parent class constructor
        super(name, matricNumber, degreeType, creditHours);
        this.researchTitle = researchTitle;
    }

    //toString
    public String toString() {
        return super.toString() + "\nResearch Title: " + researchTitle;
    }
}
