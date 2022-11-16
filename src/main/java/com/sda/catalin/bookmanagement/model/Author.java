package com.sda.catalin.bookmanagement.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String last_Name;

    // Not required in the current specification

    //    @OneToMany (mappedBy = "author")
    //    private List<Book> books;

    public Author() {
    }

    public Author(String firstName, String last_Name) {
        this.firstName = firstName;
        this.last_Name = last_Name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", last_Name='" + last_Name + '\'' +
                '}';
    }
}
