package core;


import core.work1.Task1;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class NotAWork {


    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        try {

            System.out.println(a / b);
        }catch (NullPointerException e) {
            System.out.println("Block catch");
        }finally {
            System.out.println("Block finnaly");
            System.out.println();
        }
    }
}
