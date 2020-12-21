package ssk3101_assignment9;

import java.util.Scanner;

/**
 *
 * @author sinaa
 */
public class CalculatorWithEH {

    //Calculator with NumberFormatException handling
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator with exception handling");
        System.out.println("Input example: '2 + 2'");
        System.out.print("Input your arithmetic expression: ");
        try {
            double num1 = Double.parseDouble(sc.next());
            String operator = sc.next();
            double num2 = Double.parseDouble(sc.next());
            switch (operator) {
                case "+":
                    System.out.println(num1 + " " + operator + " " + num2 + " = "
                            + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + " " + operator + " " + num2 + " = "
                            + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 + " " + operator + " " + num2 + " = "
                            + (num1 * num2));
                    break;
                case "/":
                    System.out.println(num1 + " " + operator + " " + num2 + " = "
                            + (num1 / num2));
                    break;
                default:
                    System.err.println("Supported operators are: + - * /");
            }
        } catch (NumberFormatException nfe) {
            System.err.println("Wrong input: " + nfe);
        }
    }
}
