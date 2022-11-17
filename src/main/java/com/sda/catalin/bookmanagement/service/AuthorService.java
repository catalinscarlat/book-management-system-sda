package com.sda.catalin.bookmanagement.service;

import com.sda.catalin.bookmanagement.model.Author;

import java.security.InvalidParameterException;
import java.util.List;

public interface AuthorService {

    void createAuthor(String firstName, String lastName) throws InvalidParameterException;
    List<Author> getAllAuthors();
}
