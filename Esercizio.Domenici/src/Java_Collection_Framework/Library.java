package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<Book, Boolean> books;

    public Library() {
        this.books = new LinkedHashMap<>();
    }

    public boolean addBook(Book book) {
        if (books.containsKey(book)) {
            return false;
        }
        books.put(book, true);
        return true;
    }

    public boolean loanBook(Book book) {
        if (!books.get(book)) {
            return false;
        }
        books.put(book, false);
        return true;
    }

    public void printLoans() {
        List<Book> loanedBooks = new ArrayList<>();
        for (Map.Entry<Book, Boolean> entry : books.entrySet()) {
            if (!entry.getValue()) {
                loanedBooks.add(entry.getKey());
            }
        }
        Collections.reverse(loanedBooks);
        for (Book book : loanedBooks) {
            System.out.println(book.getTitle());
        }
    }
}

class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Book a = new Book("a"), b = new Book("b"), c = new Book("c");

        System.out.println(lib.addBook(a));
        System.out.println(lib.addBook(b));
        System.out.println(lib.addBook(c)); 
        System.out.println(lib.addBook(a)); 
        System.out.println(lib.loanBook(c)); 
        System.out.println(lib.loanBook(b)); 
        System.out.println(lib.loanBook(a)); 
        lib.printLoans();
    }
}