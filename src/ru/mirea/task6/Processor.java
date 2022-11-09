package ru.mirea.task6;

public class Processor {
    int kolichestvo;
    String cvet,type;
    public Processor(int kolichestvo, String cvet, String type)
    {
        this.kolichestvo = kolichestvo;
        this.cvet = cvet;
        this.type = type;
        System.out.printf("Количество процессоров:" + kolichestvo);
        System.out.printf("Цвет процессора:" + cvet);
        System.out.printf("Тип процессора:" + type);
    }
}
