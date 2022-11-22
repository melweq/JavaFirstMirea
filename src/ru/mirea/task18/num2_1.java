package ru.mirea.task18;

import java.util.Scanner;

public class num2_1
{
    static public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
