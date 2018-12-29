package com.alfa.work1;

public class Book {

    private int Id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double cost;

    public Book(int id, String title, String author, String publisher, int year, int pages, double cost) {
        this.Id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
    }

    public Book(int id, String title, String author, String publisher, int year, double cost) {

        this(id, title, author, publisher, year, 0, cost);
    }

    public Book(int id, String title, String author, String publisher, double cost) {

        this(id, title, author, publisher, 0, cost);
    }

    public Book() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public void view() {

        System.out.println("Book{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", cost=" + cost +
                '}');
    }
}
