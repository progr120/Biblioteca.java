package Java_Collection_Framework;

public class App {
    public static void main(String[] args) {

        Library library = new Library();

        Book a = new Book("a");
        Book b = new Book("b");
        Book c = new Book("c");

        System.out.println(library.addBook(a)); // true
        System.out.println(library.addBook(b)); // true
        System.out.println(library.addBook(c)); // true

        System.out.println(library.addBook(a)); // false

        System.out.println(library.loanBook(b)); // true
        System.out.println(library.loanBook(a)); // true

        library.printLoan();

        System.out.println(library.loanBook(b)); // false

        // library.loanBook(new Book("x")); //Exception

        // library.returnBook(new Book("x")); //Exception

        library.returnBook(c); // Exception
    }
}
