package org.sava.catalogservice.demo;

import org.sava.catalogservice.domain.Book;
import org.sava.catalogservice.domain.BookRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 4.2.24.
 */
@Component
@Profile("testdata")
public class BookDataLoader {
    private final BookRepository bookRepository;

    public BookDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        bookRepository.deleteAll();
        var book1 = Book.of("1234567891", "Northern Lights", "Lyra Silverstar", 9.90, null);
        var book2 = Book.of("1234567892", "Polar Journey", "Iorek Polarson", 12.90, "publisher");
        bookRepository.saveAll(List.of(book1, book2));
    }
}
