package com.example.demo.data;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BookService {
    private final ArrayList<Book> books = new ArrayList<Book>();

    public String addBook(Book book) {
        // Check if a book with the same ID already exists
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                return "Book with this ID already exists";
            }
        }
        // Add the book if no duplicate is found
        books.add(book);
        return "Book added";
    }

    public String removeBook(int bookId) {
        return books.removeIf(book -> book.getId() == bookId) ?
                "Book removed successfully!" : "Book not found!";
    }

    public Optional<Book> getBookById(int bookId) {
        return books.stream().filter(book -> book.getId() == bookId).findFirst();
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public String updateBook(Book updatedBook) {
        for (Book book : books) {
            if (book.getId() == updatedBook.getId()) {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setNoOfCopies(updatedBook.getNoOfCopies());
                return "Book updated successfully!";
            }
        }
        return "Book not found!";
    }

    public String borrowBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.getNoOfCopies() > 0) {
                    book.setNoOfCopies(book.getNoOfCopies() - 1);
                    return "Book borrowed successfully!";
                } else {
                    return "No copies available!";
                }
            }
        }
        return "Book not found!";
    }

    public String returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.setNoOfCopies(book.getNoOfCopies() + 1);
                return "Book returned successfully!";
            }
        }
        return "Book not found!";
    }

}
