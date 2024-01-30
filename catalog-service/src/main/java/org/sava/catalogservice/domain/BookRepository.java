package org.sava.catalogservice.domain;

import java.util.Optional;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 28.1.24.
 */
public interface BookRepository {
    Iterable<Book> findAll();

    Optional<Book> findByIsbn(String isbn);

    boolean existsByIsbn(String isbn);

    Book save(Book book);

    void deleteByIsbn(String isbn);
}
