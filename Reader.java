package com.company;

import java.util.*;
import java.io.*;

class Reader extends Person {
    public ArrayList<Book> readed = new ArrayList<>();
    public ArrayList<Book> inread = new ArrayList<>();
    public Reader(String name, String surname) {
        super(name, surname);
    }
    public Reader clone() {
        return (Reader)super.clone();
    }
    public ArrayList<Book> getReaded() {
        return readed;
    }
    public Book getReaded(int i) {
        return readed.get(i);
    }
    public ArrayList<Book> getInread() {
        return inread;
    }
    public Book getInread(int i) {
        return inread.get(i);
    }
    public String toString() {
        return super.toString();
    }
}