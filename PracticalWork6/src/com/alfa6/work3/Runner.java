package com.alfa6.work3;

import com.alfa6.work1.DaysOfWeek;

import java.util.Scanner;

public class Runner {

    private static Scanner scanner = new Scanner(System.in);

    public void run() {

        TrainSceduele trainSceduele = new TrainSceduele(2);
        boolean wantContinue = true;
        System.out.println("U a here to create one train!!");
        while (wantContinue) {
            addTrainToSceduale(trainSceduele);
            System.out.println("Do you want to add one more train? [Y] or [No] -->");
            String want = scanner.next();
            if (!want.equalsIgnoreCase("Y"))
                wantContinue = false;
        }
        System.out.println("U created next trains: ");
        trainSceduele.printTrains();
        System.out.println("do u wanna find some trains in your mess? [Y] or [No] -->");
        String want = scanner.next();
        boolean wantFind = want.equalsIgnoreCase("Y");
        if (wantFind) {
            findTrains(trainSceduele);
        }
    }

    private void addTrainToSceduale(TrainSceduele trainSceduele) {

        System.out.println("Enter source station -->");
        String srvStat = scanner.next();
        System.out.println("Enter dest station -->");
        String dstStat = scanner.next();
        System.out.println("Enter time arrival -->");
        String timeArr = scanner.next();
        System.out.println("Enter time destination -->");
        String timeDest = scanner.next();
        System.out.println("Enter days separated by commas -->");
        String days = scanner.next();
        String[] daysOfWeekStr = days.split(",");
        DaysOfWeek[] daysOfWeek = new DaysOfWeek[daysOfWeekStr.length];
        for (int i = 0; i < daysOfWeekStr.length; i++) {
            daysOfWeek[i] = DaysOfWeek.valueOf(daysOfWeekStr[i].toUpperCase());
        }
        trainSceduele.addTrain(trainSceduele.createTrain(dstStat, timeDest, timeArr, srvStat, daysOfWeek));
    }

    private void findTrains(TrainSceduele trainSceduele) {

        System.out.println("Enter destination station --> ");
        String dstf = scanner.next().toUpperCase();
        System.out.println("Enter day of week --> ");
        DaysOfWeek dowf = DaysOfWeek.valueOf(scanner.next().toUpperCase());
        trainSceduele.searchTrains(dowf, dstf);
    }
}
