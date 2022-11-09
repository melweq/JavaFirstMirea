package ru.mirea.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class num3{
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list1.add(-3);
        list1.add(1);
        list1.add(8);
        list1.add(12);
        list2.add(-7);
        list2.add(5);
        list2.add(13);
        list2.add(32);
        list3=Listedin(list1,list2 ,list3);
    }
    static public List<Integer> Listedin(List<Integer>temp1,List<Integer>temp2,List<Integer> list3)
    {
        int i;
        list3.add(0, temp1.get(0));
        list3.add(1, temp1.get(1));
        list3.add(2, temp1.get(2));
        list3.add(3, temp1.get(3));
        list3.add(4, temp2.get(0));
        list3.add(5, temp2.get(1));
        list3.add(6, temp2.get(2));
        list3.add(7, temp2.get(3));
        return ListReturn(list3);
    }
    static public List<Integer> ListReturn(List<Integer> list3)
    {
        int f,j=0;
        if(list3.get(0)<list3.get(1))
            if(list3.get(1)<list3.get(2))
                if(list3.get(2)<list3.get(3))
                    if(list3.get(3)<list3.get(4))
                        if(list3.get(4)<list3.get(5))
                            if(list3.get(5)<list3.get(6))
                                if(list3.get(6)<list3.get(7))
                                {
                                    Object[] peopleArray = list3.toArray();
                                    for(Object person : peopleArray)
                                    {
                                        System.out.print(person+" ");
                                    }
                                    return list3;
                                }
        for(int i=1;i<8;i++)
        {
            if(list3.get(i-1)>list3.get(i))
            {
                f=list3.get(i);
                list3.set(i,list3.get(i-1));
                list3.set(i-1,f);
            };
        }
        return ListReturn(list3);
    }

}
