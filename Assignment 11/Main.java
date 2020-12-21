package ssk3101_assignment11;

import java.util.Scanner;

/**
 *
 * @author sinaa
 */
class Main {

    public static void main(String[] args) {
        Employee em1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the employee's name: ");
        String name = sc.nextLine();
        System.out.print("Please enter the employee's ID: ");
        int id = sc.nextInt();
        System.out.print("Please enter the employee's pay rate: ");
        double payRate = sc.nextDouble();
        System.out.print("Please enter the employee's hours worked: ");
        double hoursWorked = sc.nextDouble();
        try {
            em1 = new Employee(name, id);
            em1.setPayRate(payRate);
            em1.setHoursWorked(hoursWorked);
            System.out.println(em1);
            System.out.println("Payroll: RM" + em1.calcGrossPay());
        } catch (IllegalArgumentException iar) {
            System.err.println(iar);
        }
    }
}
