package ru.mirea.task18;

import java.util.Scanner;

public class num2_3
{
    static public void exceptionDemo()
    {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try
        {
            int i = Integer.parseInt(intString);
            System.out.print( 2/i );
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Строка - не число!");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
