package Reprository;

import Entity.books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookReprository extends JpaRepository<books, Integer> {

}