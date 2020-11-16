package ssk3101_assignment5;

/**
 *
 * @author sinaa
 */
public class Publisher {

    //Attributes
    private String name;
    private String city;

    //Constructor
    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    //toString
    public String toString() {
        return name;
    }
}
