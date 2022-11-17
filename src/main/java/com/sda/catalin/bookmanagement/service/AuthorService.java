package com.sda.catalin.bookmanagement.service;

import com.sda.catalin.bookmanagement.model.Author;
import com.sda.catalin.bookmanagement.service.exceptions.EntityNotFoundException;

import java.security.InvalidParameterException;
import java.util.List;

public interface AuthorService {

    void createAuthor(String firstName, String lastName) throws InvalidParameterException;

    void updateAuthor(int authorId, String firstName, String lastName) throws InvalidParameterException, EntityNotFoundException;

    List<Author> getAllAuthors();

}
