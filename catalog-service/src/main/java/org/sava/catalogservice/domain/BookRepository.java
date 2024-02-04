package org.sava.catalogservice.domain;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * TODO: java doc
 * <p>
 * author: savan1508 on 28.1.24.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    Optional<Book> findByIsbn(String isbn);
    boolean existsByIsbn(String isbn);

    @Modifying
    @Transactional
    @Query("DELETE FROM BOOK WHERE isbn = :isbn")
    void deleteByIsbn(String isbn);
}
