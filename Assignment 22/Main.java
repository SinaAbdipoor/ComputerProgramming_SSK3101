package ssk3101_assignment22;

import java.util.Scanner;

/**
 *
 * @author sinaa
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating combination C(n, p)...");
        System.out.print("Please enter the value of 'n': ");
        long n = sc.nextLong();
        System.out.print("Please enter the value of 'p': ");
        long p = sc.nextLong();
        System.out.println("Please wait...");
        System.out.println("C(" + n + ", " + p + ") = " + C(n, p));
    }

    static long C(long n, long p) throws IllegalArgumentException {
        if (n < p) {
            throw new IllegalArgumentException("'n' cannot be smaller than 'p'");
        }
        if (p == 0 || n == p) {
            return 1;
        }
        return C(n - 1, p) + C(n - 1, p - 1);
    }
}
