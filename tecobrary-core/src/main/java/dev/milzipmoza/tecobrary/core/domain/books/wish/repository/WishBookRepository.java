package dev.milzipmoza.tecobrary.core.domain.books.wish.repository;

import dev.milzipmoza.tecobrary.core.domain.books.wish.entity.WishBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishBookRepository extends JpaRepository<WishBook, Long> {
}
