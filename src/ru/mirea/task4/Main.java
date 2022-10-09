package ru.mirea.task4;

public class Main {
    public static void main(String[] args) {
        Seasons season1 = Seasons.SPRING;
        ILoveSeason(season1);
        Seasons summer = Seasons.SUMMER;
        for (Seasons season: Seasons.values()) {
            System.out.println(season.toString() + " " + season.getAvgTemp() + " " + season.getDescription());
        }
    }

    public static void ILoveSeason(Seasons season) {
        System.out.print("Я люблю ");
        switch (season) {
            case AUTUMN:
                System.out.println("осень");
                break;
            case SPRING:
                System.out.println("весну");
                break;
            case SUMMER:
                System.out.println("лето");
                break;
            case WINTER:
                System.out.println("зиму");
                break;
        }
    }


}
