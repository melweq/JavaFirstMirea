package ru.mirea.task6;

public class Monitor {
    int razreshenie;
    String cvet,type;
    public Monitor(int razreshenie, String cvet, String type)
    {
        this.razreshenie = razreshenie;
        this.cvet = cvet;
        this.type = type;
        System.out.printf("Разрешение экрана:" + razreshenie);
        System.out.printf("Цвет монитора:" + cvet);
        System.out.printf("Тип монитора:" + type);
    }
}
