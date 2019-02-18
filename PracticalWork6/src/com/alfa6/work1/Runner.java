package com.alfa6.work1;

import java.util.Scanner;

public class Runner {


    public void run() {

        //1
//        for (DaysOfWeek d :
//                DaysOfWeek.values()) {
//            System.out.println(d);
//        }
//        //2
//        DaysOfWeek daysOfWeek = DaysOfWeek.FRIDAY;
//        System.out.println("-------------------------------------");
//        for (DaysOfWeek d :
//                DaysOfWeek.values()) {
//
//            switch (d.ordinal()) {
//                case 1: case 3: case 5:
//                    System.out.println(d);
//            }
//
//        }

        //3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day of week --> ");

        String day = sc.next();
        DaysOfWeek week = DaysOfWeek.valueOf(day.toUpperCase());
        System.out.println("Next day of week " + week.nextDay());
    }


    public static void main(String[] args) {
        System.out.println(DaysOfWeek.FRIDAY.ordinal());
    }
}
