package org.sava.catalogservice.domain;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 28.1.24.
 */
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found");
    }
}
