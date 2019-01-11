package com.alfa.work3;

import java.util.Random;

public class ID {

    private int id;
    private static int nextId;

    static {
        nextId= ((int) (Math.random() * 100));

    }
    public int getId() {
        return id;
    }

    {
        nextId++;
        id = nextId;

    }

    public ID() {
    }
}
