package ssk3101_assignment9;

import java.util.Scanner;

/**
 *
 * @author sinaa
 */
public class Calculator {

    //Calculator without handling NumberFormatException
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator without exception handling");
        System.out.println("Input example: '2 + 2'");
        System.out.print("Input your arithmetic expression: ");
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
    }
}
