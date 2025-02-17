package com.example.demo.data;

import lombok.Getter;

public class Book {
    private int id;
    private String title;
    private String author;
    private int noOfCopies;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public Book(int id, String title, String author, int noOfCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.noOfCopies = noOfCopies;
    }

}
