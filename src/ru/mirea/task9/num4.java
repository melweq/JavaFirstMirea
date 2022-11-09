package ru.mirea.task9;

public class num4
{
    public static void main(String[] args)
    {
        int a,b;
        a=9;
        b=-8;
        comparablecvoi(a,b);
    }
    public static void comparablecvoi(int a,int b)
    {
        if(a>b)System.out.println(1);
        if(a<b) System.out.println(-1);
        if(a==b)System.out.println(0);
    }

}
