package com.alfa6.work3;

import com.alfa6.work1.DaysOfWeek;

import java.util.Arrays;

public class TrainSceduele {

    private Train[] trains;
    private int count = 0;

    public TrainSceduele(int amount) {

        trains = new Train[amount];
    }

    public void addTrain(Train train) {

        if (count == trains.length) {
            Train[] newTrains = Arrays.copyOf(trains, ((int) (trains.length * 1.5)));
            trains = newTrains;
        }
        trains[count] = train;
        count++;
    }

    public void searchTrains(DaysOfWeek daysOfWeek, String destStation) {

        if (count == 0) {
            System.out.println("The are no one train!!!!!");
            return;
        }
        int counter = 0;
        Train[] foundTrains = new Train[count];
        for (int i = 0; i < count; i++) {
            if (destStation.equalsIgnoreCase(trains[i].getStationDispatch())) {
                for (DaysOfWeek d : trains[i].getDaysOfWeek()) {
                    if (daysOfWeek.equals(d)) {
                        foundTrains[counter] = trains[i];
                        counter++;
                    }
                }
            }
        }
        Train[] trainsToprint = Arrays.copyOf(foundTrains, counter);

        if (trainsToprint.length > 0) {
            System.out.println("We have found trains for you");
            for (int i = 0; i < trainsToprint.length; i++) {
                System.out.println(trainsToprint[i].toString());
            }
        } else System.out.println("there are no one train by your query");
    }

    public void printTrains() {

        for (int i = 0; i < count; i++) {
            System.out.println(trains[i].toString());
        }
    }

    public Train createTrain(String stationDispatch, String timeDispatch, String timeArrival,
                             String stationArrival, DaysOfWeek[] daysOfWeek) {

        Train train = new Train();
        train.setTimeDispatch(timeDispatch);
        train.setStationArrival(stationArrival);
        train.setTimeArrival(timeArrival);
        train.setStationDispatch(stationDispatch);
        train.setDaysOfWeek(daysOfWeek);
        return train;
    }


}
