package ru.mirea.task18;

import java.util.Scanner;

public class num4
{
    static public void exceptionDemo()
    {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Строка - не число!");
        }
        finally {
            System.out.println( "Ну,Мы идем дальше вне зависимости от исключений... ");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
