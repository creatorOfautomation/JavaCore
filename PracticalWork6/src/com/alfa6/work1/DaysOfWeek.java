package com.alfa6.work1;

public enum DaysOfWeek {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;


    public DaysOfWeek nextDay() {
        DaysOfWeek[] week = DaysOfWeek.values();
        int position = ordinal();
        if (position == week.length - 1) return week[0];
        return week[position + 1];

    }
}
