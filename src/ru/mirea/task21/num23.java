package ru.mirea.task21;

import java.util.Scanner;

public class num23 extends AnyTapeArray {
    public static <E> void  sid  (String s, E [] arr)
    {
        E [] a = arr;
        AnyTapeArray <E> sid = new AnyTapeArray <E> ();
        sid.setArr(a);
        System.out.print(s + "  ");
        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");
        System.out.println();
        System.out.println("Введите индекс элемента:");
        Scanner myScanner = new Scanner( System.in);
        int indexx=myScanner.nextInt();
        System.out.println(sid.getArrIndex(indexx));
    }
    public static void main(String [] args){
        String [] s = {"Hello", "World","!"};
        sid("String" , s);
        Integer [] intr = { 1,2,3,4,5,6,7,8};
        sid("Integer" , intr);
        Double [] ad = {1.2,1.5,6.7};
        sid("Double" , ad);
    }
}