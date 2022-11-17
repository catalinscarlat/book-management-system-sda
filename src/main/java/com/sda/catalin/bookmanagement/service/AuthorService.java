package com.sda.catalin.bookmanagement.service;

import java.security.InvalidParameterException;

public interface AuthorService {

    void createAuthor(String firstName, String lastName) throws InvalidParameterException;
}
