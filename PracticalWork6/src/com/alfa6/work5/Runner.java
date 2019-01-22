package com.alfa6.work5;

public class Runner {

    public void run() {

        Shape[] shapes = new Shape[]{
                Shape.parseShape("Rectangle:RED:10,20"),
                Shape.parseShape("Circle:BLACK:10"),
                Shape.parseShape("Triangle:GREEN:9,7,12")};


        for (Shape d :
                shapes) {
            System.out.println(d.toString());
        }
    }
}
