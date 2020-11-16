package ssk3101_assignment5;

/**
 *
 * @author sinaa
 */
public class Book {

    //Attributes
    private String title;
    private int year;
    private int noISBN;
    private Writer writer;
    private Publisher publisher;

    //No-arg constructor
    public Book() {

    }

    //Constructor without publisher
    public Book(String title, int year, int noISBN, Writer writer) {
        this.title = title;
        this.year = year;
        this.noISBN = noISBN;
        this.writer = writer;
    }

    //Constructor with publisher
    public Book(String title, int year, int noISBN, Writer writer,
            Publisher publisher) {
        this.title = title;
        this.year = year;
        this.noISBN = noISBN;
        this.writer = writer;
        this.publisher = publisher;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setISBN(int noISBN) {
        this.noISBN = noISBN;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getISBN() {
        return noISBN;
    }

    public Writer getWriter() {
        return writer;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    //toString
    public String toString() {
        return title + " (" + year + ") by " + writer + ", " + publisher;
    }
}
