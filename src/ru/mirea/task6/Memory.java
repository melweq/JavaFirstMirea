package ru.mirea.task6;

public class Memory
{
    int kolpamyati;
    String cvet,type;

    public Memory(int kolpamyati, String cvet, String type)
    {
        this.kolpamyati = kolpamyati;
        this.cvet = cvet;
        this.type = type;
        System.out.printf("Количество памяти:" + kolpamyati);
        System.out.printf("Цвет памяти:" + cvet);
        System.out.printf("Тип памяти:" + type);
    }

}
