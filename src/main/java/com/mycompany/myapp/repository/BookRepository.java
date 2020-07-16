package com.mycompany.myapp.repository;
import com.mycompany.myapp.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.math.BigDecimal;
import java.util.List;


/**
 * Spring Data  repository for the Book entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query(value = "SELECT * FROM book WHERE price <= ?1 ORDER BY id",
        countQuery = "SELECT count(*) FROM book WHERE price <= ?1",
        nativeQuery = true)
    Page<Book> findByPriceLessThanEquals(BigDecimal cheap_book_price, Pageable pageable);

}
