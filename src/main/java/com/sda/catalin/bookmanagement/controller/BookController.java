package com.sda.catalin.bookmanagement.controller;

import com.sda.catalin.bookmanagement.service.BookService;
import com.sda.catalin.bookmanagement.service.exceptions.EntityNotFoundException;
import com.sda.catalin.bookmanagement.service.exceptions.InvalidParameterException;

import java.util.Scanner;

public class BookController {
    private final Scanner scanner = new Scanner(System.in);
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public void createBook() {
        try {
            System.out.println("Please insert a title");
            String title = scanner.nextLine();
            System.out.println("Please insert a description");
            String description = scanner.nextLine();
            System.out.println("Please insert an author id");
            int authorId = Integer.parseInt(scanner.nextLine());
            bookService.createBook(title, description, authorId);
            System.out.println("Book was created!");
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please insert a numeric value for author id!");
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Internal system error!");
        }
    }

    public void showAllBooks() {
        bookService.getAllBooks().stream().forEach(book ->
                System.out.println(
                        "Book id: " + book.getId()
                                + " title " + book.getTitle()
                                + " author " + book.getAuthor().getFirstName()
                                + " " + book.getAuthor().getLastName()
                )
        );
    }
}
