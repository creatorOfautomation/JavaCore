package com.alfa;
import com.alfa.work1.Book;

import java.util.Random;

public class Runner {


    public Book[] createBooks(int amount) {

        Book[] book = new Book[amount];
        for (int i = 0; i < amount; i++) {
            book[i] = new Book(i, randomString(6), randomString(7), randomString(15),
                    (int) (Math.random() * 1000), (int) (Math.random() * 1000), (Math.random() * 1000));
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


    public void run() {

        Book[] books = createBooks(7);
        printBook(books);
        decreaseCost(books, -10);
        printBook(books);
    }


    public void printBook(Book[] books) {

        for (Book b :
                books) {
            b.view();
        }
    }

    public void decreaseCost(Book[] books, double percent) {

        System.out.println("1st price " + books[0].getCost());
        for (Book b :
                books) {
            b.setCost(b.getCost() * (100 - percent) / 100);
        }
        System.out.println("2nd price " + books[0].getCost());
    }

    public static void main(String[] args) {

        Runner ra = new Runner();
        ra.decreaseCost(ra.createBooks(1),-20);


    }
}
