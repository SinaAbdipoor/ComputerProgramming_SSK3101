package ssk3101_assignment1;

/**
 *
 * @author sinaa
 */
public class Test {

    public static void main(String[] args) {
        //Creating objects with and without args
        //Testing default
        HealthRisk patient = new HealthRisk();
        //Testing with args
        HealthRisk patient1 = new HealthRisk("Ramli", 'M', 80);
        HealthRisk patient2 = new HealthRisk("Laili", 'F', 143);
        HealthRisk patient3 = new HealthRisk("Sarah", 'F', 70);
        //Printing info
        System.out.println(patient.toString());
        System.out.println(patient1.toString());
        System.out.println(patient2.toString());
        System.out.println(patient3.toString());
    }

}
