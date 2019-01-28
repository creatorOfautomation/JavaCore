package com.alfa8.work1;

public class Runner {

    public void run() {

        MyPhoneBook book = new MyPhoneBook();

        book.addPhoneNumber("Name", "123");
        book.addPhoneNumber("name1", "456");
        book.addPhoneNumber("name1", "45");
        book.addPhoneNumber("ame1", "4569");
        book.addPhoneNumber("me1", "458");
        book.addPhoneNumber("ame2", "457");

        book.printPhoneBook();
    }
}
