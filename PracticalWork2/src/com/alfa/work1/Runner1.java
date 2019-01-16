package com.alfa.work1;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner1 {


    public void run() {

        Book book = new Book(1, "Author", "title", "Publisher", 1998, 2000.00);
        Book book1 = new Book(2, "Author1", "title1", "Publisher1", 1999, 222, 2000.00);
        book.view();
        book1.view();
        Book[] books = createBooks(7);
        printBook(books);
        increaseCost(books, 10);
        printBook(books);
        Book[] books1 = searchBookByAuthor(books, "Author111");
        printBook(books1);
        printBook(searchBookByPublisher(books, "publisher1"));
        printBook(searchBookByYear(books, 1993));
        printBook(searchBookByPublisher(books, "KJSDFHKS<HBDF"));

    }

    public Book[] createBooks(int amount) {

        Book[] book = new Book[amount];
        /*for (int i = 0; i < amount; i++) {
            book[i] = new Book(i, randomString(6), randomString(7), randomString(15),
                    (int) (Math.random() * 1000), (int) (Math.random() * 1000), (Math.random() * 1000));
        }*/
        for (int i = 0; i < amount; i++) {
            book[i] = new Book(i, "Title" + i, "Author" + i, "Publisher" + i,
                    1990 + i, (int) (Math.random() * 1000), Math.random() * 1000);

        }
        return book;
    }

    public String randomString(int length) {

        String string = "";
        String chars = "qwertyuiopasdfghjklzxcvbnm";
        for (int i = 0; i < length; i++) {

            string += chars.charAt((int) (Math.random() * chars.length()));
        }
        return string;
    }

    public void printBook(Book[] books) {

        if (books.length > 0) {
            for (Book b :
                    books) {
                b.view();
            }
        }
    }

    public void increaseCost(Book[] books, double percent) {

        System.out.printf("Start increasing price of books on %f percent %n", percent);
        for (Book b :
                books) {
            double newPrice = b.getCost() * (100 + percent) / 100;
            System.out.printf("The old price of book '%s' is %.2f and the new price is %.2f %n", b.getTitle(), b.getCost(), newPrice);
            b.setCost(newPrice);
        }
    }

    public void decreaseCost(Book[] books, double percent) {

        for (Book b :
                books) {
            b.setCost(b.getCost() * (100 - percent) / 100);
        }
    }

    public Book[] searchBookByAuthor(Book[] books, String author) {


        Book[] newBooks = new Book[books.length];
        int counter = 0;

        for (Book b : books) {

            if (b.getAuthor().equalsIgnoreCase(author)) {
                newBooks[counter] = b;
                counter++;
            }
        }

        if (books.length > 0) {

            Book[] foundBooks = Arrays.copyOf(newBooks, newBooks.length);
            System.out.printf("Found next %d books by your query '%s':%n ", foundBooks.length, author);
            return foundBooks;
        } else {
            System.out.printf("There are no one book by your query '%s' %n", author);
            return new Book[0];
        }
        /*

        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book b : books) {
            if (author.equalsIgnoreCase(b.getAuthor())) {
                foundBooks.add(b);
            }
        }
        if (!foundBooks.isEmpty())
            System.out.printf("Found next %d books by your query '%s':%n ", foundBooks.size(), author);
        else
            System.out.printf("There are no one book by your query '%s' %n", author);
        return foundBooks.toArray(new Book[0]);*/

    }

    public Book[] searchBookByPublisher(Book[] books, String publisher) {

        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book b : books) {
            if (publisher.equalsIgnoreCase(b.getPublisher())) {
                foundBooks.add(b);
            }
        }
        if (!foundBooks.isEmpty())
            System.out.printf("Found next %d books by your query '%s':%n ", foundBooks.size(), publisher);
        else
            System.out.printf("There are no one book by your query '%s' %n ", publisher);
        return foundBooks.toArray(new Book[0]);

    }

    public Book[] searchBookByYear(Book[] books, int year) {


        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book b : books) {
            if (b.getYear() > year) {
                foundBooks.add(b);
            }
        }
        if (!foundBooks.isEmpty())
            System.out.printf("Found next %d books by your query - published later than %d: %n", foundBooks.size(), year);
        else
            System.out.printf("There are no one book by your query - published later than %d %n ", year);
        return foundBooks.toArray(new Book[0]);
    }

    public static void main(String[] args) {

        Runner1 ra = new Runner1();

        Book[] books = ra.createBooks(4);

        for (Book b :
                books) {
            System.out.println(b.getCost());

        }
        ra.increaseCost(books, 10);
        for (Book b :
                books) {
            System.out.println(b.getCost());

        }
        ra.searchBookByYear(books, 1991);

        System.out.println(Math.round(Math.random() * 1000));

    }
}
