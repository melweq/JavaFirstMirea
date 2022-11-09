package ru.mirea.task6;

import java.util.Scanner;
class mainClass implements Convertable
{
    int C,K,F;
    public mainClass(int c)
    {
        C = c;
        convert();
    }
    public void convert ()
    {
        System.out.println(toString(C));
    }
    public String toString(int C)
    {
        return "Температура в C = "+ C + "\n" + "Температура в K = "+ (C+273) + "\n" + "Температура в F = "+ (C*9%5-32) + "\n" ;
    }
}