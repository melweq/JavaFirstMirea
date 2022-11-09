package ru.mirea.task10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class Tester implements Comparator<Student>
{
    Scanner in = new Scanner(System.in);
    public  Student[] idNumber = new Student[20];
    public void setArray()
    {
        int i,f;
        String A;
        for(i=0;i<3;i++)
        {
            idNumber[i] = new Student();
            System.out.println("ведите Имя студента:");
            A=in.nextLine();
            idNumber [i] .setName(A);
            System.out.println("ведите фамилию студента:");
            A=in.nextLine();
            idNumber [i] .setSurename(A);
            System.out.println("ведите Специальность студента:");
            A=in.nextLine();
            idNumber [i] .setSpecialnost(A);
            System.out.println("ведите курс студента:");
            f=in.nextInt();
            idNumber [i] .setKurs(f);
            System.out.println("ведите Группу студента:");
            A=in.nextLine();
            A=in.nextLine();
            idNumber [i] .setGrupa(A);
            System.out.println("ведите Средний бал студента:");
            f=in.nextInt();
            idNumber [i] .setsrbal(f);
            A=in.nextLine();
        }
    }
    public void outArray() {
        int i;
        for(i=0;i<3;i++)
            System.out.println(idNumber[i] .getName()+" "+idNumber[i] .getSurename()+" "+idNumber[i] .getSpecialnost()+" "+idNumber[i] .getKurs()+" "+idNumber[i] .getGrupa()+" "+idNumber[i] .getSrbal());
    }
    @Override
    public void sortkurs()
    {
        int i;
        int p1,p2;
        String p3,p4,p5,p6;
        for(i=1;i<3;i++)
        {
            if(idNumber[i].getKurs()>idNumber[i-1].getKurs())
            {
                p1=idNumber[i].getKurs();
                p2=idNumber[i].getSrbal();
                p3=idNumber[i].getName();
                p4=idNumber[i].getSurename();
                p5=idNumber[i].getSpecialnost();
                p6=idNumber[i].getGrupa();

                idNumber[i].setKurs(idNumber[i-1].getKurs());
                idNumber[i].setSrbal(idNumber[i-1].getSrbal());
                idNumber[i].setName(idNumber[i-1].getName());
                idNumber[i].setSurename(idNumber[i-1].getSurename());
                idNumber[i].setSpecialnost(idNumber[i-1].getSpecialnost());
                idNumber[i].setGrupa(idNumber[i-1].getGrupa());

                idNumber[i-1].setKurs(p1);
                idNumber[i-1].setSrbal(p2);
                idNumber[i-1].setName(p3);
                idNumber[i-1].setSurename(p4);
                idNumber[i-1].setSpecialnost(p5);
                idNumber[i-1].setGrupa(p6);
                sortsrbal();
            }
        }
    }
    @Override
    public void sortsrbal()
    {
        int i;
        int p1,p2;
        String p3,p4,p5,p6;
        for(i=1;i<3;i++)
        {
            if(idNumber[i].getSrbal()>idNumber[i-1].getSrbal())
            {
                p1=idNumber[i].getKurs();
                p2=idNumber[i].getSrbal();
                p3=idNumber[i].getName();
                p4=idNumber[i].getSurename();
                p5=idNumber[i].getSpecialnost();
                p6=idNumber[i].getGrupa();

                idNumber[i].setKurs(idNumber[i-1].getKurs());
                idNumber[i].setSrbal(idNumber[i-1].getSrbal());
                idNumber[i].setName(idNumber[i-1].getName());
                idNumber[i].setSurename(idNumber[i-1].getSurename());
                idNumber[i].setSpecialnost(idNumber[i-1].getSpecialnost());
                idNumber[i].setGrupa(idNumber[i-1].getGrupa());

                idNumber[i-1].setKurs(p1);
                idNumber[i-1].setSrbal(p2);
                idNumber[i-1].setName(p3);
                idNumber[i-1].setSurename(p4);
                idNumber[i-1].setSpecialnost(p5);
                idNumber[i-1].setGrupa(p6);
                sortsrbal();
            }
        }
    }

    public static void main(String[] args)
    {
        int i;
        Tester m1 = new Tester();
        m1.setArray();
        m1.sortsrbal();
        //m1.sortkurs();
        m1.outArray();
    }
}
