package ssk3101_assignment5;

/**
 *
 * @author sinaa
 */
public class Borrower {

    //Attributes
    private String name;
    private Book book;

    //No-arg constructor
    public Borrower() {

    }

    //Constructor
    public Borrower(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    //Getters
    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    //toString
    public String toString() {
        return book + ", is borrowed by " + name;
    }
}
