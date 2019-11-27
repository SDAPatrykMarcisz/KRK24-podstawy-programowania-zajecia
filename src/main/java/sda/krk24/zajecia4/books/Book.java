package sda.krk24.zajecia4.books;

import java.util.List;

public class Book {

    private Author author;
    private List<BookType> type;
    private String tittle;

    public Book(Author author, List<BookType> type, String tittle) {
        this.author = author;
        this.type = type;
        this.tittle = tittle;
    }

    public Author getAuthor() {
        return author;
    }

    public List<BookType> getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", type=" + type +
                '}';
    }
}
