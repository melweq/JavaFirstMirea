package ru.mirea.task1;

public class Number3 {
    // Разработайте программу, в результате работы которой выводятся на экран аргументы командной строки в цикле for.
    public static  void main(String[] args) {
        System.out.println("Command line arguments: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[1]);
        }
    }
    }
