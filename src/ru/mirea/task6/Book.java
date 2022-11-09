package ru.mirea.task6;

import java.util.Scanner;
class BookClass implements Printable
{
    String name;
    public BookClass(String name)
    {
        this.name = name;
        print();
    }
    public void print ()
    {
        System.out.println(toString());
    }
    @Override
    public String toString()
    {
        return "Book:" + name ;
    }
}
public class Book
{
    public static void main (String args [])
    {
        Scanner in = new Scanner(System.in);
        String Name;
        System.out.printf("Введите название книги:");
        Name = in.nextLine();
        Printable per7 = new BookClass (Name);
    }
}
