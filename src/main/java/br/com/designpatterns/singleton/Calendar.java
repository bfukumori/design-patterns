package br.com.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class Calendar {
    private final Map<WeekDays,Boolean> availableDays = new HashMap<>();

    public Calendar() {
        availableDays.put(WeekDays.SUNDAY,true);
        availableDays.put(WeekDays.MONDAY,true);
        availableDays.put(WeekDays.TUESDAY,true);
        availableDays.put(WeekDays.WEDNESDAY,true);
        availableDays.put(WeekDays.THURSDAY,true);
        availableDays.put(WeekDays.FRIDAY,true);
        availableDays.put(WeekDays.SATURDAY,true);
    }

    public void book(WeekDays day) {
        availableDays.replace(day,false);
    }

    public Map<WeekDays, Boolean> getAvailableDays() {
        return availableDays;
    }
}
