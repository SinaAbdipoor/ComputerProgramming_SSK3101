package ssk3101_assignment10;

import java.util.Scanner;

/**
 *
 * @author sinaa
 */
public class Months {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November",
            "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your month (a number between 1 and 12): ");
        //Making sure the input is an int
        while (!sc.hasNextInt()) {
            System.err.println("Make sure you enter a number");
            System.out.print("Enter your month (a number between 1 and 12): ");
            sc.next();
        }
        int monthNo = sc.nextInt();
        //Making sure the input int is between 1 and 12
        try {
            if (monthNo < 1 || monthNo > 12) {
                throw new ArrayIndexOutOfBoundsException("Wrong number");
            }
            System.out.println("Month: " + months[monthNo - 1] + ", number of "
                    + "days: " + dom[monthNo - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
