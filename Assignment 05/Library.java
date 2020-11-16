package ssk3101_assignment5;

/**
 *
 * @author sinaa
 */
public class Library {

    //Attributes
    private String libraryName;
    private Book book;

    //No-arg constructor
    public Library() {

    }

    //Constructor
    public Library(String libraryName, Book book) {
        this.libraryName = libraryName;
        this.book = book;
    }

    //Setters
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    //Getters
    public String getLibraryName() {
        return libraryName;
    }

    public Book getBook() {
        return book;
    }

    //toString
    public String toString() {
        return "The location of " + book.getTitle() + ", ISBN: "
                + book.getISBN() + " is at " + libraryName;
    }
}
