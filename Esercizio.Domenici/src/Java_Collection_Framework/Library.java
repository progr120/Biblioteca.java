package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Library {

    public static void main(String[] args) {
            Library lib = new Library();
            Book a = new Book("a"), b = new Book("b"), c = new Book("c");
    
            System.out.println(lib.addBook(a));
            System.out.println(lib.addBook(b));
            System.out.println(lib.addBook(c));
            System.out.println(lib.addBook(a));
            System.out.println(lib.loanBook(b));
            System.out.println(lib.loanBook(a));
            lib.printLoans();
        }
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public boolean addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            return true;
        }
        return false;
    }

    public boolean loanBook(Book book) {
        if (!book.isLoaned()) {
            book.setLoanDate(new Date());
            book.setLoaned(true);
            return true;
        }
        return false;
    }

    public void printLoans() {
        for (Book book : books) {
            if (book.isLoaned()) {
                System.out.println(book.getTitle());
            }
        }
    }
}
