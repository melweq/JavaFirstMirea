package ru.mirea.task4;

public enum Seasons {
    WINTER(-20),
    SPRING(15),
    SUMMER(20) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10);

    private final double avgTemp;

    Seasons(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
