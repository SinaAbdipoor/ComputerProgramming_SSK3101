package ssk3101_assignment5;

/**
 *
 * @author sinaa
 */
public class Test {

    public static void main(String[] args) {
        Writer writer1 = new Writer("Qi", "Zihao");
        Writer writer2 = new Writer("Liu", "Yuhan");
        Publisher publisher1 = new Publisher("Cengage Sdn. Bhd.", "Shah Alam");
        Publisher publisher2 = new Publisher("Pelangi", "Bangi");
        Book book1 = new Book("Java Programming", 2019, 48562, writer1,
                publisher1);
        Book book2 = new Book("Computer Programming", 2020, 48562, writer2,
                publisher2);
        Library library1 = new Library("Sultan Abdul Samad Library", book1);
        Library library2 = new Library("Shah Alam Library", book2);
        Borrower borrower1 = new Borrower("Hu Sihan", book1);
        Borrower borrower2 = new Borrower("Omran", book2);

        System.out.println(borrower1.toString());
        System.out.println(borrower2.toString());
        System.out.println(library2);

        library2.setLibraryName("UNITEN library");

        System.out.println(library2);
    }

}
