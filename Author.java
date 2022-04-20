package com.company;

import java.util.*;
import java.io.*;

class Author extends Person {
    public ArrayList<Book> books = new ArrayList<>();
    public Author(String name, String surname) {
        super(name, surname);
    }
    public Author clone() {
        return (Author)super.clone();
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public Book getBook(int i) {
        return books.get(i);
    }
    public void add(Book book) {
        books.add(book);
    }
    public String toString() {
        return super.toString();
    }
}