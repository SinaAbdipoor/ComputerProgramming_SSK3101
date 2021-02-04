package ssk3101_assignment20;

import java.util.Scanner;

/**
 *
 * @author sinaa
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------Check Anagram Application------"
                + "--------------\n");
        System.out.print("Please enter the first word: ");
        String word1 = scanner.next();
        System.out.print("Please enter the second word: ");
        String word2 = scanner.next();
        if (checkAnagram(word1.toLowerCase(), word2.toLowerCase())) {
            System.out.println("\n'" + word1 + "' and '" + word2 + "' are anagrams");
        } else {
            System.out.println("\n'" + word1 + "' and '" + word2 + "' are not anagrams");
        }
        System.out.println("---------------------------------------------------"
                + "---------------");
    }

    static boolean checkAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {                                 //If the lengths of these two words are not the same
            return false;
        }
        if (word1.isEmpty()) {                                                  //If there are no characters left
            return true;
        }
        if (!word2.contains(Character.toString(word1.charAt(0)))) {             //If word2 doesn't have the first character of word1
            return false;
        }
        word2 = new StringBuilder(word2).deleteCharAt(word2.indexOf(word1.charAt(0))).toString();   //Deleting the the first character of word1 from word2
        return checkAnagram(word1.substring(1), word2);
    }
}
