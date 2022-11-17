package com.sda.catalin.bookmanagement.controller;

import com.sda.catalin.bookmanagement.service.AuthorService;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class AuthorController {
    private final AuthorService authorService;
    private final Scanner scanner = new Scanner(System.in);

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    public void createAuthor(){
        try {
            System.out.println("Please insert author first name:");
            String firstName = scanner.nextLine();
            System.out.println("Please insert author last name:");
            String lastName = scanner.nextLine();

            authorService.createAuthor(firstName, lastName);
            System.out.println("Author was created!");
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Internal server error!");
        }
    }
}