package ru.mirea.task6;

import java.util.Scanner;
enum Comp
{
    Computer1,
    Computer2,
    Computer3,
    Computer4
}
public class Computer
{
    public static void main (String args [])
    {
        Comp current = Comp.Computer1;
        System.out.println(current);
        Scanner in = new Scanner(System.in);
        String Name;
        System.out.printf("Введите название книги:");
        Name = in.nextLine();
    }
}
