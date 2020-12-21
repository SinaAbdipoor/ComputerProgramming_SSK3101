package ssk3101_assignment12;

import java.util.Scanner;

/**
 *
 * @author sinaa
 */
class Test {

    public static void main(String[] args) {
        String name;
        double waistSize;
        char gender;
        HealthRisk patient1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the patient's name: ");
        name = sc.nextLine();
        System.out.print("Please enter the patient's gender: ");
        gender = sc.nextLine().charAt(0);
        System.out.print("Please enter the patient's waist size: ");
        try {
            waistSize = Double.parseDouble(sc.nextLine());
            patient1 = new HealthRisk(name, waistSize, gender);
            System.out.println(patient1);
        } catch (NumberFormatException nfe) {
            System.err.println(nfe);
        } catch (IllegalArgumentException iae) {
            System.err.println(iae);
        }
    }
}
