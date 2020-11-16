package ssk3101_assignment4;

/**
 *
 * @author sinaa
 */
public class Test {

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", 2019, 23456);
        Book book2 = new Book("Computer Programming", 2020, 48562);
        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        book1.setEqual(book2);
        System.out.println("Book 1: title: " + book1.getTitle() + ", year: "
        + book1.getYear() + ", ISBN number: " + book1.getISBN());
        System.out.println("Book 2: title: " + book2.getTitle() + ", year: "
        + book2.getYear() + ", ISBN number: " + book2.getISBN());
    }
    
}
