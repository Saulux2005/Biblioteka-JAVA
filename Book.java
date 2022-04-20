package com.company;

import java.util.*;
import java.io.*;

class Book {
    //    public ArrayList<Author> author = new ArrayList<>();
    public Author author;
    public String title;
    public int year;
    public String genre;

    //    public Book(String title, int year, String genre) {
//        this.title = title;
//        this.year = year;
//        this.genre = genre;
//    }
    public Book(Author author, String title, int year, String genre) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.genre = genre;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public Author getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return this.title;
    }
    public int getYear() {
        return this.year;
    }
    public String getGenre() {
        return this.genre;
    }
//    public ArrayList<Author> getAuthor() {
//        return author;
//    }
//    public Author getAuthor(int i) {
//        return author.get(i);
//    }

    public String toString() {
        return author + " " + title + " " + year + "m. " + genre;
    }
}