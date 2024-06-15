package br.com.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CalendarSingletonLazy {
    private final Map<WeekDays,Boolean> availableDays = new HashMap<>();

    private CalendarSingletonLazy() {
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

    private static CalendarSingletonLazy INSTANCE = null;

    public static CalendarSingletonLazy getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new CalendarSingletonLazy();
            return INSTANCE;
        }
        return INSTANCE;
    }
}
