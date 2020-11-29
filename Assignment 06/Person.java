package ssk3101_assignment6;

/**
 *
 * @author sinaa
 */
public abstract class Person {

    //Attributes
    private String name;
    private int age;
    private int phoneNumber;

    //Constructor
    public Person(String name) {
        this.name = name;
    }

    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    //toString
    public String toString() {
        return "Name: " + name;
    }
}
