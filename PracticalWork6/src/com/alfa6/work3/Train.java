package com.alfa6.work3;

import com.alfa6.work1.DaysOfWeek;

import java.util.Arrays;

public class Train {

    private int number;
    private String stationDispatch;
    private String timeDispatch;
    private String timeArrival;
    private String stationArrival;
    private DaysOfWeek[] daysOfWeek;

    private static int num = 1;

    public Train() {
        this.number = num;
        num++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStationDispatch() {
        return stationDispatch;
    }

    public void setStationDispatch(String stationDispatch) {
        this.stationDispatch = stationDispatch;
    }

    public String getTimeDispatch() {
        return timeDispatch;
    }

    public void setTimeDispatch(String timeDispatch) {
        this.timeDispatch = timeDispatch;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public String getStationArrival() {
        return stationArrival;
    }

    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }

    public DaysOfWeek[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DaysOfWeek[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " number=" + number +
                ", stationDispatch='" + stationDispatch + '\'' +
                ", timeDispatch='" + timeDispatch + '\'' +
                ", timeArrival='" + timeArrival + '\'' +
                ", stationArrival='" + stationArrival + '\'' +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek);
    }
}
