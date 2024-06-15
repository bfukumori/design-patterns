package br.com.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("######### NOT SINGLETON ###########");

        bookDay(WeekDays.SUNDAY);
        bookDay(WeekDays.SATURDAY);

        System.out.println("######### SINGLETON EAGER #########");

        bookDayEager(WeekDays.SUNDAY);
        bookDayEager(WeekDays.SATURDAY);

        System.out.println("######### SINGLETON LAZY ##########");

        bookDayLazy(WeekDays.SUNDAY);
        bookDayLazy(WeekDays.SATURDAY);

        // Reflection - Consegue burlar o singleton da classe
        Constructor<CalendarSingletonLazy> constructor = CalendarSingletonLazy.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        var test1 =constructor.newInstance();
        var test2 = constructor.newInstance();

        System.out.println("######### REFLECTION ##########");

        System.out.println(test1);
        System.out.println(test2);

        System.out.println("######### AVOID REFLECTION USING ENUM AS SINGLETON ##########");

        // Utilizar enum como singleton evita o Reflection
        Constructor<CalendarSingletonEnum> constructor2 = CalendarSingletonEnum.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        var test3 =constructor.newInstance();
    }

    public static void bookDay(WeekDays day) {
        var calendar = new Calendar();
        calendar.book(day);

        System.out.println(calendar.getAvailableDays());
    }

    public static void bookDayEager(WeekDays day) {
        var calendar = CalendarSingletonEager.getInstance();
        calendar.book(day);

        System.out.println(calendar.getAvailableDays());
    }

    public static void bookDayLazy(WeekDays day) {
        var calendar = CalendarSingletonLazy.getInstance();
        calendar.book(day);

        System.out.println(calendar.getAvailableDays());
    }
}
