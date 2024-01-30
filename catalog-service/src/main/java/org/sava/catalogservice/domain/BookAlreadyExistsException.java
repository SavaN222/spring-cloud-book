package org.sava.catalogservice.domain;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 28.1.24.
 */
public class BookAlreadyExistsException  extends RuntimeException {

    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists");
    }
}
