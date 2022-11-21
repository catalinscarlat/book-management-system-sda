package com.sda.catalin.bookmanagement.repository;

import com.sda.catalin.bookmanagement.model.Book;

public class BookRepositoryImpl extends BaseRepositoryImpl<Book> implements BookRepository{
    public BookRepositoryImpl() {
        super(Book.class);
    }
}
