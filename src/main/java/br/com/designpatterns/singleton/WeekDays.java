package br.com.designpatterns.singleton;

public enum WeekDays {
    SUNDAY("Domingo"),
    MONDAY("Segunda-feira"),
    TUESDAY("Terça-feira"),
    WEDNESDAY("Quarta-feira"),
    THURSDAY("Quinta-feira"),
    FRIDAY("Sexta-feira"),
    SATURDAY("Sábado");

    private final String weekName;

    WeekDays(final String weekName) {
        this.weekName = weekName;
    }

    @Override
    public String toString() {
        return weekName;
    }
}
