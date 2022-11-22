package ru.mirea.task18;

import java.util.Scanner;

public class num3
{
    static public void exceptionDemo()
    {
        boolean fl=true;
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (Exception e) {
            System.out.println("Найденно исключение!");
            fl=false;
        }
        if(fl==true)System.out.println("Исключений не найденно!");
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}