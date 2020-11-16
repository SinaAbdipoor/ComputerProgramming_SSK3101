package ssk3101_assignment4;

/**
 *
 * @author sinaa
 */
public class Book {

    //Attributes
    private String bookTitle;
    private int year;
    private int noISBN;

    //Constructor
    public Book(String bookTitle, int year, int noISBN) {
        this.bookTitle = bookTitle;
        this.year = year;
        this.noISBN = noISBN;
    }

    //Assigning the attribute values of this class
    public void setEqual(Book oldBook) {
        bookTitle = oldBook.bookTitle;
        year = oldBook.year;
        noISBN = oldBook.noISBN;
    }

    //Get the book’s title
    public String getTitle() {
        return bookTitle;
    }

    //Get the book’s year
    public int getYear() {
        return year;
    }

    //Get the book’s ISBN
    public int getISBN() {
        return noISBN;
    }
}
