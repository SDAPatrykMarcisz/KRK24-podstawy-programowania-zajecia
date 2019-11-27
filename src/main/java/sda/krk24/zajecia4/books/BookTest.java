package sda.krk24.zajecia4.books;

import java.util.*;
import java.util.stream.Collectors;

public class BookTest {
    public static void main(String[] args) {
        lastEx();

    }

    private static void sortBy() {
        List<Book> bookList = Arrays.asList(
                new Book(new Author("Patryk", "Marcisz"), Collections.singletonList(BookType.FANTASY), "Alicja"),
                new Book(new Author("Jerzy", "Adams"), Collections.singletonList(BookType.ADVENTURE), "Katarzyna"));

        List<Book> collected = bookList.stream()
                .sorted(Comparator.comparing(book -> book.getAuthor().getSurname()))
                .collect(Collectors.toList());


        collected.forEach(System.out::println);
    }

    private static void lastEx() {
        List<Book> bookList = Arrays.asList(
                new Book(new Author("Patryk", "Marcisz"), Collections.singletonList(BookType.FANTASY), "The crown"),
                new Book(new Author("Jerzy", "Adams"), Collections.singletonList(BookType.ADVENTURE), "Dr. House"),
                new Book(new Author("Wojciech", "Adamczyk"), Arrays.asList(BookType.ADVENTURE, BookType.FANTASY), "Dr. House"));


        Map<BookType, List<Book>> collect = bookList.stream()
                .flatMap(x -> {
                    HashMap<BookType, Book> map = new HashMap<>();
                    for (BookType type : x.getType()) {
                        map.put(type, x);
                    }
                    return map.entrySet().stream();
                })
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),
                        entry -> {
                            List<Book> list = new ArrayList<>();
                            list.add(entry.getValue());
                            return list;
                        },
                        (oldValue, newValue) -> {
                            oldValue.addAll(newValue);
                            return oldValue;
                        }));

        for(Map.Entry<BookType, List<Book>> entry : collect.entrySet()){
            System.out.println(entry.getKey());
            entry.getValue().forEach(System.out::println);
            System.out.println();
        }
    }
}
