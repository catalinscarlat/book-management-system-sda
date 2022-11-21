package com.sda.catalin.bookmanagement.service;

import com.sda.catalin.bookmanagement.model.Book;
import com.sda.catalin.bookmanagement.service.exceptions.EntityNotFoundException;
import com.sda.catalin.bookmanagement.service.exceptions.InvalidParameterException;

import java.util.List;

public interface BookService {
    void createBook(String title, String description, int authorId) throws EntityNotFoundException, InvalidParameterException;
    List<Book> getAllBooks ();
}
