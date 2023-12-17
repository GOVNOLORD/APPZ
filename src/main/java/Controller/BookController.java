package Controller;

import Entity.books;
import Service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping(path = "/students")
    public @ResponseBody List<books> getAllStudents(){
        return bookService.findAll();
    }
}