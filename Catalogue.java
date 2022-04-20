package com.company;

import java.util.*;
import java.io.*;

class Catalogue {
    public ArrayList<Book> books = new ArrayList<>();
    public Book book;


    public void setBooks(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBook() {
        return this.books;
    }

    public Book getBook(int i) {
        return this.books.get(i);
    }
}