package com.company;

import java.util.*;
import java.io.*;

class Person implements Comparable<Person>, Cloneable {

    public String name;
    public String surname;
    public int age;

    public Person(String nm, String srnm) {
        this.name = nm;
        this.surname = srnm;
        this.age = 0;
    }
    public Person(String nm, String srnm, int age) {
        this.name = nm;
        this.surname = srnm;
        this.age = age;
    }
    public Person clone() {
        try {
            return (Person)super.clone();
        } catch(CloneNotSupportedException cnse) {
            return null;
        }

    }

    public String getName() {
        return this.name = name;
    }

    public void setName(String name) {
        if (Character.isUpperCase(name.charAt(0))) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Vardas rašomas iš didžiosios raidės");
        }
    }

    public String getSurname() {
        return this.surname = surname;
    }

    public void getSurname(String surname) {
        if (Character.isUpperCase(surname.charAt(0))) {
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Pavarde rašoma iš didžiosios raidės");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Klaida, amžius negali būti neigiamas");
        }
    }
    /*  Mano varjantas
        public int compareTo(Person pe) {
            if(this.surname.equals(pe.surname) || this.name.equals(pe.name)) {
                return Integer.compare(this.age, pe.age);
            } else if(this.surname.equalsIgnoreCase(pe.surname)) {
                return this.name.compareTo(pe.name);
            } else {
                return this.surname.compareTo(pe.surname);
            }
        }

     */
//      Tatjanos/destytojo varjantas
    public int compareTo(Person name2) {
        if (!this.getSurname().equalsIgnoreCase(name2.getSurname()) ) {
            return this.getSurname().compareTo(name2.getSurname());
        } else if (!this.getName().equalsIgnoreCase(name2.getName())) {
            return this.getName().compareTo(name2.getName());
        } else {
            return Integer.compare(this.getAge(), name2.getAge());
        }
    }

    public String toString() {
        if(age > 0) {
            return name + " " + surname + " " + age + "m.";
        } else {
            return name + " " + surname;
        }
    }
}
/*
class PersonCompare implements Comparator<Person> {
    public int compareTo(Person pe1, Person pe2) {
        if(pe1.getSurname() == pe2.getSurname() || pe1.getName() == pe2.getName()) {
            return Integer.compare(pe1.getAge(), pe2.getAge());
        } else if(pe1.getSurname() == pe2.getSurname()) {
            return pe1.getName().compareToIgnoreCase(pe2.getName());
        } else {
            return pe1.getSurname().compareToIgnoreCase(pe2.getSurname());
        }
    }
}
*/