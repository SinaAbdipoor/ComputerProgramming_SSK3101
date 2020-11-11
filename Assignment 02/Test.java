package ssk3101_assignment2;

import java.util.Scanner;

/**
 *
 * @author sinaa
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("\t\t\tCOMPUTER PROGRAMMING 1");
        System.out.println("\t\t\t\t(SSK3100)");
        System.out.println("**********************MARKS EVALUATION APPLICATION"
                + "**********************");
        System.out.println("\nPLEASE ENTER MARKS: \n");
        //Scanner to get the inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("FIRST TEST: ");
        double test1 = sc.nextDouble();
        System.out.print("SECOND TEST: ");
        double test2 = sc.nextDouble();
        System.out.print("\nASSIGNMENT 1 : ");
        double as1 = sc.nextDouble();
        System.out.print("ASSIGNMENT 2 : ");
        double as2 = sc.nextDouble();
        System.out.print("ASSIGNMENT 3 : ");
        double as3 = sc.nextDouble();
        System.out.print("\nFINAL EXAMINATION : ");
        double finalExam = sc.nextDouble();
        System.out.println("");
        //Creating an object
        Student s1 = new Student(test1, test2, as1, as2, as3, finalExam);
        //Printing the marks
        System.out.println(s1.toString());
    }

}
