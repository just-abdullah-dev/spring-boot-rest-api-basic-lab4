package com.example.demo.api;

import com.example.demo.data.Book;
import com.example.demo.data.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/books")

public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping()
    public ArrayList<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public Optional<Book> getBookById(@PathVariable int bookId) {
        return bookService.getBookById(bookId);
    }


    @PostMapping("/add")
    public String addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/update")
    public String updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/delete")
    public String deleteBook(@RequestParam int bookId) {
        return bookService.removeBook(bookId);
    }

    @PostMapping("/borrow/{bookId}")
    public String borrowBook(@PathVariable int bookId) {
        return bookService.borrowBook(bookId);
    }

    @PostMapping("/return/{bookId}")
    public String returnBook(@PathVariable int bookId) {
        return bookService.returnBook(bookId);
    }

}