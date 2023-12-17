package Service;

import Entity.books;
import Reprository.BookReprository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookReprository bookReprository;

    @Override
    public List<books> findAll(){
        return bookReprository.findAll();
    }
}