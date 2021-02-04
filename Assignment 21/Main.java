package ssk3101_assignment21;

import java.util.Scanner;

/**
 *
 * @author sinaa
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("Please enter the word you wish to reverse: ");
        String word = new Scanner(System.in).next();
        System.out.print("The reverse word of '" + word + "' is: '");
        reverseDisplay(word);
        System.out.println("'");
    }

    static void reverseDisplay(String value) {
        if (value.length() == 1) {                                              //If there's only 1 letter remaining, print it
            System.out.print(value);
        } else {
            System.out.print(value.charAt(value.length() - 1));                 //Printing the last character
            reverseDisplay(value.substring(0, value.length() - 1));             //Recursive minus the last character
        }
    }
}
