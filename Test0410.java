package com.company;

import java.util.*;
import java.io.*;

/*    public int compare(Book b1, Book b2) {
        if (!this.getSurname().equalsIgnoreCase(name2.getSurname()) ) {
            return this.getSurname().compareTo(name2.getSurname());
        } else if (!this.getName().equalsIgnoreCase(name2.getName())) {
            return this.getName().compareTo(name2.getName());
        } else {
            return Integer.compare(this.getAge(), name2.getAge());
        }
    }
    public int compare(Book b1, Book b2) {
        if (!this.getSurname().equalsIgnoreCase(name2.getSurname()) ) {
            return this.getSurname().compareTo(name2.getSurname());
        } else if (!this.getName().equalsIgnoreCase(name2.getName())) {
            return this.getName().compareTo(name2.getName());
        } else {
            return Integer.compare(this.getAge(), name2.getAge());
        }
    }*/

public class Test0410 {

    public static void main(String[] args) {

        try {
//            0 uzduoties baze
/*            ArrayList<Person> person = new ArrayList<>();
            person.add(new Person("Benas", "Benavičius", 32));
            person.add(new Person("Marius", "Petrauskas", 28));
            person.add(new Person("Austė", "Katliūtė", 7));
            person.add(new Person("Marytė", "Sinaprė", 67));
            person.add(new Person("Sandra", "Katliūtė", 9));
            person.add(new Person("Sandra", "Katliūtė", 10));
            Collections.sort(person);
            System.out.println(person);
*/
//           Projektas - BIBLIOTEKA
//            Autoriu baze
           ArrayList<Author> author = new ArrayList<>();
            author.add(new Author("Bernardas", "Brazdzionis"));
            author.add(new Author("Ieva", "Simonaityte"));
            author.add(new Author("Salomeja", "Neris"));
            author.add(new Author("Kazys", "Binkis"));
            author.add(new Author("Kostas", "Kubilinskas"));
            author.add(new Author("Julius", "Janonis"));
//            Collections.sort(author);
            System.out.println(author);

//            Skaitytoju READER baze
/*
            ArrayList<Reader> reader = new ArrayList<>();
            reader.add(new Reader("Benas", "Benavičius"));
            reader.add(new Reader("Marius", "Petrauskas"));
            reader.add(new Reader("Austė", "Katliūtė"));
            reader.add(new Reader("Marytė", "Sinaprė"));
            reader.add(new Reader("Sandra", "Katliūtė"));
            reader.add(new Reader("Sandra", "Katliūtė"));
            Collections.sort(reader);
            System.out.println(reader);
*/
/*            Author persona = new Author("Marius", "Petrauskas");
            Author personaCopy = (Author)persona.clone();
            System.out.println(personaCopy);
*/
/*            ArrayList<Book> book = new ArrayList<>();
            book.add(new Book("Skrydis virs gegutes lizdo", 1971, "Lyrika"));
            book.add(new Book("Avineliu tylejimas", 1988, "Grozine"));
            book.add(new Book("Brisiaus galas", 1991, "Komedija"));
            book.add(new Book("Kliudziau", 1863, "Trileris"));
            book.add(new Book("Lietuva brangi" , 2001, "Detektyvas"));
            book.add(new Book("Kas pasake miau", 2010, "Muzika"));
//            Collections.sort(book);
            for(int i =0; i < book.size(); ++i) {
                System.out.print(author.get(i) + " - ");
                System.out.print(book.get(i));
                System.out.println();
            }*/


/*            FileWriter fw = new FileWriter("authors.txt");
            for(int i = 0; i < book.size(); ++i) {
                Book bb = new book.get(i);
                fw.write(book.get(i));
            }
            fw.close();*/

            File file = new File("authors.txt");
            Scanner sc = new Scanner(file);
            ArrayList<Book> bookReaded = new ArrayList<>();
            int i = 0;
            while (sc.hasNextLine()) {
//                book.add(new Book(data));
                String line = sc.nextLine();
                int spacePos = line.indexOf(",");
                String x = line.substring(0, spacePos);
                System.out.println(x);

                String remStr = line.substring(spacePos+2);
                int spacePos2 = remStr.indexOf(",");
                int y = Integer.parseInt(remStr.substring(0, spacePos2));
                System.out.println(y);

                String z = line.substring(spacePos+spacePos2+4);
                System.out.println(z);

                System.out.println(author.get(i));
                Book book = new Book(author.get(i), x, y, z);
                bookReaded.add(book);
                System.out.println(bookReaded);
                ++i;

            }
            sc.close();

        } catch(Exception e) {
            System.out.println(e);
            System.out.println("Ajajai, bedute!");
        }
}

}
