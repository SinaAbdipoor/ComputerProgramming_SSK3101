package ssk3101_assignment1;

/**
 *
 * @author sinaa
 */
public class Test {

    public static void main(String[] args) {
        //Creating objects with and without args
        //Testing default
        HealthRisk hr = new HealthRisk();
        //Testing with args
        HealthRisk hr1 = new HealthRisk("Ramli", 'M', 80);
        HealthRisk hr2 = new HealthRisk("Laili", 'F', 143);
        HealthRisk hr3 = new HealthRisk("Sarah", 'F', 70);
        //Printing info
        System.out.println(hr.toString());
        System.out.println(hr1.toString());
        System.out.println(hr2.toString());
        System.out.println(hr3.toString());
    }

}
