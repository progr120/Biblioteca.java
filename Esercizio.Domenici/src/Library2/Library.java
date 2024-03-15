package Library2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public Book addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        return book;
    }

    public List<Book> getBooksByTag(String tag) {
        List<Book> booksWithTag = new ArrayList<>();
        for (Book book : books) {
            if (book.hasTag(tag)) {
                booksWithTag.add(book);
            }
        }
        return booksWithTag.isEmpty() ? null : booksWithTag;
    }

    public static class Book {
        private String title;
        private String author;
        private Set<String> tags;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.tags = new HashSet<>();
        }

        public void addTag(String tag) {
            tags.add(tag);
        }

        public boolean hasTag(String tag) {
            return tags.contains(tag);
        }

        @Override
        public String toString() {
            return title + ", by " + author;
        }
    }

    public static void main(String[] args) {
        Library casa = new Library(), ucio = new Library();
        Library.Book b1 = casa.addBook("Esercizi di stile", "Queneau");
        b1.addTag("letteratura");
        b1.addTag("umorismo");
        Library.Book b2 = casa.addBook("Me parlare bene un giorno", "Sedaris");
        b2.addTag("umorismo");
        Library.Book b3 = ucio.addBook("Literate programming", "Knuth");
        b3.addTag("programmazione");

        List<Library.Book> humorCasa = casa.getBooksByTag("umorismo");
        System.out.println(humorCasa != null ? humorCasa : Collections.emptyList());

        List<Library.Book> humorUcio = ucio.getBooksByTag("umorismo");
        System.out.println(humorUcio != null ? humorUcio : "null");
    }
}