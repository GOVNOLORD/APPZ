package Service;

import Entity.books;

import java.util.List;

public interface BookService {
    List<books> findAll();
}